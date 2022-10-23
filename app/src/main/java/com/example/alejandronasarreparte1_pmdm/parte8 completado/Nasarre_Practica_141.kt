package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//implementacion de clase padre abstracta cuenta y clases hijas PlazoFijo y
//CajaAhorro
fun main() {
    val pf = PlazoFijo("diego",12000,56,4.5)
    val ca = CajaAhorro("luca",21000)
    pf.mostrar()
    ca.mostrar()
}

//clase padre abstracta cuenta
abstract class Cuenta(var titular: String, var monto: Int) {

    //funcion para mostrar la informacion de la cuenta
    open fun mostrar() {
        println("Titular: $titular, Monto: $monto")
    }
}

//clase hija plazoFijo
class PlazoFijo(titular: String, monto: Int, var plazo: Int, var interes: Double) :
    Cuenta(titular, monto) {
    //funcion overrideada para mostrar la informacion de la cuenta
    override fun mostrar() {
        println("cuenta plazo fijo")
        super.mostrar()
        println("Plazo: $plazo, Interes: $interes")
    }

}

//clase hija cajaAhorro
class CajaAhorro(titular: String, monto: Int) : Cuenta(titular, monto) {
    //funcion overrideada para mostrar la informacion de la cuenta
    override fun mostrar() {
        println("cuenta caja ahorro")
        super.mostrar()
    }

}