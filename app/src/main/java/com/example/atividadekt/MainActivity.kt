package com.example.atividadekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import com.google.android.material.textfield.TextInputEditText
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Constantes

        val list = findViewById<ListView>(R.id.listView)

        val buttonAdd = findViewById<Button>(R.id.add)

        val inputAdd = findViewById<EditText>(R.id.input)

        val btnCrescente = findViewById<Button>(R.id.crescente)

        val btnDecrescente = findViewById<Button>(R.id.descrescente)

        val btnEmbaralhado = findViewById<Button>(R.id.embaralhado)







        //Adapter

        val itens = mutableListOf<String>("HTML", "CSS", "JavaScript", "Typescript", "Node", "Styled-components")

        var arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
            this, android.R.layout.simple_list_item_1, itens
        )

        list.adapter = arrayAdapter






        //Funções

        //Ordena a lista em crescente
        btnCrescente.setOnClickListener {
            itens.sort()
            list.adapter = arrayAdapter
        }

        //Ordena a lista em decrescente
        btnDecrescente.setOnClickListener {
            itens.reverse()
            list.adapter = arrayAdapter
        }

        //Remove a ordem da lista
        btnEmbaralhado.setOnClickListener {
            itens.shuffle()
            list.adapter = arrayAdapter
        }

        //Adiciona item digitado na listView
        buttonAdd.setOnClickListener {
            var typedValue = inputAdd.text.toString()
            itens.add(typedValue)

            list.adapter = arrayAdapter

            inputAdd.text.clear()

        }


    }
}