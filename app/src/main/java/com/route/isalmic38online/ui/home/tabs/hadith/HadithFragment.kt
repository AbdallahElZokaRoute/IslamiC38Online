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
    var  hadithList : ArrayList<Hadith> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHadithBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        readHadithFile()
        adapter = HadithAdapter(hadithList,this)
        binding.hadethRecyclerView.adapter = adapter
    }

    private fun readHadithFile() {
        val fileContent = requireActivity().assets.open("hadiths.txt").bufferedReader()
            .use { it.readText() }
        val fileContentList = fileContent.trim().split("#")

        fileContentList.forEach {
            val hadith = it.trim().split("\n")
            val title = hadith[0]

            hadithList.add(Hadith(title, hadith))

        }

    }

    override fun onHadithClick(item: Hadith?, position: Int) {
        val intent = Intent(requireActivity(),HadithDetailsActivity()::class.java)
        intent.putExtra(Constants.HADITH_TITLE,item?.title)
        intent.putExtra(Constants.HADITH_CONTENT,item?.hadithContent?.toTypedArray())
        startActivity(intent)
    }
}