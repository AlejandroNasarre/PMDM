package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de lista semana con los dias de la semana
//y utilizacion de sus propiedades basicas
fun main() {
    val semana: List<String> = listOf(
        "lunes", "martes", "miercoles", "jueves",
        "viernes", "sábado", "domingo"
    )
    println("Imprimir la lista completa")
    println(semana)
    println("Imprimir el primer elemento de la lista")
    println(semana[0])
    println("Imprimir el primer elemento de la lista")
    println(semana.first())
    println("Imprimir el último elemento de la lista")
    println(semana.last())
    println("Imprimir la cantidad de elementos de la lista")
    println(semana.size)
    println("Recorrer la lista completa con un for")
    for (dia in semana)
        print("$dia ")
    println()
    println("Imprimir el elemento y su posición")
    for (posicion in semana.indices)
        print("($posicion)${semana[posicion]} ")
}