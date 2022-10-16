package com.example.alejandronasarreparte1_pmdm.parte6
//programa que permite llenar dos arrays por consola e introducir en un tercer array
//el resultado de la suma de los valores de las mismas posiciones de los dos
//primeros arrays
fun main() {
    val valores1 = IntArray(4)
    for (i in 0..3) {
        println("introducir numero ${i + 1} del primer array")
        valores1[i] = readLine()!!.toInt()
    }
    val valores2 = IntArray(4)
    for (i in 0..3) {
        println("introducir numero ${i + 1} del segundo array")
        valores2[i] = readLine()!!.toInt()
    }
    val valoresSuma = IntArray(4)
    for (i in 0..3) {
        valoresSuma[i] = valores1[i] + valores2[i]
    }
}