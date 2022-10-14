package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//programa para mostrar la tabla de multiplicar
//mediante argumentos nombrados
fun main() {
    val n = 7
    val termino = 56
    tablaDeMultiplicar(n = n, termino = termino)
}

//funcion que calcula la tabla de multiplicar con atributo opcional
fun tablaDeMultiplicar(n: Int, termino: Int = 10) {
    for (i in 0..termino)
        println("$n * $i = ${n * i}")
}