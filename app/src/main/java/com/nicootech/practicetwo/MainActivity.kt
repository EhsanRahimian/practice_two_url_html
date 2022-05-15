package com.nicootech.practicetwo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.nicootech.practicetwo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener {
            val inputURL = binding.editText.text.toString()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("myUrl",inputURL)
            startActivity(intent)
        }

        binding.htmlButton.setOnClickListener {
            val intent2 = Intent(this@MainActivity, HTMLActivity::class.java)
            startActivity(intent2)
        }

    }



}