package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //introduccion de n piezas y revision de cuantas son aptas
    println("introducir numero de piezas a procesar:")
    val nPiezas =  readLine()!!.toInt()
    var nPiezasAptas = 0
    for (i in 1..nPiezas) {
        println("introducir perfil de la pieza numero $i:")
        val perfil = readLine()!!.toFloat()
        if (perfil in 1.20..1.30)
            nPiezasAptas++
    }
    println("el numero de piezas aptas es de $nPiezasAptas de $nPiezas")
}