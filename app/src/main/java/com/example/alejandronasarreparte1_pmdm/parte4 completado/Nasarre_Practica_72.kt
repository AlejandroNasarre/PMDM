package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa que permite mostrar la multiplicacion de dos valores introducidos
//por pantalla y el cuadrado de otro mediante funciones
fun main() {
    producto()
    cuadrado()
}

//funcion para recoger los valores a multiplicar y mostrar el resultado
fun producto() {
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("$n1 * $n2 = ${n1 * n2}")
}

//funcion para calcular el cuadrado de un valor
fun cuadrado() {
    println("introducir valor:")
    val n = readLine()!!.toInt()
    println("$n^2 = ${n * n}")
}