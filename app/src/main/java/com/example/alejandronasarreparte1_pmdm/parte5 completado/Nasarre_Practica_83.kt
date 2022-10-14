package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//calculo del perimetro de un cuadrado mediante metodo
fun main() {
    println("introducir lado cuadrado:")
    val lado = readLine()!!.toInt()
    println("el perimetro del cuadrado es ${perimetro(lado)}")
}
//funcion que devuelve el perimetro de un cuadrado de lado introducido por parametro
fun perimetro(lado: Int): Int {
    return lado * 4
}