package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//programa para mostrar el promedio de tres numeros introducidos por consola
//mediante funcion con unica expresion
fun main() {
    println("Introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("Introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("Introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    println("el promedio es: ${promedioDe3_2(n1,n2,n3)}")
}

//funcion con unica expresion para calcular el promedio de los numeros pasados por parametro
fun promedioDe3_2(n1: Int, n2: Int, n3: Int) = (n1+n2+n3).toFloat()/3