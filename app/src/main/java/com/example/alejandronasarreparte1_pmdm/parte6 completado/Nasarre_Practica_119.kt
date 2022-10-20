package com.example.alejandronasarreparte1_pmdm.`parte6 completado`

//creacion de dos clases Cliente y Banco que se implementan mutuamente
//y utilizacion de sus funciones
fun main() {
    val cliente1 = Cliente("juan", 300)
    val cliente2 = Cliente("pepe", 400)
    val cliente3 = Cliente("pedro", 500)
    val banco = Banco(cliente1, cliente2, cliente3)
    cliente1.depositar(300)
    cliente1.extraer(200)
    cliente1.imprimir()
    banco.dineroTotal()
}

class Cliente(var nombre: String, var dinero: Int) {
    //funcion para depositar dinero
    fun depositar(cantidad: Int) {
        dinero += cantidad
    }

    //funcion para extraer dinero
    fun extraer(cantidad: Int) {
        dinero -= cantidad
    }

    //funcion para imprimir el cliente
    fun imprimir() {
        println("nombre: $nombre, dinero: $dinero")
    }
}

class Banco(var cliente1: Cliente, var cliente2: Cliente, var cliente3: Cliente) {
    //funcion para calcular el dinero total ingresado en el banco
    fun dineroTotal() {
        var sumaTotal = cliente1.dinero + cliente2.dinero + cliente3.dinero
        println("hay $sumaTotal ingresado en el banco")
    }
}