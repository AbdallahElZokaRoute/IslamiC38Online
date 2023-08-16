package com.route.isalmic38online.ui.hadith_details_screen

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.ui.Constants
import com.route.isalmic38online.databinding.ActivityHadithDetailsBinding
import com.route.isalmic38online.ui.home.tabs.hadith.Hadith

class HadithDetailsActivity : AppCompatActivity() {

    lateinit var binding : ActivityHadithDetailsBinding
    var title : String? =  null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHadithDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
        initParams()
        onBindHadith()


    }

    private fun initViews(){
        binding.iconBack.setOnClickListener {
            onBackPressed()
        }
    }
    private fun onBindHadith(){
    binding.content.hadithTitle.text = hadith?.title
    binding.content.hadithContent.text = hadith?.hadithContent
    }


     var hadith : Hadith? = null
    private fun initParams(){
        title = intent.getStringExtra(Constants.HADITH_TITLE)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            hadith = intent.getParcelableExtra(Constants.HADITH_CONTENT,Hadith::class.java)
        }else{
            hadith = intent.getParcelableExtra(Constants.HADITH_CONTENT)
        }
    }

}