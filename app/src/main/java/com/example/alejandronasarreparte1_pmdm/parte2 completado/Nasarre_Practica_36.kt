package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de alturas de n personas y calculo de su promedio
    println("introducir numero de personas:")
    val nPersonas =  readLine()!!.toInt()
    var sumaAltura = 0f
    for (i in 1..nPersonas) {
        println("introducir altura persona numero $i:")
        sumaAltura += readLine()!!.toFloat()
    }
    val promedioAltura = sumaAltura/nPersonas
    println("la altura promedio es: $promedioAltura")
}