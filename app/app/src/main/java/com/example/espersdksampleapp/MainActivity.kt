package com.example.espersdksampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.espersdksampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView()
    }

    private fun setContentView() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}