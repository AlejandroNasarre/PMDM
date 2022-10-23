package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//utilizacion de clase persona con getters y setters
fun main() {
    val persona = Persona()
    persona.setEdad(6)
    persona.setNombre("pepe")
    println(persona.getNombre())
    println(persona.getEdad())
}

//clase persona con getters y setters
class Persona {
    private var nombre = ""
    private var edad = 0

    //funcion para asignarle valor a la variable nombre
    fun setNombre(nombre: String) {
        this.nombre = nombre.toUpperCase()
    }

    //funcion para devolver el nombre
    fun getNombre(): String {
        return "(${this.nombre})"
    }

    //funcion para asignarle valor a la variable edad con control de entrada
    fun setEdad(edad: Int) {
        if (edad > 0)
            this.edad = edad
        else
            this.edad = 0
    }

    //funcion para devolver la edad
    fun getEdad(): Int {
        return this.edad
    }
}