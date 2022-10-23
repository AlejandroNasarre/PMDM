package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//utilizacion de clase enumerada PaloCarta en Clase externa Carta
fun main() {
    Carta(PaloCarta.PICAS,7)
}
//clase enumerada PaloCarta con picas, treboles, diamantes y corazones
enum class PaloCarta{
    PICAS,
    TREBOLES,
    DIAMANTES,
    CORAZONES
}
//Clase carta con atributo de clase enumerada PaloCarta
class Carta(val palo : PaloCarta,val valor:Int)