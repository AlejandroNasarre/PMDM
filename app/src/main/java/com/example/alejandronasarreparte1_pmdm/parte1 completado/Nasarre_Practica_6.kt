package com.example.alejandronasarreparte1_pmdm

fun main() {
    //calculo de un cuadrado con lado ingresado por consola
    println("introducir lado")
    val lado = readLine()!!.toInt()
    println("el perimetro es: " + (lado * 4))
}