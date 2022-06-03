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
import com.android.volley.*
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.JsonRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.pharmacy.registerActivities.typerRegisterActivity
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import org.json.JSONTokener

class MainActivity : AppCompatActivity(), Response.Listener<Any?>, Response.ErrorListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*------BASE DE DATOS--------*/
        //var listaPacientes = emptyList<Pacientes>()

       /* val database = AppDataBase.getDataBase(this)
        database.pacientes().getAll().observe(this, Observer {
            listaPacientes = it
        })*/
        /*-----------------------------------*/
    }

    var rq : RequestQueue? = null
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
        rq = Volley.newRequestQueue(applicationContext)
        buttonClick.setOnClickListener {
            var editTextUsername = findViewById(R.id.editTextUsername) as EditText
            var editTextPWD = findViewById(R.id.editTextPassword) as EditText
            iniciarSesion(editTextUsername, editTextPWD);
            /*if(editTextUsername.getText().toString().equals("d")){ //En caso de que sea doctor
                val intent = Intent(this, DoctorPacientListActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
                    .show()
            }else{ //En caso de que sea paciente
                val intent = Intent(this, TakeVerificationNoAnswerActivity::class.java)
                startActivity(intent)
                Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
                    .show()
            }*/
        }
    }

    private fun iniciarSesion(
        cedula: EditText,
        password: EditText
       // rq: RequestQueue
    ){
        val url = "https://192.168.0.110/login/sesion.php?cedula=" + cedula.text.toString() +
                "&password=" + password.text.toString()
        var jrq = object : JsonRequest<Any?>(Method.GET, url, null, this, this){
            override fun parseNetworkResponse(response: NetworkResponse?): Response<Any?> {
                TODO("Not yet implemented")
            }
        }
        rq?.add(jrq)
    }

    fun onResponse(response: JSONObject) {

    }

    override fun onErrorResponse(error: VolleyError?) {
        Toast.makeText(applicationContext, "No se encontró usuario", Toast.LENGTH_LONG)
            .show()
    }

    override fun onResponse(response: Any?) {
        TODO("Not yet implemented")
        val response2: JSONArray = response as JSONArray
        Toast.makeText(applicationContext, "Se encontró usuario", Toast.LENGTH_LONG)
            .show()
        val paciente:Pacientes = Pacientes()

        val jsonArray: JSONArray = response2.optJSONArray(0)

        var jsonObject: JSONObject? = null
        jsonObject = jsonArray.getJSONObject(0);

        paciente.nombre1 = jsonObject.optString("nombre1")

        try{
            jsonObject = jsonArray.getJSONObject(0)
            paciente.nombre1 = jsonObject.optString("nombre1")
            paciente.apellido1 = jsonObject.optString("apellido1")
        }catch (e:JSONException){
            e.printStackTrace()
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



