package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//creacion de lista, conteo de rangos y verificacion de aparicion
//de valor numero 20
fun main() {
    val numeros: List<Int> = List(100) { (Math.random() * 20 + 1).toInt() }
    println(numeros)
    val cant1_4 = numeros.count { it in 1..4 }
    val cant5_8 = numeros.count { it in 5..8 }
    val cant10_13 = numeros.count { it in 10..13 }
    println("hay $cant1_4 numeros entre el 1 y el 4")
    println("hay $cant5_8 numeros entre el 5 y el 8")
    println("hay $cant10_13 numeros entre el 10 y el 13")
    if (20 in numeros)
        println("hay almenos un 20 en la lista")
}