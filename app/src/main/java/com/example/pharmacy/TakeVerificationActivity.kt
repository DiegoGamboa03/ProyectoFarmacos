package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.pharmacy.registerActivities.PatientActivity.treatmentPlaceRegisterActivity

class TakeVerificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_verification)
        val textViewTakeVerification = findViewById<TextView>(R.id.textViewTakeVerification)
        textViewTakeVerification.visibility
    }

    fun clickNoButton(view: View) {
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNo)
        buttonClick.setOnClickListener {
            val intent = Intent(this, TakeVerificationNoAnswerActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }

    fun clickYesButton(view: View) {
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonYes)
        buttonClick.setOnClickListener {
            val intent = Intent(this, TakeVerificationYesAnswerActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}