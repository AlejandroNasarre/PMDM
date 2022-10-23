package com.example.alejandronasarreparte1_pmdm.`parte10 completado`
//implementacion de diccionario mediante mapa
fun main() {
    val diccionario = mapOf(
        entrada(), entrada(), entrada()
    )
    mostrar(diccionario)
    buscar(diccionario)
}

//funcion para introducir entradas al diccionario
fun entrada(): Pair<String, String> {
    println("introducir palabra en ingles")
    val key = readLine()!!.toString()
    println("introducir palabra en castellano")
    val value = readLine()!!.toString()
    return Pair(key, value)
}

//funcion para mostrar el diccionario
fun mostrar(diccionario: Map<String, String>) {
    for ((ingles, castellano) in diccionario)
        println("palabra en ingles: $ingles, palabra en castellano: $castellano")
}

//funcion para buscar una palabra en el diccionario
fun buscar(diccionario: Map<String, String>) {
    println("palabra a buscar en ingles")
    val buscar = readLine()!!.toString()
    if (buscar in diccionario)
        println(diccionario.get(buscar))
    else
        println("la palabra no esta en el diccionario")
}