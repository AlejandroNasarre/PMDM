package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//programa para jugar a los dados mediante las clases Dado y JuegoDeDados
fun main() {
    val juegoDeDados = JuegoDeDados()
    juegoDeDados.jugar()
}

class Dado() {
    var valor = 1
    //funcion para lanzar el dado
    fun tirar() {
        valor = (Math.random() * 6 + 1).toInt()
    }

    //funcion para imprimir el resultado del dado
    fun imprimir() {
        println(valor)
    }
}

class JuegoDeDados() {
    val dado1 = Dado()
    val dado2 = Dado()
    val dado3 = Dado()

    //funcion para lanzar los dados
    fun jugar() {
        dado1.tirar()
        dado1.imprimir()
        dado2.tirar()
        dado2.imprimir()
        dado3.tirar()
        dado3.imprimir()
        if (dado1.valor == dado2.valor && dado2.valor == dado3.valor)
            println("has ganado")
        else {
            println("has perdido")
        }
    }
}