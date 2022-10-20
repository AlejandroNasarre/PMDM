package com.example.alejandronasarreparte1_pmdm.`parte6 completado`
//creacion de un objeto persona con nombre y edad y utilizacion de sus funciones
fun main() {
    val persona = Persona()
    persona.inicializar("Juan",23)
    persona.imprimir()
    persona.esMayorEdad()
}

class Persona {
    private var nombre: String = ""
    private var edad: Int = 0
//inicializadro de las variables de clase
    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
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