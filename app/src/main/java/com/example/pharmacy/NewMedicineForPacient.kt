package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.example.pharmacy.registerActivities.PatientActivity.birthdateRegisterActivity

class NewMedicineForPacient : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_medicine_for_pacient)

        //Spinner de presentacion
        val arrayPresentation = arrayOf("Tabletas","Ampollas", "Comprimidos", "Suspension")
        var adapterPresentation = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, arrayPresentation)
        var spinnerPresentation = findViewById<Spinner>(R.id.spinnerPresentation)
        adapterPresentation.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerPresentation.adapter = adapterPresentation

        //Spinner de dosis
        val arrayDose = arrayOf("5mg","10mg", "20mg", "40mg","50mg","100mg")
        var adapterDose = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, arrayDose)
        var spinnerDose = findViewById<Spinner>(R.id.spinnerDose)
        adapterDose.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerDose.adapter = adapterDose

        //Spinner de medicinas
        val arrayMedicines = arrayOf("Furosemida","Losartan", "Enalapril", "Amlodipino")
        var adapterMedicines = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, arrayMedicines)
        var spinnerMedicines = findViewById<Spinner>(R.id.spinnerMedicine)
        adapterMedicines.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMedicines.adapter = adapterMedicines

        //Spinner de frecuencia de toma
        val arrayTakeFrequency = arrayOf("Cada 4 horas","Cada 6 horas", "Cada 8 horas", "Cada 12 horas", "Cada 24 horas")
        var adapterTakeFrequency = ArrayAdapter<String>(
            this,
            android.R.layout.simple_spinner_item, arrayTakeFrequency)
        var spinnerTakeFrequency = findViewById<Spinner>(R.id.spinnerTakeFrecuency)
        adapterTakeFrequency.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTakeFrequency.adapter = adapterTakeFrequency

        /*A los spinners spinnerPresentation, spinnerDose,spinnerMedicine, spinnerTakeFrecuency, hay que rellenarlos de datos aqui*/
    }

    fun clickNextButton(view: View) {
        val buttonClick = findViewById<androidx.appcompat.widget.AppCompatButton>(R.id.buttonNext)
        buttonClick.setOnClickListener {
            val intent = Intent(this, birthdateRegisterActivity::class.java)
            startActivity(intent)
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}