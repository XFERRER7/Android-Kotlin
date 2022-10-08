package com.example.multigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class WordInverter2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_inverter2)

        val label = findViewById<TextView>(R.id.word)
        val btn = findViewById<Button>(R.id.buttonWord2)

        val word = intent.getStringExtra("word")

        label.text = word

        btn.setOnClickListener {
            val intent = Intent(this, WordInverter::class.java)
            startActivity(intent)
        }
    }
}