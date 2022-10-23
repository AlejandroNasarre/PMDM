package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de orden superior y funciones lambda
fun main() {
    val valores = IntArray(10)
    for (i in valores.indices)
        valores[i] = (Math.random() * 100).toInt()
    println("valores")
    for (v in valores)
        println(v)
    println("multiplos de 2")
    mostrar(valores) { x -> x % 2 == 0 }
    println("multiplos de 3 o 5")
    mostrar(valores) { x -> x % 3 == 0 || x % 5 == 0 }
    println("numeros mayores a 50")
    mostrar(valores) { x -> x >= 50 }
    println("numeros entre [1-10],[20-30] y [90-95]")
    mostrar(valores) { x ->
        when {
            x in 1..10 -> true
            x in 20..30 -> true
            x in 90..95 -> true
            else -> false
        }
    }
}
//funcion de orden superior que muestra los numeros del array que cumplen la
//condicion de la funcion pasadada por parametro
fun mostrar(valores: IntArray, fn: (Int) -> Boolean) {
    for (v in valores)
        if (fn(v))
            println(v)
}