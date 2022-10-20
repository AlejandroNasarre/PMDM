package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//carga e impresion de un array mediante funciones
fun main() {
    val valores = IntArray(5)
    llenarArray(valores)
    imprimirArray(valores)
}

fun llenarArray(array: IntArray) {
    for (i in array.indices) {
        println("Ingresar valor numero $i:")
        array[i] = readLine()!!.toInt()
    }
}

fun imprimirArray(array: IntArray) {
    for (e in array)
        println(e)
}
