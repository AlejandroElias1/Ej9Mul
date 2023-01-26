package com.example.ej9mul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ej9mul.databinding.Activity2Binding

class Activity_3 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    }
fun into(binding: Activity2Binding) {


}