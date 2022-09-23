package com.example.alejandronasarreparte1_pmdm

fun main() {
    //programa para calcular el signo de un numero introducido por pantalla
    println("introducir numero:")
    val n1 = readLine()!!.toInt()
    val signo = if (n1 < 0) "negativo" else if (n1 == 0) "nulo" else "positivo"
    println("el numero $n1 es $signo.")
}