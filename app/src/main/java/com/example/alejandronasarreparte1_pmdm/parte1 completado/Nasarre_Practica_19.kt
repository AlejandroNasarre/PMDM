package com.example.alejandronasarreparte1_pmdm

fun main() {
    //programa para calcular el numero mayor entre tres opciones
    println("introducir n1:")
    val n1 = readLine()!!.toInt()
    println("introducir n2:")
    val n2 = readLine()!!.toInt()
    println("introducir n3:")
    val n3 = readLine()!!.toInt()
    var nAux = if (n1 > n2) n1 else n2
    nAux = if (nAux > n3) nAux else n3
    println("El numero mayor es $nAux")
}