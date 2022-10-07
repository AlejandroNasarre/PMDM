package com.example.alejandronasarreparte1_pmdm

fun main() {
    //estructura condicional simple para detectar si se deben pagar impuestos
    print("Ingrese el sueldo del empleado:")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
        println("Se deben pagar impuestos")
}
