package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//implementacion de funcion lambda con array
fun main() {
    val array = IntArray(20) { (Math.random() * 10 + 1).toInt() }
    mostrarArray(array)
    menoresDe6(array)
    todosMenoresDe10(array)
    hay10(array)
}

//funcion para mostrar el array
fun mostrarArray(array: IntArray) {
    for (e in array)
        println(e)
}

//funcion para mostrar la cantidad de digitos menores a 6
fun menoresDe6(array: IntArray) {
    var n = 0
    for (e in array)
        if (e < 6)
            n++
    println("hay $n numeros menores a 6")
}

//funcion para imprimir si todos los elementos son menores a 10
fun todosMenoresDe10(array: IntArray) {
    var todosMenores = true
    for (e in array)
        if (e == 10)
            todosMenores = false
    if (todosMenores)
        println("todos los elementos son menores o iguales a 9")
}

//funcion para imprimir si hay algun 10 en el array
fun hay10(array: IntArray) {
    var hay10 = true
    for (e in array)
        if (e == 10)
            hay10 = true
    if (hay10)
        println("almenos un elemento es 10")
}


