package com.example.alejandronasarreparte1_pmdm.`parte6 completado`

//creacion de dos objetos triangulo con tres lados con distintos constructores de
//variable y utilizacion de sus funciones
fun main() {
    val lado1 = 2
    val lado2 = 4
    val lado3 = 6
    val triangulo1 = Triangulo3(lado1, lado2, lado3)
    triangulo1.ladoMasGrande()
    triangulo1.esEquilatero()
    val triangulo2 = Triangulo3()
    triangulo2.ladoMasGrande()
    triangulo2.esEquilatero()
}

//clasee Triangulo con 2 constructores
class Triangulo3(var lado1: Int, var lado2: Int, var lado3: Int) {
    //segundo constructor con valores ingresados por teclado
    constructor() : this(0, 0, 0) {
        println("introducir lado 1:")
        lado1 = readLine()!!.toInt()
        println("introducir lado 2:")
        lado2 = readLine()!!.toInt()
        println("introducir lado 3:")
        lado3 = readLine()!!.toInt()
    }

    //funcion para imprimir el lado mas grande del objeto
    fun ladoMasGrande() {
        if (lado1 > lado2 && lado1 > lado3)
            println(lado1)
        else if (lado2 > lado3)
            println(lado2)
        else
            println(lado3)
    }

    //funcion para comprobar que es mayor de edad
    fun esEquilatero() {
        if (lado1 == lado2 && lado2 == lado3)
            println("es equilatero")
        else
            println("no es equilatero")
    }
}