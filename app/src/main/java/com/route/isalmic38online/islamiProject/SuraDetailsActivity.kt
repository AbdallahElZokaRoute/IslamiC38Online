package com.route.isalmic38online.islamiProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.adapters.VersesAdapter

class SuraDetailsActivity : AppCompatActivity() {
    var suraName: String? = null
    var suraPosition: Int? = null
    lateinit var suraNameText: TextView
    lateinit var adapter: VersesAdapter
    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sura_details)
        suraNameText = findViewById(R.id.sura_name_text)
        suraName = intent.getStringExtra(Constants.SURA_NAME_KEY)
        suraPosition = intent.getIntExtra(Constants.SURA_POSITION_KEY, 1)
        recyclerView = findViewById(R.id.verses_recycler_view)
        suraNameText.text = suraName
        adapter = VersesAdapter(null)
        recyclerView.adapter = adapter
        readFileContents()

    }

    private fun readFileContents() {
        // 2 seconds
        val fileContent = assets.open("$suraPosition.txt").bufferedReader().use { it.readText() }
        val versesList = fileContent.trim().split("\n") // بسم الله الرحمن الرحيم 0
        // الحمدلله رب العالمين 1

        adapter.updateData(versesList)
    }
}