package com.androidbros.onlinetabu

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.androidbros.onlinetabu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            throw RuntimeException("Test Crash")
        }
    }

}