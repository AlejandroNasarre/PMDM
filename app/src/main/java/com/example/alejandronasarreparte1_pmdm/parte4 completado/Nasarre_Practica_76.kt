package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //programa que permite cargar el lado de un cuadrado y la decision
    //de mostrar el area o el perimetro
    println("Introducir lado cuadrado:")
    val lado = readLine()!!.toInt()
    println("¿Que quieres calcular? perimetro(p) o superficie(s):")
    when(readLine()!!.toString()){
        "p" -> perimetro(lado)
        "s" -> superficie(lado)
        else -> println("respuesta no valida")
    }
}
//funcion para calcular el perimetro de un cuadrado con lado introducido por parametro
fun perimetro(lado: Int) {
    println("el perimetro del cuadrado con lado $lado es : ${lado * 4}")
}
//funcion para calcular la superficie de un cuadrado con lado introducido por parametro
fun superficie(lado: Int) {
    println("la superficie del cuadrado con lado $lado es : ${lado * lado}")
}
