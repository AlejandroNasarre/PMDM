package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de la funcion operador in mediante clases Clase y Alumno
fun main() {
    val alumno1 = Alumno(123,"pepe")
    val alumno2 = Alumno(1234,"juan")
    val alumno3 = Alumno(12345,"dieguis")
    val clase = Clase(alumno1,alumno2, alumno3)
    if (alumno1 in clase)
        println(alumno1.nombre+" esta en clase")
    else
        println(alumno1.nombre+" no esta en clase")
}
//data class alumno
data class Alumno(var nDoc: Int, var nombre: String)

//clase Clase con tres objetos alumno
class Clase(var alumno1: Alumno, var alumno2: Alumno, var alumno3: Alumno) {
//funcion de operador contains sobrecargada
    operator fun contains(alumno: Alumno): Boolean {
        return alumno.nDoc == alumno1.nDoc || alumno.nDoc == alumno2.nDoc || alumno.nDoc == alumno3.nDoc
    }
}