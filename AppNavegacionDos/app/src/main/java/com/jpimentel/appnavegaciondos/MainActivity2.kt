package com.jpimentel.appnavegaciondos

import android.os.Bundle
import android.widget.ImageView
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
        val imgResultado = findViewById<ImageView>(R.id.imgResultado)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        val resultadoNota = intent.getBooleanExtra("resultadoNota",false)

        if(resultadoNota){
            imgResultado.setImageResource(R.drawable.aprobado)
            txtResultado.text = "APROBADO"
        }
        else{
            imgResultado.setImageResource(R.drawable.reprobado)
            txtResultado.text = "REPROBADO"
        }
    }
}