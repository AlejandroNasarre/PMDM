package com.example.alejandronasarreparte1_pmdm.parte10
//implementacion de mapa de productos, impresion de los mismos
//y conteo de los articulos con precios superiores a 20
fun main() {
    val articulos = mapOf(
        Pair("peine", 10),
        Pair("raton", 78),
        Pair("gafas", 34),
        Pair("alfombrilla", 15),
    )
    articulos.forEach { imprimirArticulo(it) }
    val mayoresA20 = articulos.count() { it.value > 20 }
    println("hay $mayoresA20 articulos con precio superior a 20")
}
//funcion para imprimir cada entrada del mapa de articulos
fun imprimirArticulo(articulo: Map.Entry<String, Int>) {
    println("nombre del articulo: ${articulo.key}, precio: ${articulo.value}")
}