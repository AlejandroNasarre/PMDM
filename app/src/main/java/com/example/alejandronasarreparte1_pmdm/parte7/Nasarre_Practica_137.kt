package com.example.alejandronasarreparte1_pmdm.parte7

//utilizacion de clase persona y empleado y su imlementacion de herencia
fun main() {
    val persona = Persona3("pepe",34)
    val empleado = Empleado2("juanito",36,45454)
    empleado.debePagarImpuestos()
}

//clase padre persona con nombre y edad
open class Persona3(var nombre: String, var edad: Int) {
}

//clase hija empleado con sueldo y funcion añadida
class Empleado2(var nombreEmp: String, var edadEmp: Int, var sueldo: Int) :
    Persona3(nombreEmp, edadEmp) {
    //funcion que muestra si se deben pagar impuestos
    fun debePagarImpuestos() {
        if (sueldo > 3000)
            println("si")
        else
            println("no")
    }
}