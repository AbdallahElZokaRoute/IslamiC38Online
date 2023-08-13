package com.route.isalmic38online.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.isalmic38online.Main.MainActivity
import com.route.isalmic38online.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        startMainActivity()
    }

    private fun startMainActivity() {
        Handler(Looper.getMainLooper()).postDelayed({
            val intent: Intent = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(intent)
        },2000)
    }
}