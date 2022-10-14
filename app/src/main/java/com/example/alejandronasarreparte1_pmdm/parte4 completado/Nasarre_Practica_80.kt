package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa para mostrar el numero mayor de dos introducidos por consola
//mediante funcion
fun main() {
    println("Introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("Introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("el mayor es: ${mayorDe(n1,n2)}")
}

//funcion para calcular el numero mayor de los pasados por parametro
fun mayorDe(n1: Int, n2: Int): Int {
    return when {
        n1 > n2 -> n1
        else -> n2
    }
}