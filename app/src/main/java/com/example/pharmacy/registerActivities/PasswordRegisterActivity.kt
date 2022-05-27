package com.example.pharmacy.registerActivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.pharmacy.AppDataBase
import com.example.pharmacy.MainActivity
import com.example.pharmacy.Pacientes
import com.example.pharmacy.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PasswordRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password_register)
    }

    val database = AppDataBase.getDataBase(this)
    fun clickNextButton(view: View) {
        var paciente: Pacientes = intent.getSerializableExtra("paciente") as Pacientes

        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
            paciente.password = findViewById<EditText>(R.id.editTextSpeciality).toString()
            val intent = Intent(this, MainActivity::class.java)

            CoroutineScope(Dispatchers.IO).launch {
                database.pacientes().insertAll(paciente)
            }
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}