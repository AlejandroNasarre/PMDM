package com.example.alejandronasarreparte1_pmdm.parte2

fun main() {
    //programa para ver cuantas cifras tiene un numero introducido por consola
    println("introducir numero [1 - 999]:")
    val n1 = readLine()!!.toInt()
    if (n1 < 10)
        println("el numero tiene 1 cifra.")
    else if (n1 < 100)
        println("el numero tiene 2 cifras.")
    else if (n1 < 1000)
        println("el numero tiene 3 cifras.")
    else
    println("numero no valido")
}