package com.example.praktikum1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Latihan3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan3)
        val bt_proses = findViewById<Button>(R.id.bt_proses)
        val et_nama = findViewById<EditText>(R.id.et_nama)

        bt_proses.setOnClickListener {
            Toast.makeText(applicationContext, et_nama.text, Toast.LENGTH_SHORT).show()
        }
    }
}