package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa que permite mostrar el numero menor de tres valores introducidos
//por pantalla mediante funciones
fun main() {
    menorDeTres()
    menorDeTres()
}
//funcion para mostrar por pantalla el numero menor de tres valores introducidos
fun menorDeTres(){
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    if (n1 < n2 && n1 < n3)
        println("el menor es $n1.")
    else if (n2 < n3)
        println("el menor es $n2.")
    else
        println("el menor es $n3.")
}