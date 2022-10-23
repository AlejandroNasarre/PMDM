package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//utilizacion de las funciones de la clase persona mediante funcion lambda foreach
fun main() {
    val personas: Array<Persona3> = arrayOf(
        Persona3("pepe", 23),
        Persona3("lazaro", 17),
        Persona3("luca", 101),
        Persona3("diegas", 66)
    )

    personas.forEach {
        it.imprimir()
        it.esMayorDeEdad()
    }
}

//clase Persona con nombre y edad
class Persona3(private var nombre: String, private var edad: Int) {

    //funcion para imprimir la persona
    fun imprimir() {
        println("nombre: $nombre, edad: $edad")
    }

    //funcion que devuelve si una persona es mayor de edad
    fun esMayorDeEdad() {
        if (edad >= 18)
            println("es mayor de edad")
        else
            println("no es mayor de edad")
    }
}
