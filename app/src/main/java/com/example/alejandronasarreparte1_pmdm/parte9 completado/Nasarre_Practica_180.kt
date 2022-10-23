package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de lista inmutable de tipo Double
//calculo de promedio y conteo de personas bajas y altas
fun main() {
    val alturas = List(5) {
        println("introducir altura:")
        readLine()!!.toDouble()
    }
    val promedio = alturas.average()
    val bajos = alturas.count() { it < promedio }
    val altos = alturas.count() { it > promedio }

    println("el promedio es $promedio")
    println("hay $bajos personas por debajo del promedio")
    println("hay $altos personas por encima del promedio")
}