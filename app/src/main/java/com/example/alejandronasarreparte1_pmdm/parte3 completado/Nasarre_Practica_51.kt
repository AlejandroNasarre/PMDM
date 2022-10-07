package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //conteo de n numeros pares introducidos por consola
    //mediante for y operador de rango
    println("introducir numero de valores a introducir:")
    val nValores = readLine()!!.toInt()
    var nPares= 0
    for (i in 1..nValores){
        println("introducir valor numero $i:")
        val n = readLine()!!.toInt()
        if (n % 2 == 0)
            nPares++
    }
    println("hay $nPares numeros pares")
}