package com.example.alejandronasarreparte1_pmdm.`parte10 completado`

//implementacion de un mutableMap de agenda
fun main() {
    val agenda = mutableMapOf<Fecha, String>()
    llenar(agenda)
    imprimir(agenda)
    consultar(agenda)
}

//funcion para llenar el mutable map de alumnos
fun llenar(agenda: MutableMap<Fecha, String>) {
    println("cantidad de fechas a introducir")
    val cant = readLine()!!.toInt()
    for (i in 1..cant) {
        println("ingresar dia:")
        val dia = readLine()!!.toInt()
        println("ingresar mes:")
        val mes = readLine()!!.toInt()
        println("ingresar año:")
        val anio = readLine()!!.toInt()
        println("ingresar actividades:")
        val actividades = readLine()!!.toString()
        agenda[Fecha(dia, mes, anio)] = actividades
    }
}

//funcion para imprimir la agenda
fun imprimir(agenda: MutableMap<Fecha, String>) {
    for ((fecha, actividades) in agenda)
        println("Fecha: ${fecha.dia}-${fecha.mes}-${fecha.anio}\nactividades: $actividades")
}

//funcion para consultar una fecha en la agenda
fun consultar(agenda: MutableMap<Fecha, String>) {
    println("ingresar dia:")
    val dia = readLine()!!.toInt()
    println("ingresar mes:")
    val mes = readLine()!!.toInt()
    println("ingresar año:")
    val anio = readLine()!!.toInt()
    val fecha = Fecha(dia, mes, anio)
    if (fecha in agenda)
        println(agenda[fecha])
    else
        println("la fecha introducida no esta introducida")
}

data class Fecha(val dia: Int, val mes: Int, val anio: Int)
