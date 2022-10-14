package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//programa que permite llenar un array por consola con alturas
//posteriormente mostrar el promedio y las alturas superiores e inferiores a el
fun main() {
    val alturas = FloatArray(5)
    var sumaAlturas = 0f
    for (i in 0..4) {
        println("introducir altura numero ${i + 1}")
        val altura = readLine()!!.toFloat()
        alturas[i] = altura
        sumaAlturas += altura
    }
    val promedio = sumaAlturas / 5
    var masPrmd = 0
    var menosPrmd = 0
    println("El promedio es: $promedio")
    for (i in alturas){
        if (i > promedio)
            masPrmd++
        else if (i < promedio)
            menosPrmd++
    }
    println("Hay $masPrmd personas por encima del promedio")
    println("Hay $menosPrmd personas por debajo del promedio")
}