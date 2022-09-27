package com.example.alejandronasarreparte1_pmdm.parte3

fun main() {
    //calculo de cantidad de numeros pares e impares de n numeros
    println("cantidad de numeros a introducir:")
    val nNumeros =  readLine()!!.toInt()
    var nPares = 0
    for (i in 1..nNumeros) {
        println("introducir numero $i:")
        val n = readLine()!!.toInt()
        if (n % 2 == 0)
            nPares++
    }
    val nImpares =  nNumeros - nPares
    println("hay $nPares numeros pares")
    println("hay $nImpares numeros impares")
}