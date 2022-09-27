package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de dos listas de 5 valores y comparacion del valor acumulado entre ellas
    println("primera lista:")
    var sumaL1 = 0
    for (i in 1..5) {
        println("introducir valor numero $i:")
        sumaL1 += readLine()!!.toInt()
    }
    println("segunda lista:")
    var sumaL2 = 0
    for (i in 1..5) {
        println("introducir valor numero $i:")
        sumaL2 += readLine()!!.toInt()
    }
    if (sumaL1 > sumaL2)
        println("la primera lista es mayor")
    else if (sumaL2 > sumaL1)
        println("la segunda lista es mayor")
    else
        println("las dos listas son iguales")
}