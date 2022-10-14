package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//programa que permite mostrar 5 sumas de dos valores introducidos
//por pantalla mediante funciones
fun main() {
    for (i in 1..5){
        suma2()
        crearSeparacion()
    }
}
//funcion para recoger los valores a sumar y mostrar el resultado
fun suma2() {
    println("introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("$n1 + $n2 = ${n1 + n2}")
}
//funcion para imprimir separacion
fun crearSeparacion(){
    println("------------------------")
}