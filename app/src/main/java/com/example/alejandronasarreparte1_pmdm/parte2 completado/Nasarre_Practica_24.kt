package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    // programa para verificar que una fecha esta situada en el primer trimestre del año
    println("introducir dia:")
    val dia = readLine()!!.toInt()
    println("introducir mes:")
    val mes = readLine()!!.toInt()
    println("introducir año:")
    val anio = readLine()!!.toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        println("primer trimestre.  dia:$dia  mes:$mes  año:$anio")
}