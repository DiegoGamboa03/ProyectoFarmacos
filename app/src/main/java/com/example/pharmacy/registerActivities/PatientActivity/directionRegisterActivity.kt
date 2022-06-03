package com.example.pharmacy.registerActivities.PatientActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.pharmacy.Pacientes
import com.example.pharmacy.R

class directionRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direction_register)
    }

    fun clickNextButton(view: View) {
       // var paciente: Pacientes = intent.getSerializableExtra("paciente") as Pacientes
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
           /* paciente.provincia = findViewById<EditText>(R.id.editTextProvince).toString()
            paciente.ciudad = findViewById<EditText>(R.id.editTextCity).toString()*/
            val intent = Intent(this, treatmentPlaceRegisterActivity::class.java)
            //intent.putExtra("paciente",paciente)

            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}