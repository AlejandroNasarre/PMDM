package com.example.alejandronasarreparte1_pmdm.parte6

//creacion de un objeto punto con coordenadas x e y con constructor definido
// y utilizacion de sus funciones
fun main() {
    val punto = Punto(3, 7)
    punto.cuadrante()
}

//clase punto con coordenadas x e y
class Punto(var x: Int, var y: Int) {
    //funcion para clasificar el punto segun su cuadrante
    fun cuadrante() {
        when {
            x > 0 && y > 0 -> println("cuadrante 1")
            x > 0 && y < 0 -> println("cuadrante 2")
            x < 0 && y < 0 -> println("cuadrante 3")
            x < 0 && y > 0 -> println("cuadrante 4")
            else -> println("eje")

        }
    }
}