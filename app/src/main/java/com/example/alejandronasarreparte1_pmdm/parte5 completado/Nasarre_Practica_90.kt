package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//calculo del rectangulo con mayor superficie de los introducidos por consola
//mediante funcion con unica expresion
fun main() {
    println("Introducir base primer rectangulo:")
    val base1 = readLine()!!.toInt()
    println("Introducir altura primer rectangulo:")
    val altura1 = readLine()!!.toInt()
    println("Introducir base segundo rectangulo:")
    val base2 = readLine()!!.toInt()
    println("Introducir altura segundo rectangulo:")
    val altura2 = readLine()!!.toInt()

    when {
        superficieRectangulo2(base1, altura1) > superficieRectangulo2(base2, altura2) -> {
            println("el primer rectangulo tiene mas superficie")
        }
        superficieRectangulo2(base1, altura1) < superficieRectangulo2(base2, altura2) -> {
            println("el primesegundo rectangulo tiene mas superficie")
        }
        else -> println("los dos rectangulos tienen las misma superficie")
    }
}

//funcion con unica expresion para calcular la superficie de un rectangulo
fun superficieRectangulo2(base: Int, altura: Int) = base * altura
