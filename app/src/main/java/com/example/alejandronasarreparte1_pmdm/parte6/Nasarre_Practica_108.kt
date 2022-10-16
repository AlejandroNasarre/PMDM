package com.example.alejandronasarreparte1_pmdm.parte6
//carga de un array de cantidad
//cargada por consola e impresion del valor menor y si se repite o no
//mediante funciones
fun main() {
    println("tamaño del array:")
    val tamano = readLine()!!.toInt()
    val array = crearArray(tamano)
    val nMenor = numeroMenor(array)
    println("el numero menor es $nMenor")
    if (numeroMenorSeRepite(array))
        println("el numero menor se repite")
    else
        println("el numero menor no se repite")
}

//funcion para encontrar el numero menor de un array
fun numeroMenor(array: IntArray): Int {
    var nMenor = array[0]
    for (i in array.indices) {
        if (array[i] < nMenor)
            nMenor = array[i]
    }
    return nMenor
}

//funcion para ver si el numero menor de un array se repite
fun numeroMenorSeRepite(array: IntArray): Boolean {
    var nMenor = numeroMenor(array)
    var nVeces = 0
    for (i in array.indices){
        if (nMenor == array[i])
            nVeces++
        if (nVeces>1)
            return true
    }
    return false
}
