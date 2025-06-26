package com.jpimentel.appnavegacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

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
        val edtNombre = findViewById<EditText>(R.id.edtNombre)
        val edtFechaNacimiento = findViewById<EditText>(R.id.edtFechaNacimiento)
        val btnConocer = findViewById<Button>(R.id.btnConocer)

        btnConocer.setOnClickListener {
            val nombre = edtNombre.text.toString().trim()
            val fechaNacimiento = edtFechaNacimiento.text.toString().trim()
            val edad = calcularEdad(fechaNacimiento)
            //Se declara el intent
            val intent = Intent(this, MainActivity2::class.java)
            //Se obtienen los datos para enviar
            intent.putExtra("name",nombre)
            intent.putExtra("date",edad)
            //Se apertura la otra actividad y se envian los datos
            startActivity(intent)
        }
    }
    fun calcularEdad(fechaNacimiento: String) : String{
        val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
        val fechaNac = LocalDate.parse(fechaNacimiento, formatter)
        val fechaHoy = LocalDate.now()
        val edad = Period.between(fechaNac, fechaHoy).years
        return edad.toString()
    }
}