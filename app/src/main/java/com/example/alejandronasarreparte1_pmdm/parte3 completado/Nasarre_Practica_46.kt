package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    // implementacion de bucle do while para clasificar los tipos de cuenta de un banco
    // hasta que el usuario introduce un numero negativo en el numero de cuenta
    // y calcula de la suma total de los acreedores
    var sumaAcreedores = 0
    do {
        println("Introducir numero de cuenta, numero negativo para terminar:")
        val numeroCuenta = readLine()!!.toInt()
        if (numeroCuenta >= 0) {
            println("Introducir saldo de la cuenta:")
            val saldo = readLine()!!.toInt()
            if (saldo > 0) {
                println("la cuenta es de tipo 'Acreedor'")
                sumaAcreedores += saldo
            } else if (saldo < 0)
                println("la cuenta es de tipo 'Deudor'")
            else
                println("la cuenta es de tipo 'Nulo'")
        }
    } while (numeroCuenta >= 0)
    println("la suma total del saldo de los acreedores es  $sumaAcreedores")
}