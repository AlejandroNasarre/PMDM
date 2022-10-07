package com.example.alejandronasarreparte1_pmdm.parte4

fun main() {
    //clasificacion de un numero entero introducido por pantalla
    //mediante estructura condicional when
    println("introducir valor:")
    val n = readLine()!!.toInt()
    when{
        n > 0 -> println("positivo")
        n < 0 -> println("negativo")
        else -> println("nulo")
    }
}