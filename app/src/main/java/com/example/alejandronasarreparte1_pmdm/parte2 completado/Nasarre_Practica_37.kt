package com.example.alejandronasarreparte1_pmdm.`parte2 completado`

fun main() {
    //clasificacion de salarios de N empleados y calculo del coste total
    println("introducir numero de empleados:")
    val nEmpleados =  readLine()!!.toInt()
    var nSalarios100to300 = 0
    var costeTotal = 0
    for (i in 1..nEmpleados) {
        println("introducir salario empleado numero $i:")
        val salario = readLine()!!.toInt()
        costeTotal += salario
        if (salario <= 300)
            nSalarios100to300++
    }
    val nSalarios301de500 = nEmpleados - nSalarios100to300
    println("hay $nSalarios100to300 empleados con salario de 100 a 300 euros" )
    println("hay $nSalarios301de500 empleados con salario de 301 a 500 euros" )
    println("coste total de los salarios $costeTotal euros")
}