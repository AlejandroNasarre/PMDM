package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //calculo de la suma de 10 numeros introducidos por pantalla y su media
    var suma = 0
    for (i in 1..10) {
        println("introducir valor numero $i:")
        suma += readLine()!!.toInt()
    }
    println("la suma es: $suma")
    println("el promedio es: " + (suma.toFloat()/10))
}