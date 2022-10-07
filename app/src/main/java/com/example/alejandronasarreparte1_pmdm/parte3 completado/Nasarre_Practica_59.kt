package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //clasificacion de un punto(x,y) en su correspondiente cuadrante
    //mediante estructura condicional when
    println("introducir x:")
    val x = readLine()!!.toInt()
    println("introducir y:")
    val y = readLine()!!.toInt()
    when{
        x > 0 && y > 0 -> println("primer cuadrante")
        x < 0 && y > 0 -> println("segundo cuadrante")
        x < 0 && y < 0 -> println("tercer cuadrante")
        x > 0 && y < 0 -> println("cuarto cuadrante")
        else -> println("punto situado en un eje")
    }
}