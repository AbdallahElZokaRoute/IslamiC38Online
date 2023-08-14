package com.route.isalmic38online.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.navigation.NavigationBarView
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivityMainBinding
import com.route.isalmic38online.fragments.HadethFragment
import com.route.isalmic38online.fragments.QuranFragment
import com.route.isalmic38online.fragments.RadioFragment
import com.route.isalmic38online.fragments.SebhaFragment

class MainActivity : AppCompatActivity() {
    lateinit var radioFragment: RadioFragment
    lateinit var profileTextView: TextView
    lateinit var settingsTextView: TextView
    lateinit var sebhaTextView: TextView
    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.content.bottomNavBar.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.quran_nav -> {
                    showTapFragment(QuranFragment())
                }

                R.id.hadeth_nav -> {
                    showTapFragment(HadethFragment())
                }

                R.id.sebha_nav -> {
                    showTapFragment(SebhaFragment())
                }

                R.id.radio_nav -> {
                    showTapFragment(RadioFragment())
                }
            }
            true
        }
        viewBinding.content.bottomNavBar.selectedItemId = R.id.quran_nav
    }
    private fun showTapFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
        }

}