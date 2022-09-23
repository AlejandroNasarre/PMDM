package com.example.alejandronasarreparte1_pmdm.parte2

fun main() {
    //programa para calcular el nivel de un postulante y clasificarlo
    //segun el porcentaje de aciertos a las preguntas
    println("introducir numero de preguntas")
    val preguntas = readLine()!!.toInt()
    println("introducir numero de aciertos")
    val aciertos = readLine()!!.toInt()
    val porcentaje = (aciertos.toFloat()/preguntas) * 100
    if (porcentaje >= 90)
        println("Nivel Maximo: $porcentaje%")
    else if (porcentaje >= 75)
        println("Nivel Medio: $porcentaje%")
    else if (porcentaje >= 50)
        println("Nivel Regular: $porcentaje%")
    else
        println("Fuera de nivel: $porcentaje%")
}