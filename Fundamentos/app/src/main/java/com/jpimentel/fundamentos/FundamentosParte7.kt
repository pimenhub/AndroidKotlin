package com.jpimentel.fundamentos

fun main(){
    //cicloFor()
    //cicloFor2(2500)
    //cicloWhile()
    //cicloWhile2(5,100)
    //cicloDoWhile()
    cicloDoWhile2(30,20)
}
//Ciclo For
fun cicloFor(){
    for(i in 1..10){
        println("Numero $i")
    }
}
fun cicloFor2(numeroFinal:Int){
    for(i in 1..numeroFinal){
        println("Serie No.$i")
    }
}
//Ciclo While
fun cicloWhile(){
    var contador = 1
    while(contador <= 3){
        println("Contador No.$contador")
        contador++
    }
}
fun cicloWhile2(inicioContador:Int, finContador: Int){
    var inicio = inicioContador
    while(inicio <= finContador){
        println("Serie No.$inicio")
        inicio++
    }
}
//Ciclo Do While
fun cicloDoWhile(){
    var intentos = 1
    do{
        println("Intento No.$intentos")
        intentos++
    }while(intentos <= 2)
}
fun cicloDoWhile2(inicio: Int, fin: Int){
    var i = inicio
    do{
        println("Serie No.$i")
        i++
    }while (i < fin)
}