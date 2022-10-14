package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//calculo de la superficie de un cuadrado mediante metodo
fun main() {
    println("introducir lado cuadrado:")
    val lado = readLine()!!.toInt()
    println("La superficie del cuadrado es ${superficie2(lado)}")
}
//funcion que devuelve la superficie de un cuadrado de lado introducido por parametro
fun superficie2(lado: Int): Int {
    return lado * lado
}