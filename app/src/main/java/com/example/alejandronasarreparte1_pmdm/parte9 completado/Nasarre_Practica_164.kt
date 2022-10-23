package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//operaciones incremento y decremento de objetos de la clase vector
//con operadores personalizados
fun main() {
    var vector = Vector2()
    vector.llenar()
    vector.mostrar()
    vector++
    vector.mostrar()
    vector--
    vector.mostrar()
}

//clase Vector
class Vector2 {
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

    //funcion operador para incrementar
    operator fun inc(): Vector2 {
        val incremento = Vector2()
        for (i in this.array.indices)
            incremento.array[i] = this.array[i] + 1
        return incremento
    }
    //funcion operador para decrementar
    operator fun dec(): Vector2 {
        val decremento = Vector2()
        for (i in this.array.indices)
            decremento.array[i] = this.array[i] - 1
        return decremento
    }
}
