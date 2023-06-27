package com.example.e_commerce.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.e_commerce.R
import com.example.e_commerce.base.Base
import com.example.e_commerce.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var bindind:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_home)
        bindind=DataBindingUtil.setContentView(this,R.layout.activity_home)
    }
}