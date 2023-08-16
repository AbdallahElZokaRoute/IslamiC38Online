package com.route.isalmic38online.ui.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.ContactsContract.Contacts
import android.provider.SyncStateContract.Constants
import android.view.WindowManager
import androidx.appcompat.app.AppCompatDelegate
import com.route.isalmic38online.ui.home.HomeActivity
import com.route.isalmic38online.R
import com.route.isalmic38online.core.local_data_source.AppSharedReferences

class SplashScreen : AppCompatActivity() {
    var nightMode :  Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        initParams()
        isNightMode()
        startHomeActivity()

    }

    private fun initParams(){
        nightMode = AppSharedReferences.read(com.route.isalmic38online.ui.Constants.NIGHT_MODE,false)
    }
    private fun isNightMode(){
        if(nightMode){
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }else{
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        }
    }
    private fun startHomeActivity() {
        Handler(Looper.myLooper()!!).postDelayed({
         startActivity(Intent(this@SplashScreen,HomeActivity::class.java))
            finish()
        },3000)

    }


}