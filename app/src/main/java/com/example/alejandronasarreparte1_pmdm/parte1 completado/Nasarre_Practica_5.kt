package com.example.alejandronasarreparte1_pmdm

fun main() {
    //realizacion de operaciones matematicas pidiendo parametros por consola
    println("introducir primer valor")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor")
    val n2 = readLine()!!.toInt()
    var n3 = n1 + n2
    println(n3)
    n3 = n1 * n2
    println(n3)
}