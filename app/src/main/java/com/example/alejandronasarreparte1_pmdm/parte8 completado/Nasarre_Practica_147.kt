package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de orden superior
fun main() {
    val resultado1 = operar(10, 5, ::sumar)
    val resultado2 = operar(10, 5, ::restar)
    val resultado3 = operar(10, 5, ::multiplicar)
    val resultado4 = operar(10, 5, ::dividir)

    println(resultado1)
    println(resultado2)
    println(resultado3)
    println(resultado4)
}

//funcion de orden superior
fun operar(v1: Int, v2: Int, fn: (Int, Int) -> Int): Int {
    return fn(v1, v2)
}

//funcion que devuelve la suma de los valores introducidos por parametro
fun sumar(x1: Int, x2: Int) = x1 + x2

//funcion que devuelve la resta de los valores introducidos por parametro
fun restar(x1: Int, x2: Int) = x1 - x2

//funcion que devuelve la multiplicacion de los valores introducidos por parametro
fun multiplicar(x1: Int, x2: Int) = x1 * x2

//funcion que devuelve la division de los valores introducidos por parametro
fun dividir(x1: Int, x2: Int) = x1 / x2
