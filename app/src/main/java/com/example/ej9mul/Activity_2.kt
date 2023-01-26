package com.example.ej9mul

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ej9mul.databinding.Activity2Binding


class Activity_2 : AppCompatActivity() {
    lateinit var binding: Activity2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= Activity2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.continuar.setOnClickListener(){
            val intent = Intent(this, Activity_3::class.java)
            startActivity(intent)
        }
        camImage(binding)
    }

    fun camImage(binding: Activity2Binding){
        binding.elfo.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.elfo)
        }
        binding.humano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.humano)
        }
        binding.enano.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.enano)
        }
        binding.goblin.setOnClickListener {
            binding.imageView.setImageResource(R.drawable.goblin)
        }



    }
}