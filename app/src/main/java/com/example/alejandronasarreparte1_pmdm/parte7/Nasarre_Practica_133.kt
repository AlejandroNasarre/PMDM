package com.example.alejandronasarreparte1_pmdm.parte7

//utilizacion de constantes de una clase enumerada
fun main() {
    println("${Paises.MEXICO}, ${Paises.MEXICO.habitantes}")
    println("${Paises.ARGENTINA}, ${Paises.ARGENTINA.habitantes}")
}

//clase enumerada paises con constante habitantes
enum class Paises(val habitantes: Int) {
    COLOMBIA(300000),
    MEXICO(666666),
    ARGENTINA(3141592),
}