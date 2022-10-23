package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//clase Numeros con un array de 5 numeros que se llenan de forma automatica
fun main() {
    val numeros = Numeros()
    numeros.imprimir()
}

class Numeros {
    private val numeros = IntArray(5)

    init {
        llenar()
    }

    //funcion privada que llena el array con numeros aleatorios
    private fun llenar() {
        for (i in numeros.indices)
            numeros[i] = ((Math.random() * 11)).toInt()
    }

    //funcion que imprime los numeros del array
    fun imprimir() {
        for (i in numeros.indices)
            println("${numeros[i]}")
    }
}