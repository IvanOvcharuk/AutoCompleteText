package com.example.autocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoComplete)
        val Panstwa = resources.getStringArray(R.array.Państwa)

        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, Panstwa
        )
        autotextView.threshold = 0
        autotextView.setAdapter(adapter)

        findViewById<Button>(R.id.button).setOnClickListener {
            if (autotextView.text.toString() == "") {
                Toast.makeText(applicationContext, "Podaj nazwę państwa", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, autotextView.text.toString(), Toast.LENGTH_SHORT)
                    .show()
            }
        }
    }
}
