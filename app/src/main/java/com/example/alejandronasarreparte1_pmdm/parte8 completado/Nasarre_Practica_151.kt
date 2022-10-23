package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//implementacion de funcion de orden superior y funciones lambda
fun main() {
    val str = "Hola, Que Tal."
    val strVocales =
        modificar(str) {
            it == 'a' || it == 'A' || it == 'e' || it == 'E' || it == 'i' || it == 'I' || it == 'o' || it == 'O' || it == 'u' || it == 'U'
        }
    val strMayus = modificar(str) {it.isUpperCase()}
    val strAlpha = modificar(str) {!it.isLetter()}
    println(strVocales)
    println(strMayus)
    println(strAlpha)
}

//funcion de orden superior que modifica un string
fun modificar(string: String, fn: (Char) -> Boolean): String {
    var rturn = ""
    for (s in string) {
        if (fn(s))
            rturn += s
    }
    return rturn
}