package com.example.recyclerview_activity

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<ImageButton>(R.id.movieButton).setOnClickListener {
            startActivity(Intent(this, MovieActivity::class.java))
        }

        findViewById<ImageButton>(R.id.bookButton).setOnClickListener {
            startActivity(Intent(this, BookActivity::class.java))
        }

        findViewById<ImageButton>(R.id.performanceButton).setOnClickListener {
            startActivity(Intent(this, PerformanceActivity::class.java))
        }
    }
}
