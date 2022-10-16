package com.example.alejandronasarreparte1_pmdm.parte6
//creacion de un objeto alumno con nombre y nota con constructor definido
// y utilizacion de sus funciones
fun main() {
    val persona1 = Alumno2("Juan", 7)
    persona1.imprimir()
    persona1.estado()

    val persona2 = Alumno2("Pedro", 3)
    persona2.imprimir()
    persona2.estado()
}
//clase alumno con constructor incluido
class Alumno2 (var nombre: String,var nota: Int){

    //funcion para imprimir el objeto
    fun imprimir() {
        println("Nombre: $nombre, nota:$nota")
    }

    //funcion para comprobar si el alumno esta aprobado o suspendido
    fun estado() {
        if (nota >= 4)
            println("nota aprobada")
        else
            println("nota suspendida")
    }
}