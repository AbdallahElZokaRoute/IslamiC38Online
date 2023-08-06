package com.route.isalmic38online.islamiProject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.route.isalmic38online.R

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // 1- Splash Screen => Home Activity
        // 2- onBack Pressed , returns to Splash Activity
        // Communicate With Main Thread ->  2 Seconds ->
        //2.5 Secs
        // anonymous function -> Kotlin
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }, 2500)
    }
}