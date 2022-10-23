package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//utilizacion de la data class Dado
fun main() {
    val dado = Dado3(5)
    println(dado)
}

//data class Dado con valor y metodo modificado toString
data class Dado3(var valor: Int) {
    override fun toString(): String {
        var str = ""
        for (i in 1..valor)
            str += "*"
        return str
    }
}