package com.example.alejandronasarreparte1_pmdm.`parte5 completado`

//programa para mostrar el salario de un empleado introducido por consola
//mediante argumentos nombrados
fun main() {
    println("Introducir nombre operario:")
    val nombre = readLine()!!.toString()
    println("Introducir pago por hora:")
    val pago = readLine()!!.toInt()
    println("Introducir cantidad de horas trabajadas:")
    val horas = readLine()!!.toInt()
    sueldo(nombre = nombre, horas = horas , pagoHora = pago)
}
//funcion para mostrar el nombre y el salario de un trabajador
fun sueldo(nombre: String, pagoHora: Int, horas: Int) {
    println("nombre: $nombre, salario: ${pagoHora * horas}")
}