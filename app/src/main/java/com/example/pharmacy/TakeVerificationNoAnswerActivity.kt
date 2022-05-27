package com.example.pharmacy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get

class TakeVerificationNoAnswerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_verification_no_answer)
    }

    fun OnClick(view: View) {
        val RadioGroup = findViewById<RadioGroup>(R.id.RadioGroup)
        RadioGroup.setOnClickListener{
            val textView = findViewById<TextView>(R.id.textViewReply)
            val selectedRadioButtonId: Int = RadioGroup.checkedRadioButtonId
            textView.text = "0 is Selected"
            if (selectedRadioButtonId == 0) {
                textView.setText("0 is Selected")
                textView.text
            } else if(selectedRadioButtonId == 1){
                textView.text = "1 is Selected"
            }else if(selectedRadioButtonId == 2){
                textView.text = "2 is Selected"
            }else {
                textView.text = "Nothing selected from the radio group"
            }
        }

        Toast.makeText(applicationContext, "Remplazar por tu codigo", Toast.LENGTH_LONG)
            .show()
    }
}