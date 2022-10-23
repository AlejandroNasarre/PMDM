package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//implementacion de arraylist de dados y utilizacion de sus metodos
fun main() {
    val dados = arrayListOf<Dado>()
    for (i in 1..5)
        dados.add(Dado())

    for (dado in dados)
        dado.tirar()

    for (dado in dados)
        dado.mostrarValor()
}

//clase padre dado con valor y metodo tirar y mostrar
open class Dado {
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