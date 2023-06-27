package com.example.e_commerce.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.e_commerce.R
import com.example.e_commerce.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
Handler().postDelayed(
    {
        val intent=Intent(this,HomeActivity::class.java)
        startActivity(intent)
    },100
)
    }
}