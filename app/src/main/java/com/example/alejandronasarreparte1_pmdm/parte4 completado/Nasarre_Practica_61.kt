package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //clasificacion de n piezas (introduccion por consola hasta ingresar el valor 0)
    //mediante estructura condicional when
    var pGrandes = 0
    var pMedianas = 0
    var pPequenas = 0
    var nPiezas = 0
    do{
        println("introducir peso de la pieza")
        val peso = readLine()!!.toFloat()
        if (peso > 0f){
            nPiezas++
            when{
                peso > 10.2f -> pGrandes++
                peso < 9.8f -> pPequenas++
                else -> pMedianas++
            }
        }
    }while (peso != 0f)
    println("Hay $pGrandes piezas Grandes")
    println("Hay $pMedianas piezas Medianas")
    println("Hay $pPequenas piezas Pequeñas")
    println("Hay $nPiezas piezas totales")
}