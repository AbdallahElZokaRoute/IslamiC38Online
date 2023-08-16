package com.route.isalmic38online.ui.hadith_details_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.ui.Constants
import com.route.isalmic38online.databinding.ActivityHadithDetailsBinding

class HadithDetailsActivity : AppCompatActivity() {

    lateinit var binding : ActivityHadithDetailsBinding
    lateinit var adapter : HadithDetailsAdapter
    var title : String? =  null
    var hadith : Array<String> = arrayOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHadithDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = intent.getStringExtra(Constants.HADITH_TITLE)
        hadith = intent.getStringArrayExtra(Constants.HADITH_CONTENT) as Array<String>


      adapter = HadithDetailsAdapter(hadith)
      binding.content.hadithRv.adapter = adapter
        binding.content.hadithTitle.text = title


       binding.iconBack.setOnClickListener {
           onBackPressed()
       }

    }

}