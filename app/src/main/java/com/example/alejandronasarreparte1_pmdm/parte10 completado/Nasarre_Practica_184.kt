package com.example.alejandronasarreparte1_pmdm.`parte10 completado`
//implementacion de un mapa de productos y utlizacion de funciones
fun main() {
    val productos = mutableMapOf<Int, Producto>()
    llenar(productos)
    mostrarProductos(productos)
    stock0(productos)
}

//funcion para llenar el mapa con productos
fun llenar(mapa: MutableMap<Int, Producto>) {
    mapa[20] = Producto("cafetera", 20f, 3)
    mapa[27] = Producto("tetera", 17f, 56)
    mapa[29] = Producto("sarten", 12f, 7)
    mapa[30] = Producto("camion", 200f, 0)
}

//funcion para mostrar los productos del mapa
fun mostrarProductos(diccionario: Map<Int, Producto>) {
    for ((cod, prod) in diccionario)
        println("codigo: $cod, nombre:${prod.nombre}, precio: ${prod.precio}, cantidad: ${prod.cantidad}")
}
//funcion para mostrar si un producto tiene 0 de stock
fun stock0(diccionario: Map<Int, Producto>) {
    for ((cod, prod) in diccionario)
        if (prod.cantidad == 0)
            println("el producto con codigo $cod tiene 0 de stock")
}

//data class producto
data class Producto(val nombre: String, val precio: Float, val cantidad: Int)
