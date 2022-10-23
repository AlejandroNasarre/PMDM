package com.example.alejandronasarreparte1_pmdm.`parte8 completado`
//creacion de floatArray y utilizacion de funciones
fun main() {
    val array = FloatArray(10)
    for (i in array.indices)
        array[i] = readLine()!!.toFloat()
    menoresDe50(array)
    todosMenoresDe50(array)
}

//funcion para mostrar la cantidad de digitos menores a 6
fun menoresDe50(array: FloatArray) {
    var n = 0
    for (e in array)
        if (e < 50f)
            n++
    println("hay $n numeros menores a 50")
}

//funcion para imprimir si todos los elementos son menores a 10
fun todosMenoresDe50(array: FloatArray) {
    var todosMenores = true
    for (e in array)
        if (e == 50f)
            todosMenores = false
    if (todosMenores)
        println("todos los elementos son menores o iguales a 50")
}