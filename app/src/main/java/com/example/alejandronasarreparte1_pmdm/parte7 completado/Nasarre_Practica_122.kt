package com.example.alejandronasarreparte1_pmdm.`parte7 completado`
//creacion de un objeto Operaciones con dos valores
// y utilizacion de sus funciones privadas
fun main() {
    val op = Operaciones()
    op.introducirValores()
}

class Operaciones {
    var n1 = 0
    var n2 = 0
    //funcion para asignar valores a las variables de clase
    fun introducirValores() {
        println("introducir valor numero 1")
        n1 = readLine()!!.toInt()
        println("introducir valor numero 2")
        n2 = readLine()!!.toInt()
        println("la suma es : ${sumar()}")
        println("la multiplicacion es : ${multiplicar()}")
    }

    //funcion privada para sumar los valores de clase
    private fun sumar() = n1 + n2

    //funciones privada para multiplicar los valores de clase
    private fun multiplicar() = n1 * n2
}