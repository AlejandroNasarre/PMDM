package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de MutableList con edades
//y utilizacion de sus propiedades basicas
fun main() {
    val edades: MutableList<Int> = mutableListOf(23, 67, 12, 35, 12)
    println("Lista de edades")
    println(edades)
    edades[0] = 60
    println("Lista completa después de modificar la primer edad")
    println(edades)
    println("Primera edad almacenada en la lista")
    println(edades[0])
    println("Promedio de edades")
    println(edades.average())
    println("Agregamos una edad al final de la lista:")
    edades.add(50)
    println("Lista de edades")
    println(edades)
    println("Agregamos una edad al principio de la lista:")
    edades.add(0, 17)
    println("Lista de edades")
    println(edades)
    println("Eliminamos la primer edad de la lista:")
    edades.removeAt(0)
    println("Lista de edades")
    println(edades)
    print("Cantidad de personas mayores de edad:")
    val cant = edades.count { it >= 18 }
    println(cant)
    edades.removeAll { it == 12 }
    println("Lista de edades después de borrar las que tienen 12 años")
    println(edades)
    edades.clear()
    println("Lista de edades luego de borrar la lista en forma completa")
    println(edades)
    if (edades.isEmpty())
        println("No hay edades almacenadas en la lista")
}