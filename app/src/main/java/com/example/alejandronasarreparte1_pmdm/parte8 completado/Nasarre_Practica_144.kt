package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de array con objeto Persona
fun main() {
    val personas: Array<Persona> = arrayOf(
        Persona("lazaro", 17), Persona("ruben", 34),
        Persona("diegos", 86), Persona("lukis", 52)
    )
    var nMayores = 0
    for (persona in personas){
        if (persona.esMayorDeEdad())
            nMayores++
    }
    println(nMayores)
}
//clase Persona con nombre y edad
class Persona(var nombre: String, var edad: Int) {
    //funcion para imprimir la persona
    fun imprimir() {
        println("nombre: $nombre, edad: $edad")
    }
    //funcion que devuelve si una persona es mayor de edad
    fun esMayorDeEdad(): Boolean {
        return edad >= 18
    }
}