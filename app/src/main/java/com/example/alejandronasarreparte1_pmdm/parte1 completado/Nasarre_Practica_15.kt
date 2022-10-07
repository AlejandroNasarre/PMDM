package com.example.alejandronasarreparte1_pmdm

fun main() {
    //asignacion de valor a una variable mediante if else
    println("introducir n1:")
    val n1 = readLine()!!.toInt()
    println("introducir n2:")
    val n2 = readLine()!!.toInt()
    val mayor = if (n1 > n2) n1 else n2
    println("el mayor es $mayor")
}