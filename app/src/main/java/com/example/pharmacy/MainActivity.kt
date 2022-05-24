package com.example.pharmacy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmacy.registerActivities.typerRegisterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickTextView(view: View) {
        val buttonClick = findViewById<TextView>(R.id.textView_signIn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, typerRegisterActivity::class.java)
            startActivity(intent)
        }
        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }

    fun clickLogInButton(view: View) {
        val buttonClick = findViewById<Button>(R.id.buttonNext)
        buttonClick.setOnClickListener {
            var editTextUsername = findViewById(R.id.editTextUsername) as EditText
            if(editTextUsername.getText().toString().equals("d")){ //En caso de que sea doctor
                val intent = Intent(this, DoctorPacientListActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
                    .show()
            }else{ //En caso de que sea paciente
                val intent = Intent(this, PatientMedicinesPatientView::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }
    /* Forma alternativa
    fun sendMessage(view: View?) {
        val intent = Intent(this, typerRegisterActivity::class.java)
        startActivity(intent)
    }*/
}