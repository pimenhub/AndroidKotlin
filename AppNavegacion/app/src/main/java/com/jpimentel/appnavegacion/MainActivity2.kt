package com.jpimentel.appnavegacion

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //-----------------------------------------------------------------------------------------
        val txtNombre = findViewById<TextView>(R.id.txtNombre)
        val txtEdad = findViewById<TextView>(R.id.txtEdad)

        txtNombre.text = "Hola, " + intent.getStringExtra("name")
        txtEdad.text = "Tienes " + intent.getStringExtra("date") + " años"
    }
}