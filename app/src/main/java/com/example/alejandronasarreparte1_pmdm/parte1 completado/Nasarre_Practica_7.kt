package com.example.alejandronasarreparte1_pmdm

fun main() {
    //calculo de la cantidad que debe abonar el comprador
    println("introducir precio producto")
    val precio = readLine()!!.toDouble()
    println("introducir cantidad")
    val cantidad = readLine()!!.toInt()
    println("a pagar: " + (precio * cantidad))
}