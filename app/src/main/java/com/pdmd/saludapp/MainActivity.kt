package com.pdmd.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import  android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello: View = findViewById(R.id.btnHello)
        btnHello.setOnClickListener {
            Log.i("Test","Botón pulsado")
        }
    }
}