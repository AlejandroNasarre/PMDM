package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //clasificacion de 10 numeros introducidos por consola en si son
    //0 o 1,5 o 10 mediante estructura condicional when
    //con parametro
    var q0 = 0
    var q15_10 = 0
    for (i in 1..10) {
        println("introducir valor numero $i:")
        val n = readLine()!!.toFloat()
        when (n) {
            0f -> q0++
            1.5f, 10f -> q15_10++
        }
    }
    println("$q0 de los valores introducidos son 0.")
    println("$q15_10 de los valores introducidos son 1,5 o 10.")
}