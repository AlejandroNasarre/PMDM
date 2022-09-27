package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de 3 valores, si uno es menor de 10 mostrar mensaje
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    if (n1 < 10 || n2 < 10 || n3 < 10)
        println("Alguno de los números es menor a diez")
}