package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//introduccion de dos cadenas por pantalla y comparacion mediante funcion
fun main() {
    println("Introducir primera cadena:")
    val str1 = readLine()!!.toString()
    println("Introducir segunda cadena:")
    val str2 = readLine()!!.toString()
    compararString(str1,str2)
}
//funcion para mostrar un mensaje de si dos cadenas ingresadas
//por parametro son iguales o no
fun compararString(str1 : String,str2 : String){
    if (str1 == str2)
        println("cadenas iguales.")
    else{
        println("cadenas diferentes.")
    }
}