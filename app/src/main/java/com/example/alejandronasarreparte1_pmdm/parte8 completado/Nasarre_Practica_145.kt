package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de array de articulos y modificacion mediante funciones
fun main() {
    val articulos: Array<Articulo> = arrayOf(
        Articulo(123, "peinar", 4f),
        Articulo(1234, "lavar", 5f),
        Articulo(12345, "comer", 5.5f),
        Articulo(123456, "dieguear", 6f),
    )
    mostrarArticulos(articulos)
    incrementarArticulos(articulos)
    mostrarArticulos(articulos)
}
//funcion para mostrar los articulos pasados por parametro
fun mostrarArticulos(articulos: Array<Articulo>) {
    for (a in articulos)
        println("codigo: ${a.codigo}, descripcion: ${a.descripcion}, precio: ${a.precio}")
}
//funcion para incrementar el precio de los articulos pasados por parametro
fun incrementarArticulos(articulos: Array<Articulo>) {
    for (a in articulos) {
        a.precio *= 1.1f
    }
}
//data class articulo con codigo, descripcion y precio
data class Articulo(
    val codigo: Int, val descripcion: String, var precio:
    Float
)