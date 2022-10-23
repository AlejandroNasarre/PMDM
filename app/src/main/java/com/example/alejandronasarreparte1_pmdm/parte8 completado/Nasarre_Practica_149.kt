package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de orden superior y expresiones lambda
fun main() {
    val suma = operar2(2, 3,) { x, y -> x + y }
    println(suma)
    val resta = operar2(12, 2) { x, y -> x - y }
    println(resta)
    val elevarA = operar2(2, 4) { x, y ->
        var valor = 1
        for (i in 1..y)
            valor *=  x
        valor
    }
    println(elevarA)
}
//funcion de orden superior
fun operar2(n1: Int, n2: Int, fn: (Int, Int) -> Int): Int {
    return fn(n1, n2)
}
