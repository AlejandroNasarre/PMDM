package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //impresion de la tabla de multiplicar de un numero introducido por consola
    //hasta multiplicarlo por 12
    println("introducir valor(1-10) para mostrar tabla de multiplicar")
    val n = readLine()!!.toInt()
    for (i in 1..12)
        println("$n * $i = ${n * i}")
}