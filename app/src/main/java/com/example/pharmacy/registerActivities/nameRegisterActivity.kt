package com.example.pharmacy.registerActivities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmacy.Pacientes
import com.example.pharmacy.R
import com.example.pharmacy.registerActivities.PatientActivity.genreActivity
import com.example.pharmacy.registerActivities.doctorActivity.specialityRegisterActivity


class nameRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_register)
    }

    fun clickNextButton(view: View) {
        //se recibe el tipo de usuario de la activity anterior
        var profileName=intent.getStringExtra("UserType")
        if(profileName.equals("Paciente")){ //En caso de ser un paciente
            val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
            buttonClick.setOnClickListener {
                /*-----Datos de la BD-------*/
                /*val cedula =  findViewById<EditText>(R.id.editTextCedula).toString()
               val nombre1 = findViewById<EditText>(R.id.editTextName2).toString()
               val nombre2 = findVi ewById<EditText>(R.id.editTextSecondText).toString()
               val apellido1 = findViewById<EditText>(R.id.editTextLastName).toString()
               val apellido2 = findViewById<EditText>(R.id.editTextSecondSurname).toString()

               val paciente = Pacientes("",nombre1,nombre2,apellido1,apellido2,
                   0,' ',"","","","",cedula)
               intent.putExtra("paciente",paciente)*/
                val intent = Intent(this, genreActivity::class.java)


                startActivity(intent)
            }
        }else{//En caso de ser doctor
            val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
            buttonClick.setOnClickListener {
                val intent = Intent(this, specialityRegisterActivity::class.java)

                startActivity(intent)
            }
        }
        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}