package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//programa que permite llenar un array por consola y mostrarlo
//posteriormente
fun main() {
    val sueldos = IntArray(5)
    for (i in 0..4) {
        println("introducir sueldo numero ${i + 1}")
        sueldos[i] = readLine()!!.toInt()
    }
    for (i in sueldos)
        println(i)
}