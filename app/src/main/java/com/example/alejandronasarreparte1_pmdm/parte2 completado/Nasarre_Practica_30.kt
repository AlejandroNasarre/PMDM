package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de 3 valores y asignacion del menor y mayor valor a variables
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    val menor = if (n1 <= n2 && n1 <= n3) n1 else if (n2 <= n3) n2 else n3
    val mayor = if (n1 >= n2 && n1 >= n3) n1 else if (n2 >= n3) n2 else n3
    println("el numero menor es: $menor el numero mayor es: $mayor")
}