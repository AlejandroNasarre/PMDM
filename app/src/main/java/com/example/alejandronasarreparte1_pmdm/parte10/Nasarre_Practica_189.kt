package com.example.alejandronasarreparte1_pmdm.parte10

fun main() {
    val boleto = boleto()
    val tiradas: MutableSet<Int> = mutableSetOf()
    while (!tiradas.containsAll(boleto))
        tirar(tiradas)
    println("boleto: $boleto")
    println("tiradas: $tiradas")
    println("tiradas totales: ${tiradas.size}")
}

fun boleto(): MutableSet<Int> {
    val boleto = mutableSetOf<Int>()
    while (boleto.size <= 6)
        boleto.add((Math.random() * 50 + 1).toInt())
    return boleto
}

fun tirar(tiradas: MutableSet<Int>) {
    var tirada = (Math.random() * 50 + 1).toInt()
    while (tirada in tiradas)
        tirada = (Math.random() * 50 + 1).toInt()
    println("tirada: $tirada")
    tiradas.add(tirada)
}