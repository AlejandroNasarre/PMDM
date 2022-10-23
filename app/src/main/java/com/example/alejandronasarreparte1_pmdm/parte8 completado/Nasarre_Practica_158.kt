package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funciones de extension
fun main() {
    val cadena1 = "Viento"
    println(cadena1.mitadPrimera())
    println(cadena1.segundaMitad())
}
//funcion de extension de la clase String que devuelve la primera mitad de la cadena
fun String.mitadPrimera(): String {
    return this.substring(0..this.length / 2 - 1)
}
//funcion de extension de la clase String que devuelve la segunda mitad de la cadena
fun String.segundaMitad(): String {
    return this.substring(this.length / 2..this.length - 1)
}

