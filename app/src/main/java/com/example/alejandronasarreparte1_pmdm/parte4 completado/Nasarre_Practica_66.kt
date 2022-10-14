package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //impresion en letra de un numero introducido por consola (1-5)
    //mediante estructura condicional when con argumento
    println("Introducir valor (1-5):")
    val n = readLine()!!.toInt()
    when (n) {
        1 -> print("uno")
        2 -> print("dos")
        3 -> print("tres")
        4 -> print("cuatro")
        5 -> print("cinco")
    }
}