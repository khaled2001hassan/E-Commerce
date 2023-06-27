package com.example.e_commerce.base

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

open class Base<b:ViewDataBinding,v:ViewModel>: AppCompatActivity() {
    lateinit var binding: b
    lateinit var viewModel: v
}