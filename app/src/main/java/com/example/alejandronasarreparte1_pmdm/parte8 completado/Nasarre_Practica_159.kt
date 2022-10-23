package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion de extension de la clase IntArray
fun main() {
    val array = IntArray(20) { (Math.random() * 10 + 1).toInt() }
    array.mostrarEnUnaLinea()
}
//funcion de extension que permite mostrar el contenido del array en una linea
fun IntArray.mostrarEnUnaLinea() {
    this.forEach { print("$it, ") }
}