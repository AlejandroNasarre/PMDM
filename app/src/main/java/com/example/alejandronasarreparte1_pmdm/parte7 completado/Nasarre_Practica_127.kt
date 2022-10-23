package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//clase dado con control de valor introducido
fun main() {
    val dado = Dado2(8)
    dado.imprimir()
    dado.tirar()
    dado.imprimir()
}

//clase dado con control de valor introducido
class Dado2(private var valor: Int) {

    //control de entrada
    init {
        if (!(valor in 1..6))
            valor = 1
    }

    //funcion para lanzar el dado
    fun tirar() {
        valor = (Math.random() * 6 + 1).toInt()
    }

    //funcion para imprimir el resultado del dado
    fun imprimir() {
        println(valor)
    }

}