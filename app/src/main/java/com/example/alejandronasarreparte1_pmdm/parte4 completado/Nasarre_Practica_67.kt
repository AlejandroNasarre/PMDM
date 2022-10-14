package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //clasificacion de un numero introducido por consola segun la
    //cantidad de digitos mediante estructura condicional when
    //con parametro
    println("introducir valor (1-10000):")
    val n = readLine()!!.toInt()
    when(n){
         in 1..9 -> println("1 digito")
         in 10..99 -> println("2 digitos")
         in 100..999 -> println("3 digitos")
         in 1000..9999 -> println("4 digitos")
        else -> println("numero fuera de rango")
    }
}