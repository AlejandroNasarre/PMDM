package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//programa que permite llenar un array por consola y mostrar el primer y ultimo
//elemento
fun main() {
    val valores = IntArray(10)
    for (i in 0..9) {
        println("introducir numero ${i + 1}")
        valores[i] = readLine()!!.toInt()
    }
    println("El primer elemento es ${valores[0]}")
    println("El ultimo elemento es ${valores[valores.size-1]}")
}