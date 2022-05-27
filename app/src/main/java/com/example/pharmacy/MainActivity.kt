package com.example.pharmacy

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.pharmacy.registerActivities.typerRegisterActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*------BASE DE DATOS--------*/
        var listaPacientes = emptyList<Pacientes>()

       /* val database = AppDataBase.getDataBase(this)
        database.pacientes().getAll().observe(this, Observer {
            listaPacientes = it
        })*/
        /*-----------------------------------*/
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
                val intent = Intent(this, TakeVerificationNoAnswerActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
                    .show()
            }
        }
    }

    /*----------------Volley--------------*/
/*
    val textView = findViewById<TextView>(R.id.textView)
    // ...

    // Instantiate the RequestQueue.
    val queue = Volley.newRequestQueue(this)
    val url = "http://www.google.com"

    val jsonObjectRequest = JsonObjectRequest(Request.Method.GET, url, null,
        Response.Listener { response ->
            textView.text = "Response: %s".format(response.toString())
        },
        Response.ErrorListener { error ->
            // TODO: Handle error
        }
    )

    // Request a string response from the provided URL.
    val stringRequest = StringRequest(
        Request.Method.GET, url,
        Response.Listener<String> { response ->
            // Display the first 500 characters of the response string.
            textView.text = "Response is: ${response.substring(0, 500)}"
        },
        Response.ErrorListener { textView.text = "That didn't work!" })

    // Add the request to the RequestQueue.
    //queue.add(stringRequest)
*/
    /*-----------------------------------------------------*/


    /* Forma alternativa
    fun sendMessage(view: View?) {
        val intent = Intent(this, typerRegisterActivity::class.java)
        startActivity(intent)
    }*/
}