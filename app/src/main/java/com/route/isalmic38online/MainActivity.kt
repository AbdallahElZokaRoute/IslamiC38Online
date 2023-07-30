package com.route.isalmic38online

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.route.isalmic38online.fragments.ProfileFragment
import com.route.isalmic38online.fragments.SettingsFragment

class MainActivity : AppCompatActivity() {
    // 1- Fragments (Fragments)
    // Whatsapp (3 Tabs) -> Chats - Updates - Calls ()
    // Facebook (Home - Friend Requests - Videos - SideMenu)
    // 2- VCS (Version Control System) "Git" (Software Development) Git (Version Control Systems)

        // Large-Scale Project  "5 Developers" ->
    // 1- Team Work
    // 2- Saves Your code and its changes
    // 3- Android Studio -> GUI ->

    // Does Project know it's files ?

    lateinit var profileTextView: TextView
    lateinit var settingsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        profileTextView = findViewById(R.id.profile_text_view)
        settingsTextView = findViewById(R.id.settings_text_view)
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
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (supportFragmentManager.fragments.last() is SettingsFragment) {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
            finish()
        }
    }

    // Polymorphism
    fun pushFragment(fragment: Fragment) {
        /*if (fragment is ProfileFragment) {
            supportFragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        }*/
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()

    }
}