package com.example.ej9mul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.ej9mul.databinding.ActivityMainBinding

private lateinit var botnCont: Button
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        camImage(binding)
        botnCont = findViewById(R.id.continuar)

        botnCont.setOnClickListener {
            val intent = android.content.Intent(this, Activity_2::class.java)
            startActivity(intent)
        }
    }
}

fun camImage(binding: ActivityMainBinding){
    binding.guerrero.setOnClickListener {
        binding.imageView.setImageResource(R.drawable.guerrero)
    }
    binding.mago.setOnClickListener {
        binding.imageView.setImageResource(R.drawable.mago)
    }
    binding.clerigo.setOnClickListener {
        binding.imageView.setImageResource(R.drawable.clerigo)
    }
    binding.ladron.setOnClickListener {
        binding.imageView.setImageResource(R.drawable.ladron)
    }
}