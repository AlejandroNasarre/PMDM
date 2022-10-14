package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

//programa que permite mostrar el numero mayor de tres valores introducidos
//por pantalla mediante funciones
fun main() {
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    mayorDeTres(n1,n2,n3)
}
//funcion para mostrar por pantalla el numero mayor de tres valores introducidos
//por parametro
fun mayorDeTres(n1: Int, n2: Int, n3: Int) {
    if (n1 > n2 && n1 > n3)
        println("el mayor es $n1.")
    else if (n2 > n3)
        println("el mayor es $n2.")
    else
        println("el mayor es $n3.")
}