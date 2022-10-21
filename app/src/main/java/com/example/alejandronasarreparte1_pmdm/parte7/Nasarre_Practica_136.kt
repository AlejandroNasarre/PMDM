package com.example.alejandronasarreparte1_pmdm.parte7
//implementacion de objecto interno y utilizacion de sus funciones

fun main() {
    val mayor = object {
        //funcion para devolver el mayor de dos Ints
        fun mayor(n1: Int, n2: Int) = if (n1 > n2) n1 else n2

        //funcion para devolver el mayor de dos Floats
        fun mayor(n1: Float, n2: Float) = if (n1 > n2) n1 else n2

        //funcion para devolver el mayor de dos Double
        fun mayor(n1: Double, n2: Double) = if (n1 > n2) n1 else n2
    }

    println(mayor.mayor(3, 4))
    println(mayor.mayor(3f, 4f))
    println(mayor.mayor(3.6, 4.7))
}