package com.example.alejandronasarreparte1_pmdm.`parte7 completado`
//implementacion de clase padre abstracta operar y clases hijas Sumar y
//Restar
fun main() {
    val suma= Sumar(5,4)
    suma.calcular()
    suma.mostrarResultado()
    val restar= Restar(5,4)
    restar.calcular()
    restar.mostrarResultado()
}

//clase padre abstracta operar
abstract class Operacion(var n1: Int, var n2: Int) {
    var resultado: Int = 0

    //funcion para mostrar el resultado
    fun mostrarResultado() {
        println(resultado)
    }

    //funcion abstracta para calcular el resultado
    abstract fun calcular()
}

//clase hija sumar
class Sumar(n1: Int, n2: Int) : Operacion(n1, n2) {
    //funcion overrideada para calcular la suma
    override fun calcular() {
        resultado = n1 + n2
    }
}

//clase hija restar
class Restar(n1: Int, n2: Int) : Operacion(n1, n2) {
    //funcion overrideada para calcular la resta
    override fun calcular() {
        resultado = n1 - n2
    }
}