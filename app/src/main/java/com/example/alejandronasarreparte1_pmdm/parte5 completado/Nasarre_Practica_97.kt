package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

fun main() {
    mayorDe2_5veces()
}

//funcion que pide 2 numeros 5 veces y muestra el mayor
//mediante funcion interna
fun mayorDe2_5veces() {
    fun mayorDe(n1: Int, n2: Int) = if (n1 > n2) n1 else n2
    for (i in 1..5) {
        println("introducir primer valor $i:")
        val n1 = readLine()!!.toInt()
        println("introducir segundo valor $i:")
        val n2 = readLine()!!.toInt()
        println("el mayor es ${mayorDe(n1,n2)}")
    }
}