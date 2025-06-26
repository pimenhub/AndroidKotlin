package com.jpimentel.appactividaduno

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
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
        //----------------------------------------------------------------------------------------
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val btnLimpiar = findViewById<Button>(R.id.btnLimpiar)
        val edtNumero = findViewById<EditText>(R.id.edtNumero)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        //llamado de la funcion
        calcular(btnCalcular,edtNumero, txtResultado)
        limpiar(btnLimpiar,edtNumero,txtResultado)
    }
    fun calcular(btn : Button, edt : EditText, txt : TextView){
        btn.setOnClickListener {
            val numero = edt.text.toString().trim()
            if(numero.isEmpty()){
                txt.text = "Lo siento, debe de ingresar un numero"
            }
            else{
                when{
                    numero.toDouble() > 0 -> {
                        txt.text = "POSITIVO"
                        txt.setTextColor(Color.GREEN)
                    }
                    numero.toDouble() < 0 -> {
                        txt.text = "NEGATIVO"
                        txt.setTextColor(Color.RED)
                    }
                    else -> {
                        txt.text = "ES IGUAL A 0"
                        txt.setTextColor(Color.BLUE)
                    }
                }
            }
        }
    }
    fun limpiar(btn : Button, edt : EditText, txt: TextView){
        btn.setOnClickListener {
            edt.setText("")
            txt.text = "..."
        }
    }

}

















