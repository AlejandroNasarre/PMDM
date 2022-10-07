package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //introduccion de 10 valores por consola y conteo de numeros negativos, numeros positivos,
    // numeros multiples de 15 y calculo del valor acumulado de los numeros pares
    var nNeg = 0
    var nPos = 0
    var nMult15 = 0
    var sumaPares = 0
    for (i in 1..10) {
        println("introducir valor numero $i:")
        val n = readLine()!!.toInt()
        if (n > 0)
            nPos++
        else if (n < 0)
            nNeg++
        if (n % 15 == 0)
            nMult15++
        if (n % 2 == 0)
            sumaPares += n
    }
    println("Hay $nNeg numeros negativos")
    println("Hay $nPos numeros positivos")
    println("Hay $nMult15 numeros multiples de 15")
    println("El valor acumulado de los numeros pares es: $sumaPares")
}