package com.route.isalmic38online.ui.surah_details_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.ui.Constants
import com.route.isalmic38online.databinding.ActivitySurahDetailsScreenBinding

class SurahDetailsScreen : AppCompatActivity() {

    lateinit var binding : ActivitySurahDetailsScreenBinding
    lateinit var  adapter: SurahDetailsAdapter
    var surahName : String? = null
    var verseList : MutableList<String> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySurahDetailsScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initParams()

        binding.iconBack.setOnClickListener {
         onBackPressed()
        }

        initViews()
        readFileContents()
        bindVerses()

    }

    private fun initViews(){
        binding.detailsSurahName.text = surahName
    }

    private fun initParams(){
        surahName = intent.getStringExtra(Constants.SURAH_NAME_KEY)
    }

    private fun bindVerses(){
        adapter = SurahDetailsAdapter(verseList)
        binding.content.versesRv.adapter = adapter
    }

     private fun readFileContents(){
         val fileContent = assets.open("$surahName.txt").bufferedReader().use { it.readText() }

         if(surahName.equals("التوبة")){
             binding.content.mainText.text = "أعوذ بالله من الشيطان الرجيم"
         }

           verseList = fileContent.trim().split("\n") as MutableList<String>


     }
}