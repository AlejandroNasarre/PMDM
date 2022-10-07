package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //Introduccion de n triangulos(especificado por consola), su respectiva base y altura
    //calculo de su superficie y conteo de triangulos con superficie mayor a 12
    println("introducir numero de triangulos a ingresar:")
    val nTriangulos = readLine()!!.toInt()
    var superficiesGrandes = 0
    for (i in 1..nTriangulos){
        println("introducir base triangulo numero $i:")
        val base = readLine()!!.toInt()
        println("introducir altura triangulo numero $i:")
        val altura = readLine()!!.toInt()
        val superficie = (base*altura).toFloat()/2
        if (superficie > 12)
            superficiesGrandes++
        println("triangulo con base: $base, altura: $altura y superficie: $superficie")
    }
    println("Hay $superficiesGrandes triangulos con superficie mayor a 12.")
}