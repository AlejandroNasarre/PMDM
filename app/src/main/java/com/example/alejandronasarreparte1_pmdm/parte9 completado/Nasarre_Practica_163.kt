package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//operaciones basicas de objetos de la clase vector con operadores
//personalizados
fun main() {
    val vector = Vector()
    vector.llenar()
    vector.mostrar()
    val vectorMulti = vector * 4
    vectorMulti.mostrar()
}

//clase Array
class Vector {
    val array = IntArray(5)

    //funcion para llenar el array
    fun llenar() {
        for (i in array.indices)
            array[i] = (Math.random() * 10 + 1).toInt()
    }

    //funcion para mostrar el array
    fun mostrar() {
        for (elemento in array)
            println("$elemento")
        println()
    }

    //funcion operador para multiplicar
    operator fun times(n: Int): Vector {
        val producto = Vector()
        for (i in this.array.indices)
            producto.array[i] = this.array[i] * n
        return producto
    }
}
