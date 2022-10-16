package com.example.alejandronasarreparte1_pmdm.parte6
//carga e impresion de la suma de los valores de un array de cantidad
//cargada por consola mediante funciones
fun main() {
    println("tamaño del array:")
    val tamano = readLine()!!.toInt()
    val array = crearArray(tamano)
    val suma = sumarArray(array)
    println("la suma del array es $suma")
}
//funcion para crear y llenar el array
fun crearArray(tamano: Int): IntArray {
    val array = IntArray(tamano)
    for (i in array.indices) {
        println("Ingresar valor numero $i:")
        array[i] = readLine()!!.toInt()
    }
    return array
}
//funcion para sumar los valores de un array
fun sumarArray(array: IntArray): Int {
    var suma = 0
    for (i in array.indices)
        suma += array[i]
    return suma
}
