package com.jpimentel.fundamentos

fun main(){
    //condicionesIfElse()
    //condicionesIfElse2(5,15)
    condicionesIfElseAnidados()
}
fun condicionesIfElse(){
    //Condicion para obtener mi DPI
    val edadActual:Int = 19
    val edadParaDPI:Int = 18
    if(edadActual >= edadParaDPI){
        println("Ya puedes obtener tu DPI")
    }
    else{
        println("Tienes que esperar para tu DPI porque aun tienes $edadActual")
    }
}

fun condicionesIfElse2(numero1:Int,numero2:Int){
    //Comparar 2 numeros y detectar el mayor
    if(numero1 > numero2){
        println("$numero1 es mayor a $numero2")
    }
    else if(numero2 == numero1){
        println("$numero1 y $numero2 son iguales")
    }
    else{
        println("$numero2 es mayor a $numero1")
    }
}

fun condicionesIfElseAnidados(){
    val pase1 = true
    val pase2 = false
    val codigo = 123456
    //Simbolos logicos
    //Si y solo si = && - Es verdadero si to,do es verdadero
    //Si uno cumple = || - Si por lo menos uno es verdadero
    if(pase1 == true || pase2 == true){
        if(codigo == 123456){
            println("Bienvenido")
        }
        else{
            println("Codigo Incorrecto")
        }
    }
    else{
        println("No tienes ningun pase")
    }
}
