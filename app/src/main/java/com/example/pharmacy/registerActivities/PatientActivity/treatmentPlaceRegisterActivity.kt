package com.example.pharmacy.registerActivities.PatientActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.pharmacy.Pacientes
import com.example.pharmacy.R
import com.example.pharmacy.registerActivities.PasswordRegisterActivity

class treatmentPlaceRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_treatment_place_register)
    }

    fun clickNextButton(view: View) {
        //var paciente: Pacientes = intent.getSerializableExtra("paciente") as Pacientes

        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
           // paciente.hospital = findViewById<EditText>(R.id.editTextTextPersonName).toString()
            val intent = Intent(this, PasswordRegisterActivity::class.java)
            //intent.putExtra("paciente",paciente)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}