package com.example.alejandronasarreparte1_pmdm.parte7

//creacion de clase enumerada Operacionesbasicas e implementacion en clase externa
fun main() {
    val op = Operar(3, 7, OperacionesBasicas.DIVISION)
    println(op.operar())
}

//clase enumerada con los tipos de operaciones basicas
enum class OperacionesBasicas(val tipo: String) {
    SUMA("+"),
    RESTA("-"),
    MULTIPLICACION("*"),
    DIVISION("/")
}

//clase operar con atributo de clase enumerada
class Operar(val n1: Int, val n2: Int, val operacion: OperacionesBasicas) {
    //funcion para realizar la operacion con los valores introducidos
    fun operar(): Double {
        when (operacion) {
            OperacionesBasicas.SUMA -> return (n1 + n2).toDouble()
            OperacionesBasicas.RESTA -> return (n1 - n2).toDouble()
            OperacionesBasicas.MULTIPLICACION -> return (n1 * n2).toDouble()
            OperacionesBasicas.DIVISION -> return n1.toDouble() / n2
        }
    }
}