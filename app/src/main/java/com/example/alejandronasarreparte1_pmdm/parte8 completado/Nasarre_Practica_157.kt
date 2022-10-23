package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//creacion de array de dados y conteo de los valores conseguidos
//mediante implementacion lambda de foreach
fun main() {
    val dados: Array<Dado2> = arrayOf(
        Dado2(),
        Dado2(),
        Dado2(),
        Dado2(),
        Dado2()
    )
    var contar1 = 0
    var contar2 = 0
    var contar3 = 0
    var contar4 = 0
    var contar5 = 0
    var contar6 = 0

    dados.forEach {
        it.tirar()
        it.mostrarValor()
        when (it.valor) {
            1 -> contar1++
            2 -> contar2++
            3 -> contar3++
            4 -> contar4++
            5 -> contar5++
            6 -> contar6++
        }
    }
    println("hay $contar1 1s")
    println("hay $contar2 2s")
    println("hay $contar3 3s")
    println("hay $contar4 4s")
    println("hay $contar5 5s")
    println("hay $contar6 6s")
}

//clase padre dado con valor y metodo tirar y mostrar
open class Dado2 {
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