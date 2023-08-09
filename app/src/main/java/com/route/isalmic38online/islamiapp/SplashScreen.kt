package com.route.isalmic38online.islamiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.route.isalmic38online.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed({
            var intent = Intent(this@SplashScreen,IslamiMainActivity::class.java)
            startActivity(intent)
            finish()
        },3000)

    }
}