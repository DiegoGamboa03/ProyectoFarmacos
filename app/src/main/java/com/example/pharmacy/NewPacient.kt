package com.example.pharmacy

import android.R.array
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmacy.R


class NewPacient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_pacient)
        val array = arrayOf("Aqui", "Van", "Los distintos pacientes")
        var adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, array)
        var spinner = findViewById<Spinner>(R.id.spinnerPacient)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter

    }
}