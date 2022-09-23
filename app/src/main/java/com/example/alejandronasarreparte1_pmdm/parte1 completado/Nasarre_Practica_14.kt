package com.example.alejandronasarreparte1_pmdm

fun main() {
    //programa para ver cuantas cifras tiene un numero introducido por consola
    println("introducir numero [1 - 99]:")
    val n1 = readLine()!!.toInt()
    if (n1 >= 10 && n1 < 100)
        println("el numero tiene dos cifras.")
    else if (n1 < 10)
        println("el numero tiene una cifra.")
    else
        println("numero no valido")
}