package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//calculo de la superficie de un cuadrado mediante
//funcion con unica expresion
fun main() {
    println("introducir lado cuadrado:")
    val lado = readLine()!!.toInt()
    println("la superficie del cuadrado es ${superficie(lado)}")
}

//funcion con unica expresion para calcular la superficie de un cuadrado
fun superficie(lado: Int) = lado * lado