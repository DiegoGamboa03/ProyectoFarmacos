package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton

class PatientMedicinesDoctorView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_patient_medicines_doctor_view)
        val position=intent.getStringExtra("position") // Variable que almacena la posicion en la lista de pacientes

        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Ibuprofeno, 27 de marzo, 7:00 Am", "Furosemida, 27 de marzo 2022, 7:30 AM", "Lorsatan, 27 de marzo 8:00 AM"
        ) // En este array se insertan los medicamentos del paciente

        // Se accede a la lista desde el xml
        var mListView = findViewById<ListView>(R.id.listViewMedicines)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Clicked item :"+" "+position, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PatientMedicinesDoctorView::class.java);
            intent.putExtra("position", position);
            this.startActivity(intent);
        }
    }

    fun clickFloatingActionButton(view: View) {
        //se recibe el tipo de usuario de la activity anterior

        val floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton3)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, NewMedicineForPacient::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG).show()
        }
    }
}