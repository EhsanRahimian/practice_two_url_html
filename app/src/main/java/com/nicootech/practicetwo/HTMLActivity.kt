package com.nicootech.practicetwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nicootech.practicetwo.databinding.ActivityHtmlactivityBinding
import com.nicootech.practicetwo.databinding.ActivitySecondBinding

class HTMLActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHtmlactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHtmlactivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.htmlWeb.loadUrl("file:///android_asset/story.html")


    }
}