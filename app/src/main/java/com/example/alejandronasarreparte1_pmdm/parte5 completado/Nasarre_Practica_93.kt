package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//programa con funcion que permite sumar de 2 a 5 enteros mediante variables opcionales
fun main() {
    println("la suma de 2 + 3 = ${sumar(2, 3)}")
    println("la suma de 2 + 3 + 4 + 5 = ${sumar(2, 3, 4, 5)}")
}

//funcion para sumar de 2 a 5 enteros
fun sumar(n1: Int, n2: Int, n3: Int = 0, n4: Int = 0, n5: Int = 0) = n1 + n2 + n3 + n4 + n5