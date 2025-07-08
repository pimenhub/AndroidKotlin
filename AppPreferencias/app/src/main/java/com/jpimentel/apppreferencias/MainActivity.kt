package com.jpimentel.apppreferencias

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible

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
        val edtApellido = findViewById<EditText>(R.id.edtApellido)
        val edtEdad = findViewById<EditText>(R.id.edtEdad)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)
        val btnVisualizar = findViewById<Button>(R.id.btnVisualizar)
        val txtEtiqueta = findViewById<TextView>(R.id.txtIngresar)

        val preferencias = getSharedPreferences("datos", MODE_PRIVATE)
        val clave = preferencias.getInt("pClave",0)

        if(clave == 0) {
            btnVisualizar.isVisible = false
            btnGuardar.setOnClickListener {
                if (!edtNombre.text.toString()
                        .isEmpty() && !edtApellido.text.isEmpty() && !edtEdad.text.toString()
                        .isEmpty()
                ) {
                    val intent = Intent(this, MainActivity2::class.java)
                    val nombre = edtNombre.text.toString()
                    val apellido = edtApellido.text.toString()
                    val edad = edtEdad.text.toString().toInt()
                    intent.putExtra("kNombre", nombre)
                    intent.putExtra("kApellido", apellido)
                    intent.putExtra("kEdad", edad)
                    startActivity(intent)
                    finish()
                } else {
                    Toast.makeText(this, "Debes de ingresar todos los datos", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        else{
            edtNombre.isVisible = false
            edtApellido.isVisible = false
            edtEdad.isVisible = false
            btnGuardar.isVisible = false
            txtEtiqueta.text = "Valida tus datos"
            btnVisualizar.isVisible = true
            btnVisualizar.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }
}