package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//creacion de un objeto Operaciones con dos valores
// y utilizacion de sus funciones
fun main() {
    val op = Operaciones()
    op.introducirValores()
    op.sumar()
    op.multiplicar()
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

    //funcion para sumar los valores de clase
    fun sumar() = n1 + n2

    //funciones para multiplicar los valores de clase
    fun multiplicar() = n1 * n2
}