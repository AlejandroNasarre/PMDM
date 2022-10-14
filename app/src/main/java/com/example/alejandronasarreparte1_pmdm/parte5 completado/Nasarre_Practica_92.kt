package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
//impresion de una cadena pasada por parametro con subrallado
fun main() {
    println("Introducir cadena:")
    val str = readLine()!!.toString()
    println("Introducir subrallado:")
    val sub = readLine()!!.toString()
    imprimirYSubrayar(str,sub)
}
//funcion para imprimir un texto con subrallado predeterminado o personalizado
fun imprimirYSubrayar(str :String,subrallado :String = "-"){
    println(str)
    for (i in 1..str.length step subrallado.length)
        print(subrallado)
}