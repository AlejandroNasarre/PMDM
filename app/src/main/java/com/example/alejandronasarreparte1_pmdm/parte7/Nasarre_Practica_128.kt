package com.example.alejandronasarreparte1_pmdm.parte7
//utilizacion de la data class Producto
fun main() {
    val producto1 = Producto("123","para cocinar", 3.5f)
    val producto2 = Producto("1234","para limpiar", 4.5f)
}

//data class producto con codigo, descripcion y precio
data class Producto(var codigo: String, var descripcion: String, var precio: Float)