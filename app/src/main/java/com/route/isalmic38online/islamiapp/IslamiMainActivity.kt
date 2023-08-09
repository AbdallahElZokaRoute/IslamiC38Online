package com.route.isalmic38online.islamiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.route.isalmic38online.R

class IslamiMainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView : BottomNavigationView
    var sebhaFragment:SephaFragment= SephaFragment()
    var hadethFragment:HadethFragment= HadethFragment()
    var quranFragment:QuranFragment= QuranFragment()
    var radioFragment:RadioFragment= RadioFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_islami_main)
        initViews()
    }

    private fun initViews(){
        bottomNavigationView=findViewById(R.id.bottom_navigation_view)
        bottomNavigationView.setOnItemSelectedListener {
            if(it.itemId==R.id.navigation_quran){
                pushFragment(quranFragment)

            }else if(it.itemId==R.id.navigation_hadeth){
                pushFragment(hadethFragment)

            }else if(it.itemId==R.id.navigation_sebha){
                pushFragment(sebhaFragment)

            }else if(it.itemId==R.id.navigation_radio){
                pushFragment(radioFragment)

            }
            return@setOnItemSelectedListener true
        }
    }

    private fun pushFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.islami_fragment_container,fragment)
            .commit()

    }
}