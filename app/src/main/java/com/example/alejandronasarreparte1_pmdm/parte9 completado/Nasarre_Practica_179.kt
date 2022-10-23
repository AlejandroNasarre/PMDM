package com.example.alejandronasarreparte1_pmdm.`parte9 completado`

//implementacion de mutableList de tipo Empleado, impresion y conteo
//de los salarios de los elementos en la lista
fun main() {
    var empleados = mutableListOf(
        Empleado("pepe", 1000),
        Empleado("ruben", 1900),
        Empleado("luca", 2700),
    )
    empleados.forEach { it.imprimir() }
    var sumaSalarios = 0
    empleados.forEach { sumaSalarios += it.sueldo }
    println("gasto total: $sumaSalarios")

    empleados.add(Empleado("diegas", 200))
    sumaSalarios = 0
    empleados.forEach { sumaSalarios += it.sueldo }
    println("gasto total: $sumaSalarios")
}

//clase Empleado con nombre y sueldo
class Empleado(var nombre: String, var sueldo: Int) {

    //funcion para imprimir el empleado
    fun imprimir() {
        println("nombre: $nombre, sueldo: $sueldo")
    }
}
