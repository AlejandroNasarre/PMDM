package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//creacion de un objeto persona con nombre y edad y utilizacion de sus funciones
fun main() {
    val persona = Persona2("Juan",23)
    persona.imprimir()
    persona.esMayorEdad()
}
//clase Persona con constructor
class Persona2 (var nombre: String,var edad: Int) {

    //funcion para imprimir el objeto
    fun imprimir() {
        println("Nombre: $nombre, edad:$edad")
    }
    //funcion para comprobar que es mayor de edad
    fun esMayorEdad() {
        if (edad >= 18)
            println("mayor de edad")
        else
            println("menor de edad")
    }
}