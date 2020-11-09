package com.example.ppb1_201804008_05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_logo: Button = findViewById(R.id.btn_logo)
        val btn_profil: Button = findViewById(R.id.btn_profil)

        btn_logo.setOnClickListener {
            val intent = Intent(this,MainLogo::class.java)
            startActivity(intent)
        }
        btn_profil.setOnClickListener {
            val intent = Intent(this,profil::class.java)
            startActivity(intent)
        }
    }
}