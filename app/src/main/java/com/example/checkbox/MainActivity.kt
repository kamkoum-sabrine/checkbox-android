package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var yes : CheckBox
    lateinit var no : CheckBox
    lateinit var text : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        yes = findViewById(R.id.yes)
        no = findViewById(R.id.no)
        text = findViewById(R.id.text)

        yes.setOnClickListener{
            if (yes.isChecked) {
                text.setText("Yes i have experience")
                no.isChecked = false

            }

        }
        no.setOnClickListener{
            if (no.isChecked) {
                text.setText("No i haven't")
                yes.isChecked = false

            }

        }
    }
}