package com.route.isalmic38online.ui.surah_details_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivitySurahDetailsScreenBinding
import com.route.isalmic38online.databinding.SurahDetailsContentBinding
import com.route.isalmic38online.ui.Constants

class SurahDetailsScreen : AppCompatActivity() {

    lateinit var binding : ActivitySurahDetailsScreenBinding
    lateinit var  adapter: SurahDetailsAdapter
    var surahName : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurahDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        surahName = intent.getStringExtra(Constants.SURAH_NAME_KEY)

        binding.iconBack.setOnClickListener {
         onBackPressed()
        }
        binding.detailsSurahName.text = surahName

        adapter = SurahDetailsAdapter(null)
        binding.content.versesRv.adapter = adapter
        readFileContents()
    }

     private fun readFileContents(){
         val fileContent = assets.open("$surahName.txt").bufferedReader().use { it.readText() }
         if(surahName.equals("التوبة")){
             binding.content.mainText.text = "أعوذ بالله من الشيطان الرجيم"
         }
          val verseList = fileContent.trim().split("\n")
         adapter.onUpdateData(verseList)

     }
}