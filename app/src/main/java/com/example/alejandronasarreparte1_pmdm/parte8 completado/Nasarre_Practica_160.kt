package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de extension de la clase String
fun main() {
    val str = "hola"
    str.mostrarEnUnaLinea()
}

//funcion de extension que permite mostrar el contenido de un String en una linea
fun String.mostrarEnUnaLinea() {
    this.forEach { print("$it, ") }
}