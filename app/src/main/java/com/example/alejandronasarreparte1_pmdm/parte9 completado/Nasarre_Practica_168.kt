package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//implementacion de clase vector con funcion de operador plusAssign
fun main() {
    val vector1 = Vector3()
    vector1.llenar()
    vector1.mostrar()
    val vector2 = Vector3()
    vector2.llenar()
    vector1.mostrar()
    vector1 += vector2
    vector1.mostrar()
}


//clase Vector
class Vector3 {
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

    //funcion operador plusAssign
    operator fun plusAssign(vector2: Vector3) {
        for (i in this.array.indices)
            this.array[i] += vector2.array[i]
    }
}