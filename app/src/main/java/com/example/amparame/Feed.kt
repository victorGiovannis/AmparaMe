package com.example.amparame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Feed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feed)
        supportActionBar?.hide()
    }
}