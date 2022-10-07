package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //conteo de los multiples de 3, 5 y 9 entre el 1 y el 10000
    //mediante for y operador de rango
    var multiples3 = 0
    var multiples5 = 0
    var multiples9 = 0
    for (i in 1..10000) {
        if (i % 3 == 0)
            multiples3++
        if (i % 5 == 0)
            multiples5++
        if (i % 9 == 0)
            multiples9++
    }
    println("hay $multiples3 multiples de 3.")
    println("hay $multiples5 multiples de 5.")
    println("hay $multiples9 multiples de 9.")
}