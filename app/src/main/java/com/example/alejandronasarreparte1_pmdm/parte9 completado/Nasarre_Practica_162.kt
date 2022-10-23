package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//operaciones basicas de objetos de la clase Array con operadores
//personalizados
fun main() {
    val array1 = Array()
    array1.llenar()
    val array2 = Array()
    array2.llenar()
    array1.mostrar()
    array2.mostrar()
    val arraySuma = array1 + array2
    arraySuma.mostrar()
    val arrayResta = array1 - array2
    arrayResta.mostrar()
    val arrayMulti = array1 * array2
    arrayMulti.mostrar()
    val arrayDiv = array1 / array2
    arrayDiv.mostrar()
}

//clase Array con un ArrayInt de 5 posiciones
class Array {
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

    //funcion operador para sumar
    operator fun plus(array2: Array): Array {
        val suma = Array()
        for (i in this.array.indices)
            suma.array[i] = this.array[i] + array2.array[i]
        return suma
    }

    //funcion operador para restar
    operator fun minus(array2: Array): Array {
        val resta = Array()
        for (i in this.array.indices)
            resta.array[i] = this.array[i] - array2.array[i]
        return resta
    }

    //funcion operador para multiplicar
    operator fun times(array2: Array): Array {
        val producto = Array()
        for (i in this.array.indices)
            producto.array[i] = this.array[i] * array2.array[i]
        return producto
    }

    //funcion operador para dividir
    operator fun div(array2: Array): Array {
        val division = Array()
        for (i in this.array.indices)
            division.array[i] = this.array[i] / array2.array[i]
        return division
    }
}

