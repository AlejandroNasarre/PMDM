package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa que permite mostrar la suma de dos valores introducidos
//por pantalla mediante funciones
fun main() {
    presentacion2("programa que muestra la suma de dos valores introducidos por pantalla.")
    suma3()
    despedida2()
}
//funcion para mostrar mensaje de presentacion introducido por parametro
fun presentacion2(mensaje : String) {
    println(mensaje)
}
//funcion para recoger los valores a sumar y mostrar el resultado
fun suma3() {
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("$n1 + $n2 = ${n1 + n2}")
}
//funcion para mostrar mensaje de despedida
fun despedida2(){
    println("fin del programa")
}