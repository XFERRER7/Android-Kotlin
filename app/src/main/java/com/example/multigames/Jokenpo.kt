package com.example.multigames

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.blue
import kotlin.random.Random

class Jokenpo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jokenpo)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnPapel = findViewById<ImageButton>(R.id.btnPapel)
        val btnPedra = findViewById<ImageButton>(R.id.btnPedra)
        val btnTesoura = findViewById<ImageButton>(R.id.btnTesoura)
        val ivComp = findViewById<ImageView>(R.id.ivComp)
        val btnBack = findViewById<Button>(R.id.btnBackJokenpo)

        btnBack.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }



        ivComp.visibility = View.GONE
        btnPapel.setOnClickListener {
            btnPapel.setBackgroundColor(R.style.Theme_MultiGames.blue)
            tvResult.text = joga(0)
        }
        btnPedra.setOnClickListener {
            tvResult.text = joga(1)
        }
        btnTesoura.setOnClickListener {
            tvResult.text = joga(2)
        }
    }

    @SuppressLint("UseCompatLoadingForDrawables")
    fun joga(num: Int): String {

        val ivComp = findViewById<ImageView>(R.id.ivComp)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        ivComp.visibility = View.VISIBLE
        val comp = Random.nextInt(3)
        var end: String = ""
        Log.d("Jogo comp: ", comp.toString())
        when (comp) {
            0 -> ivComp.setImageDrawable(getDrawable(R.drawable.papel))
            1 -> ivComp.setImageDrawable(getDrawable(R.drawable.pedra))
            2 -> ivComp.setImageDrawable(getDrawable(R.drawable.tesoura))
        }
        if (comp == num) {
            end = "Empatou"
            tvResult.setTextColor(Color.GRAY)
        } else if ((comp == 0 && num == 1) || (comp == 1 && num == 2) || (comp == 2 && num == 0)) {
            end = "Perdeu"
            tvResult.setTextColor(Color.RED)
        } else {
            end = "Ganhou"
            tvResult.setTextColor(Color.GREEN)
        }
        return end

    }
}