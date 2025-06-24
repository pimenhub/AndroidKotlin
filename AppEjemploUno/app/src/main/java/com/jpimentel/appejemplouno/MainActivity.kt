package com.jpimentel.appejemplouno

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //-------------------------------------------------------------------------------------
        val txtSaludo = findViewById<TextView>(R.id.txtSaludo)
        val btnHola = findViewById<Button>(R.id.btnHola)
        val btnAdios = findViewById<Button>(R.id.btnAdios)

        //Llamado de la funcion
        cambioDeSaludo(txtSaludo,btnHola,btnAdios)

    }

    fun cambioDeSaludo(textoS: TextView, btnH: Button, btnA: Button){
        val saludoHola = "Bienvenido a mi aplicacion"
        val saludoAdios = "Fue un gusto haberte conocido"

        //Evento de clic o pulsar el boton
        btnH.setOnClickListener {
            textoS.text = saludoHola //Seteo de dato al texto
        }
        //Evento de clic o pulsar el boton
        btnA.setOnClickListener {
            textoS.text = saludoAdios //Seteo de dato al texto
        }
    }
}