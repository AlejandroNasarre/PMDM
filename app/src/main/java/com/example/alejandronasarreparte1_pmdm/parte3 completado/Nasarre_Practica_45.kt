package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    // implementacion de bucle do while para calcular la suma de n numeros introducidos por
    // consola hasta que el usuario introduce 9999
    var suma = 0
    do {
        println("Introducir valor a sumar, (9999) para terminar:")
        val n = readLine()!!.toInt()
        if (n != 9999) {
            suma += n
        } else
            println("la carga de valores a terminado")
    } while (n != 9999)
    if (suma > 0)
        println("la suma total es $suma es mayor a cero")
    else if (suma < 0)
        println("la suma total es $suma es menor que cero")
    else
        println("la suma total es cero")
}