package com.pdmd.saludapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Greeting : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.greeting)
        val tvGreeting: TextView = findViewById(R.id.tvGreeting)
        val name:String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvGreeting.text = "Hola $name"
    }
}