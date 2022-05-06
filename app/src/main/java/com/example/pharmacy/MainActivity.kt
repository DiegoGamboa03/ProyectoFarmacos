package com.example.pharmacy

import android.content.Intent
import android.os.Bundle
import android.view.View
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

    }
    /* Forma alternativa
    fun sendMessage(view: View?) {
        val intent = Intent(this, typerRegisterActivity::class.java)
        startActivity(intent)
    }*/
}