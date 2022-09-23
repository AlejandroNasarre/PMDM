package com.example.alejandronasarreparte1_pmdm

fun main() {
    //algoritmo para calcular la cantidad de digitos de un numero dado entre el 1 y el 99
    println("introducir numero [1 - 99]:")
    val n1 = readLine()!!.toInt()
    val cDigitos = if (n1 > 9) 2 else 1
    println("el numero $n1 tiene $cDigitos digitos")
}
