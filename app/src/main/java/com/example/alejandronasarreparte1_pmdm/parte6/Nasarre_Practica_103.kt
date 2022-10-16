package com.example.alejandronasarreparte1_pmdm.parte6
//programa que permite llenar un array por consola y mostrar el valor acumulado,
//el valor acumulado de los numeros mayores a 36 y los numeros mayores a 50
fun main() {
    val valores = IntArray(8)
    for (i in 0..7) {
        println("introducir numero ${i + 1}")
        valores[i] = readLine()!!.toInt()
    }
    var acumulado = 0
    var acumulado36 = 0
    var nMayores50 = 0
    for (e in valores) {
        acumulado += e
        if (e > 36)
            acumulado36 += e
        if (e > 50)
            nMayores50++
    }
}