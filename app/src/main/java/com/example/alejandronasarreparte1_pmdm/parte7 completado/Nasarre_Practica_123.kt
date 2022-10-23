package com.example.alejandronasarreparte1_pmdm.`parte7 completado`
//creacion de la clase Dado y utilizacion de sus metodos
fun main() {
    val dado = Dado()
    dado.imprimir()
    dado.tirar()
    dado.imprimir()
}

class Dado() {
    private var valor = 1
    //funcion para lanzar el dado
    fun tirar() {
        valor = (Math.random() * 6 + 1).toInt()
    }

    //funcion para imprimir el resultado del dado y llamada a la privado
    fun imprimir() {
        println(valor)
        imprimirLinea()
    }
    //funcion privada para imprimir linea separadora
    private fun imprimirLinea(){
        println("-------------------------")
    }
}