package com.example.pharmacy

import android.R.array
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmacy.R


class NewPacient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_pacient)
        val array = arrayOf("Pacientes disponibles","Aqui", "Van", "Los distintos pacientes")
        var adapter = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, array)
        var spinner = findViewById<Spinner>(R.id.spinnerPacient)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
    }

    fun clickNextButton(view: View) {
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNextNewPacient)
        buttonClick.setOnClickListener {
            val intent = Intent(this, DoctorPacientListActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}