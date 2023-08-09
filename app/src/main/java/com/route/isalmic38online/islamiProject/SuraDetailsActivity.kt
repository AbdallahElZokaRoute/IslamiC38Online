package com.route.isalmic38online.islamiProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.adapters.VersesAdapter

class SuraDetailsActivity : AppCompatActivity() {
    // 1- Clone
    // 2- Git -> Contribute for Specific Repository
    // 1- Sebha
    //      :-
    //      1- Fork Repository (Repo on Our Account)
    //      2- Clone (Local Device)
    //      3- Take a new branch from "feature/splash_home_screens"
    //      4- Develop Feature Sebha
    //      5- Commit and push the code
    //  Github
    //      6- Create a new Pull Request from your branch to my Repository Branch "AbdallahElZokaRoute @feature/splash_home_screens
    //
    var suraName: String? = null
    var suraPosition: Int? = null
    lateinit var suraNameText: TextView
    lateinit var adapter: VersesAdapter
    lateinit var backIcon: ImageView
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
        backIcon = findViewById(R.id.back_icon)
        backIcon.setOnClickListener {
            finish()
        }

    }

    private fun readFileContents() {
        // 2 seconds
        val fileContent = assets.open("$suraPosition.txt").bufferedReader().use { it.readText() }
        val versesList = fileContent.trim().split("\n") // بسم الله الرحمن الرحيم 0
        // الحمدلله رب العالمين 1

        adapter.updateData(versesList)
    }
}