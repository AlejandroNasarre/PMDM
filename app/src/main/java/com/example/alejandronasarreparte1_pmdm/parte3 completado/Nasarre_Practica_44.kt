package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    // implementacion de bucle do while para el conteo y clasificacion de piezas por peso
    // hasta que el usuario introduce 0 por consola
    var cantPiezas = 0
    var cantPiezasLigeras = 0
    var cantPiezasMedianas = 0
    var cantPiezasPesadas = 0
    do {
        println("Introducir peso pieza, (0) para terminar:")
        val peso = readLine()!!.toFloat()
        if (peso != 0f) {
            cantPiezas++
            if (peso < 9.8f)
                cantPiezasLigeras++
            else if (peso > 10.2f)
                cantPiezasPesadas++
            else
                cantPiezasMedianas++
        }
    } while (peso != 0f)
    println("cantidad total de piezas: $cantPiezas")
    println("cantidad de piezas menores de 9.8kg: $cantPiezasLigeras")
    println("cantidad de piezas de entre 9.8kg y 10.2kg: $cantPiezasMedianas")
    println("cantidad de piezas mayores de 10.2kg: $cantPiezasPesadas")
}