package com.example.alejandronasarreparte1_pmdm

fun main() {
    //asignacion de valor a una variable mediante if else 2
    println("introducir valor:")
    val n1 = readLine()!!.toInt()
    val resultado = if (n1 % 2 == 0){
        print("el cuadrado es: ")
        n1*n1
    }else{
        print("el cubo es: ")
        n1*n1*n1
    }
    println(resultado)
}