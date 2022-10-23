package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de mutable list dados, llenado con funcion lambda
//contado de valores igual a 1 y eliminacion de valores iguales a 6
fun main() {
    val dados: MutableList<Int> = MutableList(20) { (Math.random() * 6 + 1).toInt() }
    println(dados)
    val contar1 = dados.count() {it == 1}
    println("hay $contar1 valores igual a 1")
    dados.removeAll {it == 6}
    println(dados)
}