package com.example.alejandronasarreparte1_pmdm.parte7
//utilizacion del objeto matematica
fun main() {
    val m = Matematica
    println(m.PI)
    println(m.valorAleatorio(45,67))
}
//Objeto matematica con variable pi y metodo devolver valor aleatorio en rango
object Matematica {
    val PI = 3.14159265358979
    //funcion que devuelve un valor aleatorio en un rango
    fun valorAleatorio(nMinimo: Int, nMaximo: Int): Int {
        return (Math.random() * (nMaximo - nMinimo) + nMinimo).toInt()
    }
}