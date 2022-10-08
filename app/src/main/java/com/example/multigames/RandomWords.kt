package com.example.multigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlin.random.Random

class RandomWords : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_words)

        val btnBack = findViewById<Button>(R.id.btnBackRandomWord)
        val btnRandom = findViewById<Button>(R.id.btnRandom)
        val label = findViewById<TextView>(R.id.wordRandom)
        val list = findViewById<ListView>(R.id.lvRandom)
        val buttonAdd = findViewById<Button>(R.id.btnAddRandom)
        val input = findViewById<EditText>(R.id.inputRandom)

        val itens = mutableListOf<String>()
        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, itens
        )
        list.adapter = arrayAdapter

        buttonAdd.setOnClickListener {
            val strEmpty = "aaa"
            itens.add(input.text.toString())
            list.adapter = arrayAdapter
            input.text.clear()
        }

        btnRandom.setOnClickListener {

            var number = (0..9).shuffled().last()

            when (number) {
                1 -> label.text = itens[number]
                2 -> label.text = itens[number]
                3 -> label.text = itens[number]
                4 -> label.text = itens[number]
                5 -> label.text = itens[number]
                6 -> label.text = itens[number]
                7 -> label.text = itens[number]
                8 -> label.text = itens[number]
                9 -> label.text = itens[number]
                10 -> label.text = itens[number]
                else -> label.text = itens[1]

            }
            list.adapter = arrayAdapter
        }


















        btnBack.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }

    }


}