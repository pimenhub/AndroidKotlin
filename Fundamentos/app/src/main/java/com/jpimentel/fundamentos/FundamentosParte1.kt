package com.jpimentel.fundamentos

fun main(){
  //Comentario de linea
  /*
  Este es un
  comentario de
  bloque
  */
  //Declaracion de val y var
 //Declaracion sin tipado
    val nombreAnimal = "perro"
    var edadAnimal = 3

 //Declaracion con tipado
    val pesoAnimal:Double = 3.5
    var tamanioAnimal:Float = 1.5f
    var razaAnimal:Char = 'A'

 //Diferencia entre var y val
    //nombreAnimal = 'gato' //No es posible reasignar un valor
    edadAnimal = 5 //es mutable por ende se le puede asignar otro valor

 //Salida de valores y variables
    println(10)
    println(nombreAnimal)
    println(edadAnimal)
    println(tamanioAnimal)
    println(pesoAnimal)
    println(razaAnimal)
}