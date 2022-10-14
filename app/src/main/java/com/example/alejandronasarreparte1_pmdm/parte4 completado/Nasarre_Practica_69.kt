package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //clasificacion de 10 familias seguno la cantidad de hijos
    //introducidos por consola mediante estructura condicional when
    //con parametro
    var n0Hijos = 0
    var n1Hijos = 0
    var n2Hijos = 0
    var nMasHijos = 0
    for (i in 1..10) {
        println("introducir cantidad de hijos familia numero $i:")
        val nHijos = readLine()!!.toInt()
        when (nHijos) {
            0 -> n0Hijos++
            1 -> n1Hijos++
            2 -> n2Hijos++
            else -> nMasHijos++
        }
    }
    println("hay $n0Hijos familias con 0 hijos.")
    println("hay $n1Hijos familias con 1 hijo.")
    println("hay $n2Hijos familias con 2 hijos.")
    println("hay $nMasHijos familias con mas de 2 hijos.")
}