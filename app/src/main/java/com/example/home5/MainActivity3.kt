package com.example.home5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val hot = findViewById<TextView>(R.id.star)
        hot.text = intent.getStringExtra(KLAS)
    }

    companion object {
        const val KLAS = "TO"
    }
}