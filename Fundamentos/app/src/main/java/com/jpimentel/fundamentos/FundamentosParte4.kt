package com.jpimentel.fundamentos

fun main(){
    //Definir una variable como null
    var esNumero:Int = 0
    var esNumeroSinInicializar:Int
    var esNuloNumero:Int? = null
    esNuloNumero = 100
    var esTexto:String = ""
    var esTextoSinInicializar:String
    var esNuloTexto:String? = null
    esNuloTexto = "Kotlin"

    println(esNumero)
    println(esNuloNumero)
    //println(esNumeroSinInicializar)

    println(esTexto)
    //println(esTextoSinInicializar)
    println(esNuloTexto)

    //Obligar a una variable a no ser null
    println("Obligar variable " + esNuloNumero!!)
    var noNulaObligatoria:String = "obligado"!!
    println(noNulaObligatoria)
}