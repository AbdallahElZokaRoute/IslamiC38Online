package com.route.isalmic38online.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.AdapterView.OnItemSelectedListener
import com.google.android.material.navigation.NavigationBarView
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivityHomeBinding
import com.route.isalmic38online.ui.home.tabs.hadith.HadithFragment
import com.route.isalmic38online.ui.home.tabs.quran.QuranFragment
import com.route.isalmic38online.ui.home.tabs.radio.RadioFragment
import com.route.isalmic38online.ui.home.tabs.tasbeh.TasbehFragment

class HomeActivity : AppCompatActivity() {
    lateinit var  binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.content.bottomNavBar.selectedItemId = R.id.navigation_quran

    }

}