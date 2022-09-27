package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //programa para calcular el numero mayor entre tres opciones
    println("introducir n1:")
    val n1 = readLine()!!.toInt()
    println("introducir n2:")
    val n2 = readLine()!!.toInt()
    println("introducir n3:")
    val n3 = readLine()!!.toInt()
    if (n1 >= n2 && n1 >= n3)
        println("el numero mayor es: $n1 ")
    else if (n2 >= n3)
        println("el numero mayor es: $n2 ")
    else
        println("el numero mayor es: $n3 ")
}