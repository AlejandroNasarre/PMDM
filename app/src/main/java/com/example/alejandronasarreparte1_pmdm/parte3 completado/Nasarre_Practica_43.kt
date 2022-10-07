package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    // implementacion de bucle do while para calcular el promedio de n numeros introducidos por
    // consola hasta que el usuario introduce 0
    var suma = 0
    var nNumeros = 0
    do {
        println("Introducir valor, (0) para terminar:")
        val n = readLine()!!.toInt()
        if (n != 0) {
            suma += n
            nNumeros++
        }
    } while (n != 0)
    println("El promedio es: " + (suma.toFloat()/nNumeros))
}