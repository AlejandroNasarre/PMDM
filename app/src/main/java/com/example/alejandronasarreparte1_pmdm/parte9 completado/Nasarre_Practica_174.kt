package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de lista mediante la funcion List y
//expresion lambda
fun main() {
    val lista: List<Int> = List(5) { cargar() }
    println(lista)
}
//funcion  que retorna un valor leido por pantalla
fun cargar(): Int {
    println("Ingrese un entero:")
    val valor = readLine()!!.toInt()
    return valor
}
