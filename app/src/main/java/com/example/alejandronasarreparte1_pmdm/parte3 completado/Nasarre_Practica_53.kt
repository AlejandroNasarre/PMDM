package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //introduccion de 10 valores por consola y suma de los 5 ultimos
    var suma = 0
    for (i in 1..10) {
        println("introducir valor numero $i:")
        val n = readLine()!!.toInt()
        if (i > 5)
            suma += n
    }
    println("la suma de los 5 ultimos numeros es: $suma")
}