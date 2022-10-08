package com.example.multigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.doOnTextChanged

class WordInverter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_word_inverter)

        val btnBack = findViewById<Button>(R.id.btnBackWordInverter)
        val btnInvert = findViewById<Button>(R.id.btnInvert)
        val input = findViewById<EditText>(R.id.etWordInverter)

        btnInvert.setOnClickListener {

            val word = input.text
            val invertedWord = word.reversed()
            val intent = Intent(this, WordInverter2::class.java)
            intent.putExtra("word", invertedWord)
            startActivity(intent)

        }


        btnBack.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }


    }
}