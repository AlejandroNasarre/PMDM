package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//programa que permite llenar un array por consola y mostrar si esta ordenado
//de menor a mayor
fun main() {
    val valores = IntArray(10)
    for (i in 0..9) {
        println("introducir numero ${i + 1}")
        valores[i] = readLine()!!.toInt()
    }
    var ordenado = true
    for (i in 1..9) {
        if (valores[i - 1] > valores[i])
            ordenado = false
    }
    if (ordenado)
        println("el array esta ordenado")
    else
        println("el array no esta ordenado")
}