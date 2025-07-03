package com.jpimentel.appnavegaciondos

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
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
        //-----------------------------------------------------------------------------------------
        val edtNota = findViewById<EditText>(R.id.edtNota)
        val btnValidarNota = findViewById<Button>(R.id.btnValidarNota)

        btnValidarNota.setOnClickListener {
            if(edtNota.text.toString() != "") {
                val nota = edtNota.text.toString().toInt()
                val resultado = validarNota(nota)
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("resultadoNota",resultado)
                startActivity(intent)
            }
            else
                Toast.makeText(this, "Ingrese una nota", Toast.LENGTH_SHORT).show()
        }
    }
    fun validarNota(nota: Int): Boolean{
        if(nota >= 60)
            return true
        else
            return false
    }
}