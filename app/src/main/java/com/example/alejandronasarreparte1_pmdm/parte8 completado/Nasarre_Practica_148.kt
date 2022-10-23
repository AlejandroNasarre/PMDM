package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//implementacion de funcion de orden superior en la clase persona
fun main() {
    val persona = Persona2("pepe", 76)
    println(persona.esMayorDeEdad(::mayorArgentina))
    println(persona.esMayorDeEdad(::mayorEstadosUnidos))
}

//clase Persona con nombre y edad
class Persona2(private var nombre: String, private var edad: Int) {

    //funcion para imprimir la persona
    fun imprimir() {
        println("nombre: $nombre, edad: $edad")
    }

    //funcion de orden superior que devuelve si una persona es mayor de edad
    fun esMayorDeEdad(fn: (Int) -> Boolean): Boolean {
        return fn(edad)
    }
}

//funcion que devuelve si una persona es mayor de edad en Estados Unidos
fun mayorEstadosUnidos(edad: Int): Boolean {
    return edad >= 21

}

//funcion que devuelve si una persona es mayor de edad en Argentina
fun mayorArgentina(edad: Int): Boolean {
    return edad >= 18
}