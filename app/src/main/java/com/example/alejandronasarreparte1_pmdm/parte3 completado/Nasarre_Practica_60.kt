package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //clasificacion de la media de las notas de un alumno
    //mediante estructura condicional when
    println("introducir primera nota")
    val nota1 = readLine()!!.toInt()
    println("introducir segunda nota")
    val nota2 = readLine()!!.toInt()
    println("introducir tercera nota")
    val nota3 = readLine()!!.toInt()
    val promedio = (nota1 + nota2 + nota3)/3
    when{
        promedio >= 7 -> println("Promocionado")
        promedio in 4..6 -> println("Regular")
        promedio < 4 -> println("Reprobado")
    }
}