package com.example.alejandronasarreparte1_pmdm.`parte7 completado`
//implementacion de dos clases Dado y DadoRrecuadro mediante
//herencia y utilizacion de sus metodos
fun main() {
    val dado = Dado4()
    dado.tirar()
    dado.mostrarValor()
    val dado2 = DadoRecuadro()
    dado2.tirar()
    dado2.mostrarValor()
}
//clase padre dado con valor y metodo tirar y mostrar
open class Dado4 {
    var valor = 1
    //funcion que permite asignarle un valor aleatorio al dado
    fun tirar() {
        valor = (Math.random() * 6 + 1).toInt()
    }
//funcion que permite mostrar el valor del dado
    open fun mostrarValor() {
        println(valor)
    }
}
//clase hija con metodo overrideado de mostrarValor
class DadoRecuadro : Dado4() {
    override fun mostrarValor() {
        println("***\n*$valor*\n***")
    }
}