package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de funcion cantidadMayoresDeEdad con numero variable de parametros
fun main() {
    println("cantidad de mayores de edad: ${cantidadMayoresDeEdad(56,32,12,23,67,65,98,43,32)}")
}
//funcion que retorna la cantidad de mayores de edad de los parametros introducidos
fun cantidadMayoresDeEdad(vararg edades: Int): Int {
    var nMayores = 0
    for (e in edades)
        if (e >= 18)
            nMayores++
    return nMayores
}