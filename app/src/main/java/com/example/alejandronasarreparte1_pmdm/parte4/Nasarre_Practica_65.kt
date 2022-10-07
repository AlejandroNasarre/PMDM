package com.example.alejandronasarreparte1_pmdm.parte4

fun main() {
    //Introduccion de n triangulos(especificado por consola),y sus respectivos lados,
    //mostrar tipo de triangulo y conteo de tipos de triangulos mediante estructura condicional when
    println("introducir numero de triangulos a ingresar:")
    val nTriangulos = readLine()!!.toInt()
    var tEquilateros = 0
    var tIsosceles = 0
    var tEscaleno = 0
    for (i in 1..nTriangulos) {
        println("introducir primer lado del triangulo numero $i:")
        val lado1 = readLine()!!.toInt()
        println("introducir segundo lado del triangulo numero $i:")
        val lado2 = readLine()!!.toInt()
        println("introducir tercer lado del triangulo numero $i:")
        val lado3 = readLine()!!.toInt()

        when {
            lado1 == lado2 && lado1 == lado3 -> {
                println("triangulo equilatero.")
                tEquilateros++
            }
            lado1 == lado2 || lado1 == lado3 || lado2 == lado3 -> {
                println("triangulo isosceles")
                tIsosceles++
            }
            else -> {
                println("triangulo escaleno")
                tEscaleno++
            }
        }
    }
    println("Hay $tEquilateros triangulos equilateros, $tIsosceles triangulos isosceles y $tEscaleno triangulos escalenos,")
}