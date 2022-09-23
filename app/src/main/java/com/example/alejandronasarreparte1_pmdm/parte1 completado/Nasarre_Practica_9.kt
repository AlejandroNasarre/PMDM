package com.example.alejandronasarreparte1_pmdm

fun main() {
    //calculo suma y promedio de 4 variables
    println("introducir numero 1:")
    val n1 = readLine()!!.toInt()
    println("introducir numero 2:")
    val n2 = readLine()!!.toInt()
    println("introducir numero 3:")
    val n3 = readLine()!!.toInt()
    println("introducir numero 4:")
    val n4 = readLine()!!.toInt()
    val suma = n1 + n2 + n3 + n4
    println("la suma de los cuatro numeros es: $suma")
    //casteamos suma a float para mostrar los decimales
    val promedio = suma.toFloat() / 4
    println("el promedio de los cuatro numeros es: $promedio")
}