package com.jpimentel.fundamentos

fun main(){
    //Funcion Simple
    hola()
    //Funcion con parametros
    unirNombreYApellido("Jonathan","Pimentel")
    var nombre:String = "Juana"
    var apellido:String = "De Arco"
    unirNombreYApellido(nombre, apellido)
    //Funcion con retorno
    println(miNumeroPi())
    var miPi = miNumeroPi()
    println(miPi)
    println(miPi*100)
    //Funcion con parametros y retorno
    val resultado = sumarDosNumero(5,5)
    println("La suma es: $resultado")
    var n1 = 10
    var n2 = 25
    println("La segunda suma es ${sumarDosNumero(n1,n2)}")

}

//------------Funciones propias
//Funcion simple
fun hola(){
    println("Hola!")
}
//palabra reservada fun - define una funcion
//hola es el nombre o identificador
//() apartado de parametrizacion
//():TipoDato es para el retorno de una funcion
//{} el cuerpo de la funcion

//Funcion con parametros
fun unirNombreYApellido(nombre:String, apellido:String){
    val union:String = "$nombre $apellido"
    println(union)
}

//Funcion con retorno
fun miNumeroPi():Double{
    val miPi:Double = 3.14
    return miPi
}

//Funcion con parametros y retorno
fun sumarDosNumero(numero1:Int, numero2:Int):Int{
    var suma = numero1 + numero2
    return suma
}