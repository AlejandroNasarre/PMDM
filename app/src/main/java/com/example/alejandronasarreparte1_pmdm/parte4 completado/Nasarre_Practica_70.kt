package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa que permite mostrar la suma de dos valores introducidos
//por pantalla mediante funciones
fun main() {
    presentacion()
    suma()
    despedida()
}
//funcion para mostrar mensaje de presentacion
fun presentacion() {
    println("programa que muestra la suma de dos valores introducidos por pantalla.")
}
//funcion para recoger los valores a sumar y mostrar el resultado
fun suma() {
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("$n1 + $n2 = ${n1 + n2}")
}
//funcion para mostrar mensaje de despedida
fun despedida(){
    println("fin del programa")
}