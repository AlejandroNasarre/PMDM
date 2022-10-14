package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//calculo de el numero mayor de dos valores introducidos por consola mediante
//funcion con unica expresion
fun main() {
    println("Introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("Introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("el mayor es: ${mayorDe(n1,n2)}")
}
//funcion con unica expresion para calcular el numero mayor de dos introducidos por parametro
fun mayorDe(n1: Int, n2: Int) = if (n1 > n2) n1 else n2