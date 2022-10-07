package com.example.alejandronasarreparte1_pmdm

fun main() {
    fun main() {
        //programa para clasificar la nota media de un alumno
        println("introducir nota 1:")
        val n1 = readLine()!!.toInt()
        println("introducir nota 2:")
        val n2 = readLine()!!.toInt()
        println("introducir nota 3:")
        val n3 = readLine()!!.toInt()
        val promedio = (n1 + n2 + n3) / 3
        if (promedio >= 7)
            println("promocionado")
        else if (promedio >= 4)
            println("regular")
        else
            println("reprobado")
    }
}