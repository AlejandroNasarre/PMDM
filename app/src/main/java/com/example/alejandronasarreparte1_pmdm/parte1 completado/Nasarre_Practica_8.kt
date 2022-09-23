package com.example.alejandronasarreparte1_pmdm

fun main() {
    //realizacion  de operaciones basicas
    println("introducir numero 1:")
    val n1 = readLine()!!.toInt()
    println("introducir numero 2:")
    val n2 = readLine()!!.toInt()
    println("introducir numero 3:")
    val n3 = readLine()!!.toInt()
    println("introducir numero 4:")
    val n4 = readLine()!!.toInt()

    println("la suma de los dos primeros numeros es: " + (n1 + n2))
    println("el producto de los dos ultimos numeros es: " + (n3 * n4))
}