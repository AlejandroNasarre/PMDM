package com.example.alejandronasarreparte1_pmdm.`parte6 completado`

//creacion de un objeto Hijos con un array de edades
// y utilizacion de sus funciones
fun main() {
    val hijos = Hijos()
    hijos.introducirEdades()
    hijos.edadMayor()
    hijos.promedioEdades()
}

class Hijos {
    val edades = IntArray(5)

    //funcion para introducir las edades en el array de edades
    fun introducirEdades() {
        for (i in edades.indices) {
            println("introducir valor numero 1")
            edades[i] = readLine()!!.toInt()
        }
    }

    //funcion para devolver la edad mayor del array
    fun edadMayor(): Int {
        var edadMayor = edades[0]
        for (e in edades) {
            if (e > edadMayor)
                edadMayor = e
        }
        return edadMayor
    }

    //funcion para calcular el promedio de edades
    fun promedioEdades(): Float {
        var sumaEdades = 0
        for (e in edades) {
            sumaEdades += e
        }
        return sumaEdades.toFloat() / edades.size
    }
}