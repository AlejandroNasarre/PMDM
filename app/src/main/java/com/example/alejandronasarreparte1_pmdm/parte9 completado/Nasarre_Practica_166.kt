package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//clase Tateti con funciones operadoras set y get sobrecargadas
fun main() {
    var tateti = TaTeTi()
    tateti.imprimir()
    tateti[0, 2] = 1
    tateti[1, 1] = 2
}

class TaTeTi {
    val tablero = IntArray(9)
    fun imprimir() {
        for (fila in 0..2) {
            for (columna in 0..2)
                print("${this[fila, columna]} ")
            println()
        }
        println()
    }

    //funcion operador set sobrecargada
    operator fun set(fila: Int, columna: Int, valor: Int) {
        tablero[fila * 3 + columna] = valor
        imprimir()
    }

    //funcion operador get sobrecargada
    operator fun get(fila: Int, columna: Int): Int {
        return tablero[fila * 3 + columna]
    }
}