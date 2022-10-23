package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de interfaz Punto en dos clases PuntoPlano y PuntoEspacio
fun main() {
    val puntoP = PuntoPlano(2, 3)
    val puntoE = PuntoEspacio(2, 3, 4)
    puntoP.imprimir()
    puntoE.imprimir()
}

//interfaz punto
interface Punto {
    //funcion imprimir
    fun imprimir()
}

//clase PuntoPlano que implementa la interfaz Punto
class PuntoPlano(val x: Int, val y: Int) : Punto {
    //funcion de la interfaz punto adaptada
    override fun imprimir() {
        println("punto en el plano($x,$y)")
    }
}

//clase PuntoEspacio que implementa la interfaz Punto
class PuntoEspacio(val x: Int, val y: Int, val z: Int) : Punto {
    //funcion de la interfaz punto adaptada
    override fun imprimir() {
        println("punto en el espacio($x,$y,$z)")
    }
}