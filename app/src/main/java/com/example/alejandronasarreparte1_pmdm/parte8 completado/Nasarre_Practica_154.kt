package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de orden superior y funciones lambda
fun main() {
    val array = IntArray(10) { (Math.random() * 100 + 1).toInt() }

    for (e in array)
        println(e)

    var cantidadMultiples3 = 0
    calculo(array) { if (it % 3 == 0) cantidadMultiples3++ }
    println("hay $cantidadMultiples3 multiples de 3")

    var sumaMayores50 = 0
    calculo(array) { if (it >= 50) sumaMayores50 += it }
    println("la suma de los numeros mayores de 50 es $sumaMayores50")
}
//funcion de orden superior
fun calculo(array: IntArray, fn: (Int) -> Unit) {
    for (e in array)
        fn(e)
}