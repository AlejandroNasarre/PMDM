package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //Introduccion de n puntos(x,y) (especificado por consola), sus respectivas coordenadas
    //y clasificacion y conteo por cuadrantes
    println("introducir numero de puntos a ingresar:")
    val nPuntos = readLine()!!.toInt()
    var q1 = 0
    var q2 = 0
    var q3 = 0
    var q4 = 0
    for (i in 1..nPuntos) {
        println("introducir x del punto numero $i:")
        val x = readLine()!!.toInt()
        println("introducir y del punto numero $i:")
        val y = readLine()!!.toInt()

        if (x > 0 && y > 0) {
            println("primer cuadrante")
            q1++
        } else if (x < 0 && y > 0) {
            println("segundo cuadrante")
            q2++
        } else if (x < 0 && y < 0) {
            println("tercer cuadrante")
            q3++
        } else {
            println("cuarto cuadrante")
            q4++
        }
    }
    println("Hay $q1 puntos en el primer cuadrante.")
    println("Hay $q2 puntos en el segundo cuadrante.")
    println("Hay $q3 puntos en el tercer cuadrante.")
    println("Hay $q4 puntos en el cuarto cuadrante.")
}