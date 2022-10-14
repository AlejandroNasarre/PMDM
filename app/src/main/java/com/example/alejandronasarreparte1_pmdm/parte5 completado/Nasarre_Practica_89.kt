package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//calculo del perimetro de un cuadrado mediante metodo con unica expresion
fun main() {
    println("introducir lado cuadrado:")
    val lado = readLine()!!.toInt()
    println("el perimetro del cuadrado es ${perimetro2(lado)}")
}

//funcion con unica expresion que devuelve el perimetro de un cuadrado de lado introducido por parametro
fun perimetro2(lado: Int) = lado * 4
