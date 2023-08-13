package com.route.isalmic38online.Main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.route.isalmic38online.R
import com.route.isalmic38online.databinding.ActivityMainBinding
import com.route.isalmic38online.fragments.ProfileFragment
import com.route.isalmic38online.fragments.SebhaFragment
import com.route.isalmic38online.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {

    lateinit var profileTextView: TextView
    lateinit var settingsTextView: TextView
    lateinit var sebhaTextView: TextView
    lateinit var viewBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)
        profileTextView = viewBinding.profileTextView
        settingsTextView = viewBinding.settingsTextView
        sebhaTextView = viewBinding.sebhaTextView
        pushFragment(ProfileFragment())
        profileTextView.setOnClickListener {
            // Create profile Fragment
            // supportFragmentManager
            pushFragment(ProfileFragment())
        }

        //Activity Can't call Constructor
        // Whatsapp , Facebook
        settingsTextView.setOnClickListener {
            // Create Settings Fragment
            val settingsFragment = SettingsFragment()
            pushFragment(settingsFragment)
        }
        sebhaTextView.setOnClickListener {
            val sebhaFragment = SebhaFragment()
            pushFragment(sebhaFragment)
        }
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        if (supportFragmentManager.fragments.last() is ProfileFragment) {
//            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
//            finish()
//        }
//    }

    // Polymorphism
    fun pushFragment(fragment: Fragment) {
        /*if (fragment is ProfileFragment) {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }*/
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(android.R.anim.fade_in,android.R.anim.fade_out)
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()

    }
}