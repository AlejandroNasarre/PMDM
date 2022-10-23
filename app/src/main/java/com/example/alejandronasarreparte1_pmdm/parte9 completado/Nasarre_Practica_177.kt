package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//implementacion de mutableList de tipo persona, impresion
//de todas mediante metodo foreach y conteo de mayores de edad
fun main() {
    val personas: MutableList<Persona2> = mutableListOf(
        Persona2("pepe", 22),
        Persona2("juan", 12),
        Persona2("ruben", 25),
        Persona2("lucas", 65),
    )
    personas.forEach { it.imprimir() }
    var nMayores = personas.count { it.edad >= 18 }
    println("hay $nMayores personas mayores de edad")
}

//clase Persona con nombre y edad
class Persona2(var nombre: String, var edad: Int) {

    //funcion para imprimir la persona
    fun imprimir() {
        println("nombre: $nombre, edad: $edad")
    }

    //funcion que muestra si una persona es mayor de edad
    fun esMayorDeEdad() {
        if (edad >= 18) {
            imprimir()
            println("es mayor de edad")
        } else {
            imprimir()
            println("no es mayor de edad")
        }
    }
}
