package com.example.alejandronasarreparte1_pmdm.parte10
//implementacion de un mutableMap de alumnos y utilizacion de funciones
fun main() {
    val alumnos = mutableMapOf<Int, MutableList<Materia>>()
    llenar(alumnos)
    listado(alumnos)
    consulta(alumnos)
}
//funcion para llenar el mutable map de alumnos
fun llenar(alumnos: MutableMap<Int, MutableList<Materia>>) {
    println("cantidad de alumnos a introducir")
    val cant = readLine()!!.toInt()
    for (i in 1..cant) {
        println("ingresar dni:")
        val dni = readLine()!!.toInt()
        var continuar = "s"
        val materias = mutableListOf<Materia>()
        while (continuar == "s") {
            println("introducir materia:")
            val materia = readLine()!!.toString()
            println("introducir nota:")
            val nota = readLine()!!.toInt()
            println("continuar introduciendo materias?(s/n):")
            continuar = readLine()!!.toString()
            materias.add(Materia(materia, nota))
        }
        alumnos[dni] = materias
    }
}
//funcion para mostrar el mutable mapa de alumnos
fun listado(alumnos: MutableMap<Int, MutableList<Materia>>) {
    for ((dni, materias) in alumnos) {
        println("dni: $dni, materias:")
        for (materia in materias)
            println("\t${materia.nombre}, nota: ${materia.nota}")
    }
    println()
}
//funcion para consultar un alumno
fun consulta(alumnos: MutableMap<Int, MutableList<Materia>>) {
    println("introducir dni alumno")
    val dni = readLine()!!.toInt()
    val materias = alumnos.get(dni)
    if (materias != null) {
        for (materia in materias)
            println("\t${materia.nombre}, nota: ${materia.nota}")
    }else
        println("el alumno introducido no existe")
}
//data class materia
data class Materia(val nombre: String, val nota: Int)
