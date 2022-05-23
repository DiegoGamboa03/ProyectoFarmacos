package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton

class DoctorPacientListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor_pacient_list)
        val arrayAdapter: ArrayAdapter<*>
        val users = arrayOf(
            "Virat Kohli", "Rohit Sharma", "Steve Smith",
            "Kane Williamson", "Ross Taylor"
        ) // En este array se insertan los pacientes de un doctor

        // Se accede a la lista desde el xml
        var mListView = findViewById<ListView>(R.id.listViewPacients)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, users)
        mListView.adapter = arrayAdapter

        mListView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Clicked item :"+" "+position,Toast.LENGTH_SHORT).show()
            val intent = Intent(this, PatientMedicinesDoctorView::class.java);
            intent.putExtra("position", position);
            this.startActivity(intent);
        }

        var floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton2)

    }

    fun clickFloatingActionButton(view: View) {
        //se recibe el tipo de usuario de la activity anterior

        val floatingActionButton = findViewById<FloatingActionButton>(R.id.floatingActionButton2)
        floatingActionButton.setOnClickListener {
            val intent = Intent(this, NewPacient::class.java)
            startActivity(intent)
            Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG).show()
        }
    }

}