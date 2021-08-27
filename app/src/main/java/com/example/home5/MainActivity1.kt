package com.example.home5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        val gg = findViewById<TextView>(R.id.mila)
        gg.text = intent.getStringExtra(MILA1)
    }

    companion object {
        const val MILA1 = "FAK"
    }


}
