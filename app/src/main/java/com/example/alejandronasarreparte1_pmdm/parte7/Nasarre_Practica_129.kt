package com.example.alejandronasarreparte1_pmdm.parte7
//utilizacion de la data class Persona
fun main() {
    val persona = Persona2("pepe",34)
    println(persona)
}

//data class Persona con nombre, edad y metodo modificado toString
data class Persona2(var nombre: String, var edad: Int) {
    override fun toString(): String {
        return "$nombre, $edad"
    }
}