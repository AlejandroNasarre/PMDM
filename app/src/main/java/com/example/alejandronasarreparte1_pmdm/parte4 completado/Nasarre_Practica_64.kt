package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //calculo del valor acumulado de los numeros mas mayores introducidos
    //con cada iteracion del bucle
    var sumaMayores = 0
    for (i in 1..5) {
        println("introducir primer numero($i):")
        val n1 = readLine()!!.toInt()
        println("introducir segundo numero($i):")
        val n2 = readLine()!!.toInt()
        println("introducir tercer numero($i):")
        val n3 = readLine()!!.toInt()

        if (n1 > n2 && n1 > n3)
            sumaMayores += n1
        else if (n2 > n3)
            sumaMayores += n2
        else {
            sumaMayores += n3
        }
    }
    println("El valor acumulado de los numeros mayores es $sumaMayores")
}