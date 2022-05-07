package com.example.pharmacy.registerActivities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pharmacy.R


class nameRegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_register)

        val profileName=intent.getStringExtra("UserType")

    }
}