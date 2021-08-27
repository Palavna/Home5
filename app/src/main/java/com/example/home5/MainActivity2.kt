package com.example.home5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val one = findViewById<TextView>(R.id.ira)
        one.text = intent.getStringExtra(CAR)

    }

    companion object {
        const val CAR = "TEKST"
    }
}