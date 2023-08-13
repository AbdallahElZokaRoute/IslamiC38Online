package com.route.isalmic38online.ui.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.WindowManager
import com.route.isalmic38online.R
import com.route.isalmic38online.ui.home.HomeActivity

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        startHomeActivity()
    }

    private fun startHomeActivity() {
        Handler(Looper.myLooper()!!).postDelayed({
         startActivity(Intent(this@SplashScreen,HomeActivity::class.java))
        },3000)
    }
}