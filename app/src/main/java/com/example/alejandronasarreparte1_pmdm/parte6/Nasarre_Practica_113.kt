package com.example.alejandronasarreparte1_pmdm.parte6
//creacion de un objeto triangulo con tres lados de variable y utilizacion de sus funciones
fun main() {
    val lado1 = 2
    val lado2 = 4
    val lado3 = 6
    val triangulo = Triangulo2(lado1,lado2,lado3)
    triangulo.ladoMasGrande()
    triangulo.esEquilatero()

}
//calse Triangulo con constructor
class Triangulo2 (var lado1 : Int,var lado2 : Int,var lado3 : Int){
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