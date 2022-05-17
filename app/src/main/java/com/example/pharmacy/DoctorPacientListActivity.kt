package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

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
            val intent = Intent(this, PatientMedicines::class.java);
            intent.putExtra("position", position);
            this.startActivity(intent);
        }
    }

}