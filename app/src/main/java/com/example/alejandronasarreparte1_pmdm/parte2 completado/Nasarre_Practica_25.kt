package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    // programa para verificar que una fecha corresponde a navidad
    println("introducir dia:")
    val dia = readLine()!!.toInt()
    println("introducir mes:")
    val mes = readLine()!!.toInt()
    println("introducir año:")
    val anio = readLine()!!.toInt()
    if (mes == 12 && dia == 25)
        println("dia de navidad")
}