package com.example.home5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var editText: EditText
    private lateinit var yana2: EditText
    private lateinit var dad: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        editText = findViewById<EditText>(R.id.yana1)
        yana2 = findViewById<EditText>(R.id.yana2)
        dad = findViewById<EditText>(R.id.yana3)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_mein, menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.knopka1 -> {
                editText.setText("knopka1")
                val obrash = Intent(this, MainActivity1::class.java)
                obrash.putExtra(MainActivity1.MILA1, editText.text.toString())
                startActivity(obrash)
            }
            R.id.knopka2 -> {
                editText.setText("radius")
                val zet = Intent(this, MainActivity2::class.java)
                zet.putExtra(MainActivity2.CAR, editText.text.toString())
                startActivity(zet)
            }
            R.id.knopka3 -> {
                editText.setText("privet")
                val top = Intent(this, MainActivity3::class.java)
                top.putExtra(MainActivity3.KLAS, editText.text.toString())
                startActivity(top)


            }
        }
        return super.onOptionsItemSelected(item)
    }

}