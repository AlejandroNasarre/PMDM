package com.example.alejandronasarreparte1_pmdm.parte6
//carga e impresion de un array de sueldos de cantidad
//cargada por consola mediante funciones
fun main() {
    println("cantidad de sueldos a intruducir:")
    val nSueldos = readLine()!!.toInt()
    val sueldos = IntArray(nSueldos)
    llenarArray(sueldos)
    imprimirArray(sueldos)
}
//funcion para llenar los sueldos
fun llenarSueldos(array: IntArray) {
    for (i in array.indices) {
        println("Ingresar sueldo numero $i:")
        array[i] = readLine()!!.toInt()
    }
}
//funcion para imprimir los sueldos
fun imprimirSueldos(array: IntArray) {
    for (i in array.indices)
        println("sueldo numero $i: ${array[i]}")
}
