package com.example.pharmacy.registerActivities

import android.content.Intent
import com.example.pharmacy.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class typerRegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_typer_register)
    }

    fun clickNextButton(view: View) {
        /*val buttonClick = findViewById<TextView>(R.id.textView_signIn)
        buttonClick.setOnClickListener {
            val intent = Intent(this, typerRegisterActivity::class.java)
            startActivity(intent)
        }*/

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}