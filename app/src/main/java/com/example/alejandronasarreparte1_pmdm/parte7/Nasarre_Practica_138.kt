package com.example.alejandronasarreparte1_pmdm.parte7

//implementacion de dos clases Calculadora y CalculadoraCientifica mediante
//herencia y utilizacion de sus metodos
fun main() {
    val calc = CalculadoraCientifica()
    println(calc.sumar(45.0, 54.0))
    println(calc.restar(45.0, 54.0))
    println(calc.multiplicar(45.0, 54.0))
    println(calc.dividir(45.0, 54.0))
    println(calc.elevar(45.0, 54.0))
    println(calc.raizCuadrada(54.0))
}

//clase padre calculadora con metodos basicos
open class Calculadora {
    //funcion para sumar dos valores
    fun sumar(n1: Double, n2: Double) = n1 + n2

    //funcion para restar dos valores
    fun restar(n1: Double, n2: Double) = n1 - n2

    //funcion para multiplicar dos valores
    fun multiplicar(n1: Double, n2: Double) = n1 * n2

    //funcion para dividir dos valores
    fun dividir(n1: Double, n2: Double) = n1 / n2
}

//clase hija con metodos basicos heredados y metodos mas avanzados
class CalculadoraCientifica : Calculadora() {
    //funcion para elevar un valor
    fun elevar(n: Double, e: Double) = Math.pow(n, e)

    //funcion para sacar la raiz cuadrada de un valor
    fun raizCuadrada(n: Double) = Math.sqrt(n)
}