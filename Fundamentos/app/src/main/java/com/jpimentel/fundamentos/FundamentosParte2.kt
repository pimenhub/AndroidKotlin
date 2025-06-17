package com.jpimentel.fundamentos

fun main(){
    //Interpolacion
    val primerNombre:String = "Pepito"
    var primerApellido:String = "Juarez"
    val edad:Int = 8
    val estatura:Double = 1.20

    //Ejemplo de concatenacion
    //val presentacion:String = "Hola mi nombre es " + primerNombre + " " + edad + estatura

    val presentacion:String = "Hola mi nombre es $primerNombre $primerApellido y " +
            "tengo la edad de $edad con una estatura de $estatura metros"

    println(presentacion)
}