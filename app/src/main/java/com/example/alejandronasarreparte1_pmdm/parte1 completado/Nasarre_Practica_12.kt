package com.example.alejandronasarreparte1_pmdm

fun main() {
    //creacion de estructura condicional compuesta con varias instrucciones por ramificacion
    println("introducir n1:")
    val n1 = readLine()!!.toInt()
    println("introducir n2:")
    val n2 = readLine()!!.toInt()
    if (n1 < n2) {
        val suma = n1 + n2
        val resta = n2 - n1
        println("suma: $suma resta: $resta")
    } else {
        val pruducto = n1 * n2
        val division = n1.toFloat() / n2
        println("producto: $pruducto division: $division")
    }
}