package com.example.alejandronasarreparte1_pmdm.`parte10 completado`

//implementacion de Set de tipo Fecha
fun main() {
    val feriados: Set<Fecha> = setOf(
        Fecha(1, 1, 2017),
        Fecha(25, 12, 2017)
    )
    esFeriado(feriados)
}

//funcion para comprobar si unna fecha es feriado
fun esFeriado(feriados: Set<Fecha>) {
    print("Ingrese el día:")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes:")
    val mes = readLine()!!.toInt()
    print("Ingrese el año:")
    val anio = readLine()!!.toInt()
    if (Fecha(dia, mes, anio) in feriados)
        println("La fecha ingresada es feriado")
    else
        println("La fecha ingresada no es feriado")
}

