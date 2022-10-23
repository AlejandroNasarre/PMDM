package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//programa para gestionar los socios y los clubes mediante las clases Socio y Club
fun main() {
    val socio1 = Socio("Pepe",3)
    val socio2 = Socio("Pepito",4)
    val socio3 = Socio("Peppote",5)
    val club = Club(socio1,socio2,socio3)
    club.socioMasAntiguo()
}
//clase socio con nombre y antiguedad
class Socio(var nombre: String, var antiguedad: Int)

//clase club con tres socios
class Club(var socio1: Socio, var socio2: Socio, var socio3: Socio) {

    //funcion para imprimir el socio con mas antiguedad
    fun socioMasAntiguo() {
        if (socio1.antiguedad > socio2.antiguedad && socio1.antiguedad > socio3.antiguedad) {
            println(socio1.nombre)
        } else if (socio2.antiguedad > socio3.antiguedad) {
            println(socio2.nombre)
        } else {
            println(socio3.nombre)
        }
    }
}