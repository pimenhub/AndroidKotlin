package com.jpimentel.apppreferencias

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        val txtNombre = findViewById<TextView>(R.id.txtNombreM2)
        val txtApellido = findViewById<TextView>(R.id.txtApellidoM2)
        val txtEdad = findViewById<TextView>(R.id.txtEdadM2)
        val btnBorrar = findViewById<Button>(R.id.btnBorrar)

        val nombre = intent.getStringExtra("kNombre")
        val apellido = intent.getStringExtra("kApellido")
        val edad = intent.getIntExtra("kEdad",0)

        //Guardado de datos por medio de SharePreferences
        val preferencias = getSharedPreferences("datos", MODE_PRIVATE)
        val editor = preferencias.edit()

        //Extraer la informacion guardada
        val clave = preferencias.getInt("pClave",0)
        if(clave == 1){
            val pNombre = preferencias.getString("pNombre","...")
            val pApellido = preferencias.getString("pApellido","...")
            val pEdad = preferencias.getInt("pEdad",0)

            //Informacion guardada
            txtNombre.text = "Nombre: $pNombre"
            txtApellido.text = "Apellido: $pApellido"
            txtEdad.text = "Edad: $pEdad"
        }
        else{
            editor.putInt("pClave",1)
            editor.putString("pNombre", nombre)
            editor.putString("pApellido", apellido)
            editor.putInt("pEdad", edad)
            editor.apply()//guarda los put en el archivo

            //Informacion del Intent
            txtNombre.text = "Nombre: $nombre"
            txtApellido.text = "Apellido: $apellido"
            txtEdad.text = "Edad: $edad"
        }

        btnBorrar.setOnClickListener {
            editor.clear().apply()//limpiar y guardar
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}