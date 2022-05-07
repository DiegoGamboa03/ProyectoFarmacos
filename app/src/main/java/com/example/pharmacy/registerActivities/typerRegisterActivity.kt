package com.example.pharmacy.registerActivities

import android.content.Intent
import com.example.pharmacy.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class typerRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typer_register)
    }

    fun clickNextButton(view: View) {
        val spinner = findViewById<Spinner>(R.id.spinner)
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
            val intent = Intent(this, nameRegisterActivity::class.java)
            //Mandamos el tipo de usuario (Paciente o doctor) a la siguiente activity
            intent.putExtra("UserType",spinner.selectedItem.toString())
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}