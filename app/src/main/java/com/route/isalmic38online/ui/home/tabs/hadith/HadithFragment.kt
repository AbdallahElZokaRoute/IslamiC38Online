package com.route.isalmic38online.ui.home.tabs.hadith

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.route.isalmic38online.ui.Constants
import com.route.isalmic38online.ui.hadith_details_screen.HadithDetailsActivity
import com.route.isalmic38online.databinding.FragmentHadithBinding

class HadithFragment : Fragment() , OnHadithClickListener{

   lateinit var binding : FragmentHadithBinding
   lateinit var adapter : HadithAdapter
    var  hadithList : MutableList<Hadith> = mutableListOf()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHadithBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onStart() {
        super.onStart()
        readHadithFile()
        bindHadithList()
    }
    private fun initViews(){
        adapter = HadithAdapter(null,this)
        binding.hadethRecyclerView.adapter = adapter

    }

    private fun bindHadithList(){
        adapter.bindItems(hadithList)
    }


//activity? nullable m3nah en momken fragment myb2ash leha activity
//enta lma tb2a fe  backStack lma yt3mlha replace fa tst5dm activity? bdl requireActivity
//requireActivity() tstdmha lma tb2a mot2kd en life cycler mazbota wa tb2a mor2kd
// en el fragment zhra tb ht2kd mnen enha zhra fel onStart() mesh onViewCreated()
// 3shan onViewCreated (momken el view ytcreate bs myt3mlosh attach) btsht8l el awl b3d keda onStart()
//start y3ni zhrt 100%
//islami-git-part2 00:55:44

    private fun readHadithFile() {
        val fileContent = requireActivity().assets.open("hadiths.txt").bufferedReader()
            .use { it.readText() }
        val fileContentList = fileContent.trim().split("#")

        fileContentList.forEach {
            val lines = it.trim().split("\n")
            val title = lines[0]
            val content = lines.joinToString("\n")
            val hadith = Hadith(title, content)
            hadithList.add(hadith)
        }

    }

    override fun onHadithClick(item: Hadith?, position: Int) {
        val intent = Intent(requireActivity(),HadithDetailsActivity()::class.java)
        intent.putExtra(Constants.HADITH_TITLE,item?.title)
        intent.putExtra(Constants.HADITH_CONTENT,item)
        startActivity(intent)
    }
}