package com.example.alejandronasarreparte1_pmdm

fun main() {
    //creacion de estructura condicional compuesta para dertectar el numero mayor
    println("introducir n1:")
    val n1 = readLine()!!.toInt()
    println("introducir n2:")
    val n2 = readLine()!!.toInt()
    if (n1 > n2)
        println("$n1 es mayor")
    else
        println("$n2 es mayor")
}
