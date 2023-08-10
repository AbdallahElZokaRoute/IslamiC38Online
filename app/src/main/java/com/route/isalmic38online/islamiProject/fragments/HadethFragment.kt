package com.route.isalmic38online.islamiProject.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.Constants
import com.route.isalmic38online.islamiProject.HadethDetailsActivity
import com.route.isalmic38online.islamiProject.adapters.HadethAdapter
import com.route.isalmic38online.islamiProject.adapters.OnHadethClickListener
import com.route.isalmic38online.islamiProject.data.HadethData

class HadethFragment : Fragment() {
    // Isalmi :- Hadeth Screen - 2- Hadeth Details Screen ,
    // Light or Dark Mode
    // Save values to storage (SharedPreference)


    // Fork - Clone


    // Fork ->  Copy Repository to my Github Account

    // Clone -> Copy Repository to my Local Device (Laptop )
    lateinit var hadethRecyclerView: RecyclerView
    lateinit var adapter: HadethAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_hadeth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        hadethRecyclerView = view.findViewById(R.id.hadeth_recycler_view)
        adapter = HadethAdapter(null)
        adapter.onHadethClickListener = object : OnHadethClickListener {
            override fun onHadethOnClick(hadethData: HadethData, position: Int) {
                val intent = Intent(requireActivity(), HadethDetailsActivity::class.java)
                intent.putExtra(Constants.HADETH_NAME_KEY, hadethData.title)
                intent.putExtra(
                    Constants.HADETH_CONTENT_KEY,
                    hadethData.hadethContent?.toTypedArray()
                )
                startActivity(intent)
            }
        }
        // read From Ahadeth.txt file
        readHadethFile()
        hadethRecyclerView.adapter = adapter
    }

    val ahadethObjectsList = mutableListOf<HadethData>()
    private fun readHadethFile() {
        val fileContent = requireActivity().assets.open("ahadeth.txt").bufferedReader()
            .use { it.readText() }
        val ahadethList = fileContent.trim().split("#")

//        for (it in ahadethList) {
//
//        }
        ahadethList.forEach {
            val hadeth = it.trim().split("\n")
            val title = hadeth.get(0)
            val content = hadeth
            ahadethObjectsList.add(HadethData(title, content))
        }
        adapter.updateData(ahadethObjectsList)


    }


}
