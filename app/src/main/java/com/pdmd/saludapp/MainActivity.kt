package com.pdmd.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnHello:AppCompatButton = findViewById(R.id.btnHello)
        val etName:AppCompatEditText = findViewById(R.id.etname)

        btnHello.setOnClickListener {
            //Log.i("Test", "Botón pulsado")
            val name = etName.text.toString()
            //
            if(name.isNotEmpty()){
                Snackbar.make(btnHello,"Hola $name!",Snackbar.LENGTH_LONG)
                    .setAnchorView(btnHello)
                    .setAction("NEXT SCREEN"){
                        val intentGA = Intent(this, Greeting::class.java)
                        val value = intentGA.putExtra("EXTRA_NAME" , name)
                        startActivity(intentGA)
                    }
                    .show()
            }else {
                Toast.makeText(this, "Introduce un nombre",Toast.LENGTH_LONG).show()
            }
        }
    }
}