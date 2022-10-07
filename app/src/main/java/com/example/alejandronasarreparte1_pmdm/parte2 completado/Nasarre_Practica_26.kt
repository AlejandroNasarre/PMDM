package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de 3 valores, si son iguales mostrar el cubo del valor
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    if (n1 == n2 && n1 == n3)
        println(n1*n2*n3)
}