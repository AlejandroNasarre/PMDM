package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //calculo de la suma y el promedio de 10 numeros introducidos por consola
    // mediante for y operador de rango
    var suma= 0
    for (i in 1..10){
        println("introducir valor numero $i:")
        suma += readLine()!!.toInt()
    }
    println("la suma es $suma")
    println("el promedio es ${suma.toFloat()/10}")
}