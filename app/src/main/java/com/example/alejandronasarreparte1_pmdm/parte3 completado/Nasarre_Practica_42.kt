package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    // implementacion de bucle do while para clasificar un numero introducido por consola
    // hasta que el usuario introduce 0
    do {
        println("Introducir numero (1-999), (0) para terminar:")
        val n = readLine()!!.toInt()
        if (n < 10 && n > 0)
            println("el numero introducido tiene 1 digito")
        else if (n < 100)
            println("el numero introducido tiene 2 digitos")
        else if (n < 1000)
            println("el numero introducido tiene 3 digitos")
    } while (n != 0)
}