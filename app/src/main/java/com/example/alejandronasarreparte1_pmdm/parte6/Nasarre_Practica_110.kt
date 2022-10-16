package com.example.alejandronasarreparte1_pmdm.parte6
//creacion de un objeto triangulo con tres lados de variable y utilizacion de sus funciones
fun main() {
    val triangulo = Triangulo()
    val lado1 = 2
    val lado2 = 4
    val lado3 = 6
    triangulo.inicializarTriangulo(lado1,lado2,lado3)
    triangulo.ladoMasGrande()
    triangulo.esEquilatero()

}

class Triangulo {
    private var lado1 = 0
    private var lado2 = 0
    private var lado3 = 0

    //inicializador de las variables de clase
    fun inicializarTriangulo(lado1 : Int,lado2 : Int,lado3 : Int) {
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
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