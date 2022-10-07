package com.example.alejandronasarreparte1_pmdm

fun main() {
    //programa para comprobar que la media de un alumno es mayor que 7
    println("introducir nota 1:")
    val n1 = readLine()!!.toInt()
    println("introducir nota 2:")
    val n2 = readLine()!!.toInt()
    println("introducir nota 3:")
    val n3 = readLine()!!.toInt()
    val promedio = (n1 + n2 + n3) / 3
    if (promedio >= 7)
        println("promocionado")
}