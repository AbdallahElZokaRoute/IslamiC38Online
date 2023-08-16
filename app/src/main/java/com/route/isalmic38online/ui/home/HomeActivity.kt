package com.route.isalmic38online.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.route.isalmic38online.ui.home.tabs.hadith.HadithFragment
import com.route.isalmic38online.ui.home.tabs.quran.QuranFragment
import com.route.isalmic38online.ui.home.tabs.radio.RadioFragment
import com.route.isalmic38online.ui.home.tabs.tasbeh.TasbehFragment
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var  binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        btmNavBarOnItemClick()
        initViews()

    }

    private fun initViews(){
        binding.content.bottomNavBar.selectedItemId = R.id.navigation_quran
    }

    private fun btmNavBarOnItemClick(){
        binding.content.bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_quran -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, QuranFragment())
                        .commit()
                }

                R.id.navigation_hadith -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, HadithFragment())
                        .commit()
                }

                R.id.navigation_radio -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, RadioFragment())
                        .commit()
                }

                R.id.navigation_sebha -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, TasbehFragment())
                        .commit()
                }
            }

            true
        }
    }

}