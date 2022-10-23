package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//operacion comparacion de objetos de la clase persona
//con operador personalizado
fun main() {
    val persona = Persona("pepe", 23)
    val persona2 = Persona("juan", 24)
    if (persona > persona2)
        println(persona.nombre + "es mayor.")
    if (persona < persona2)
        println(persona2.nombre + "es mayor.")
    if (persona == persona2)
        println("los dos tienen la misma edad")
}
//clase persona
class Persona(val nombre: String, val edad: Int) {
    fun mostrar() {
        println("Nombre: $nombre, edad: $edad")
    }
//funcion operador compareTo
    operator fun compareTo(persona2: Persona): Int {
        return when {
            edad < persona2.edad -> -1
            edad > persona2.edad -> 1
            else -> 0
        }
    }
}