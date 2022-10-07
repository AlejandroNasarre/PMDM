package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de 10 notas y contado de notas superiores e inferiores a 7
    var nSuperiores = 0
    for (i in 1..10) {
        println("introducir nota numero $i:")
        val nota = readLine()!!.toInt()
        if (nota >= 7)
            nSuperiores++
    }
    val nInferiores = 10 - nSuperiores
    println("el numero de notas superiores o iguales a 7 es $nSuperiores")
    println("el numero de notas inferiores a 7 es $nInferiores")
}