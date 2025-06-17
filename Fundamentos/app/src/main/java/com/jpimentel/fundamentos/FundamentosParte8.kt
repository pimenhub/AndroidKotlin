package com.jpimentel.fundamentos

import android.R

fun main(){
    //arreglos()
    listas()
}

fun arreglos(){
    //Arreglos
    //Arreglos Numerico
    val numerico = arrayOf(1,2,3,4,5)
    val numericoConTipo = intArrayOf(6,7,8,9,10)
    //val primarios = R.array()
    //Arreglos de cadena de caracteres
    val colores = arrayOf("rojo","azul","amarillo")
    val frutas = arrayOf("manzana","arandano","mango")

    numerico[4] = 55
    //numerico[5] = 325 //no es permitido por la definicion del arreglo
    println(numerico[0])
    println(numerico[2])
    println(numerico[4])
    //println(numerico[5]) //no es permitido por la definicion del arreglo
    println(numericoConTipo)
    println(colores.size)
    println(frutas.first())
    println(frutas.last())

    for (i in numerico){
        println(i)
    }
    for (i in numerico.indices){
        println("Posicion $i: ${numerico[i]}")
    }
    for (i in colores){
        println(i)
    }
    for (i in frutas){
        println(i)
    }
}
fun listas(){
    //Listas - inmutables (como los arreglos)
    //Listas numericas
    val numeros = listOf(10,20,30,40,50)
    val numerosTipados = listOf<Int>(11,22,33,44,55)
    //Listas de cadena de caracteres
    val mascotas = listOf("perro","gato","pez","gallina")
    val verduras = listOf<String>("papa","zanahoria","brocoli")
    println(mascotas[0])
    println(mascotas)
    println(verduras)
    println(mascotas.size)
    println(mascotas.first())
    println(mascotas.last())
    //Recorrer una lista
    for (i in verduras){
        println(i)
    }


    //Listas mutablas - se pueden modificar
    val vehiculos = mutableListOf("Toyota", "Honda", "Mazda", "Nissan")
    println(vehiculos)
    println(vehiculos.size)

    //Recorrer una lista
    for (i in vehiculos){
        println(i)
    }

    //Agregar y remover elementos
    vehiculos.add("patito")
    vehiculos.add("gatito")
    println(vehiculos)
    println(vehiculos.size)
    vehiculos.remove("Honda")
    vehiculos.removeAt(3)
    vehiculos.removeAt(vehiculos.lastIndex)
    println(vehiculos)

}