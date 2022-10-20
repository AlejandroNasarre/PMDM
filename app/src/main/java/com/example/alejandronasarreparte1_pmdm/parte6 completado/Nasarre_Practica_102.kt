package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//programa que permite llenar un array por consola y mostrar los
//elementos posteriormente
fun main() {
    val valores = IntArray(5)
    for (i in 0..4) {
        println("introducir numero ${i + 1}")
        valores[i] = readLine()!!.toInt()
    }
    for (e in valores)
        println(e)
}