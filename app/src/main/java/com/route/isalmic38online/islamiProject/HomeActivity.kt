package com.route.isalmic38online.islamiProject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.fragments.HadethFragment
import com.route.isalmic38online.islamiProject.fragments.QuranFragment
import com.route.isalmic38online.islamiProject.fragments.RadioFragment
import com.route.isalmic38online.islamiProject.fragments.SebhaFragment

class HomeActivity : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initViews()
    }

    private fun initViews() {
        bottomNavigationView = findViewById(R.id.islami_bottom_navigation_view)
        bottomNavigationView.setOnItemSelectedListener {
            if (it.itemId == R.id.navigation_quran) {
                pushFragment(QuranFragment())
            } else if (it.itemId == R.id.navigation_hadeth) {
                pushFragment(HadethFragment())
            } else if (it.itemId == R.id.navigation_sebha) {
                pushFragment(SebhaFragment())
            } else if (it.itemId == R.id.navigation_radio) {
                pushFragment(RadioFragment())
            }
            return@setOnItemSelectedListener true
        }
        bottomNavigationView.selectedItemId = R.id.navigation_quran
    }

    private fun pushFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.islami_fragment_container, fragment)
            .commit()
    }
}