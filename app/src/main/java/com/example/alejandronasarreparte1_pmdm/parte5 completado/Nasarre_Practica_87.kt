package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//transformacion de un numero a letra mediante funcion
fun main() {
    println("Introducir valor (1-5):")
    val n = readLine()!!.toInt()
    println(numeroALetra(n))
}

//funcion para transformar un numero a letra mediante unica expresion
fun numeroALetra(n: Int) = when (n) {
    1 -> "uno"
    2 -> "dos"
    3 -> "tres"
    4 -> "cuatro"
    5 -> "cinco"
    else -> "numero no valido"
}