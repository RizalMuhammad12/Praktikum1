package com.example.praktikum1
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Tugas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_praktikum1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val bt_proses = findViewById<Button>(R.id.btn_proses)
        val et_nim = findViewById<EditText>(R.id.et_nim)
        val et_nama = findViewById<EditText>(R.id.et_nama)
        val et_prodi = findViewById<EditText>(R.id.et_prodi)
        val tv_hasil = findViewById<TextView>(R.id.tv_hasil)

        bt_proses.setOnClickListener {

            val nim = et_nim.text.toString().trim()
            val nama = et_nama.text.toString().trim()
            val prodi = et_prodi.text.toString().trim()

            if (nim.isEmpty() || nama.isEmpty() || prodi.isEmpty()) {
                Toast.makeText(
                    this,
                    "Semua data harus diisi!",
                    Toast.LENGTH_SHORT
                ).show()
            } else {

                val hasil =
                    "Halo, perkenalkan saya $nama dengan NIM $nim pada Program Studi $prodi"

                tv_hasil.text = hasil
            }
        }
    }
}