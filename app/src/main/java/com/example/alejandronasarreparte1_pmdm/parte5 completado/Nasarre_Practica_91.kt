package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//programa para mostrar el numero de caracteres de dos strings introducidas
//por consola e impresion de la mayor mediante funcion con unica expresion
fun main() {
    println("Introducir primera cadena:")
    val str1 = readLine()!!.toString()
    println("Introducir segunda cadena:")
    val str2 = readLine()!!.toString()
    println("$str1 tiene ${numeroDeCaracteres2(str1)} caracteres")
    println("$str2 tiene ${numeroDeCaracteres2(str2)} caracteres")

    if (numeroDeCaracteres2(str1) > numeroDeCaracteres2(str2))
        println("$str1 es mayor")
    else if (numeroDeCaracteres2(str1) < numeroDeCaracteres2(str2))
        println("$str2 es mayor")
    else
        println("las dos cadenas tienen el mismo numero de caracteres.")
}

//funcion con unica expresion para calcular el numero de caracteres de un string
//pasado por parametro
fun numeroDeCaracteres2(str :String) = str.length
