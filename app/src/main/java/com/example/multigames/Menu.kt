package com.example.multigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btn1 = findViewById<ImageButton>(R.id.game1)
        val btn2 = findViewById<ImageButton>(R.id.game2)
        val btn3 = findViewById<ImageButton>(R.id.game3)
        val btn4 = findViewById<ImageButton>(R.id.game4)



        btn1.setOnClickListener {
            val intent = Intent(this, Jokenpo::class.java)
            startActivity(intent)

        }

        btn2.setOnClickListener {
            val intent = Intent(this, SecretCode::class.java)
            startActivity(intent)

        }

        btn3.setOnClickListener {
            val intent = Intent(this, WordInverter::class.java)
            startActivity(intent)

        }

        btn4.setOnClickListener {
            val intent = Intent(this, RandomWords::class.java)
            startActivity(intent)

        }


    }
}