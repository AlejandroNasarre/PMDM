package com.example.alejandronasarreparte1_pmdm.`parte4 completado`

fun main() {
    //clasificacion de los sueldos de 10 empleados introducidos por pantalla
    //y calculo del valor acumulado de los sueldos altos mediante estructura condicional when
    var sumaSueldosAltos = 0
    for (i in 1..10) {
        println("introducir sueldo empleado  numero $i:")
        val sueldo = readLine()!!.toInt()
        when {
            sueldo > 5000 -> {
                println("sueldo alto")
                sumaSueldosAltos += sueldo
            }
            sueldo < 2000 -> println("sueldo bajo")
            else -> println("sueldo medio")
        }
    }
    println("valor acumulado de los sueldos altos: $sumaSueldosAltos")
}