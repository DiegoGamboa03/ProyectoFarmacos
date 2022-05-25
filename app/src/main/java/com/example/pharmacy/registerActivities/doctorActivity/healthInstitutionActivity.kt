package com.example.pharmacy.registerActivities.doctorActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.pharmacy.MainActivity
import com.example.pharmacy.R
import com.example.pharmacy.registerActivities.PasswordRegisterActivity

class healthInstitutionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_institution)
    }

    fun clickNextButton(view: View) {
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
            val intent = Intent(this, PasswordRegisterActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}