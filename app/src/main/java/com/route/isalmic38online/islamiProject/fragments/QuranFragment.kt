package com.route.isalmic38online.islamiProject.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.Constants
import com.route.isalmic38online.islamiProject.SuraDetailsActivity
import com.route.isalmic38online.islamiProject.adapters.OnSuraClickListener
import com.route.isalmic38online.islamiProject.adapters.SuraNamesAdapter
import com.route.isalmic38online.islamiProject.data.SuraNameData
import com.route.isalmic38online.islamiProject.data.arSuras

class QuranFragment : Fragment() {
    lateinit var recyclerView: RecyclerView
    lateinit var suraNamesAdapter: SuraNamesAdapter
    lateinit var switchModeButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflater -> inflate
        return inflater.inflate(R.layout.fragment_quran, container, false)
    }

    lateinit var suraNames: ArrayList<SuraNameData>
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view.findViewById(R.id.sura_names_recycler_View)
        suraNames = ArrayList()
        for (i in 0 until arSuras.size) {
            val suraObject = SuraNameData(name = arSuras.get(i), position = i + 1)
            suraNames.add(suraObject)
        }
        arSuras.mapIndexed { index, it ->
            SuraNameData(name = it, position = index + 1)
        }
        suraNamesAdapter = SuraNamesAdapter(suraNames)
        suraNamesAdapter.onSuraClickListener = object : OnSuraClickListener {
            override fun onSuraClick(suraNameData: SuraNameData) {
                val intent = Intent(requireActivity(), SuraDetailsActivity::class.java)
                intent.putExtra(Constants.SURA_NAME_KEY, suraNameData.name)
                intent.putExtra(Constants.SURA_POSITION_KEY, suraNameData.position)
                startActivity(intent)
            }
        }
        recyclerView.adapter = suraNamesAdapter
        switchModeButton = view.findViewById(R.id.switch_mode_button)
        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            switchModeButton.text = "Light Mode"
        } else {
            switchModeButton.text = "Dark Mode"
        }
        switchModeButton.setOnClickListener {
            if (switchModeButton.text.toString() == "Dark Mode") {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else if (switchModeButton.text.toString() == "Light Mode") {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }

        }
    }

}
