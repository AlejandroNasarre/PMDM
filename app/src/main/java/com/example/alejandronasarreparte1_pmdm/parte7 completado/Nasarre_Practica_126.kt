package com.example.alejandronasarreparte1_pmdm.`parte7 completado`

//utilizacion de clase empleado con getters y setters
fun main() {
    val emp = Empleado()
    emp.setNombre("pepe")
    emp.setSueldo(2222)
    emp.imprimir()
}

//clase persona con getters y setters
class Empleado {
    private var nombre = ""
    private var sueldo = 0

    //funcion para asignarle valor a la variable nombre
    fun setNombre(nombre: String) {
        this.nombre = nombre
    }

    //funcion para devolver el nombre
    fun getNombre(): String {
        return this.nombre
    }

    //funcion para asignarle valor a la variable sueldo con control de entrada
    fun setSueldo(sueldo: Int) {
        if (sueldo > 0)
            this.sueldo = sueldo
        else
            this.sueldo = 0
    }

    //funcion para devolver la sueldo
    fun getSueldo(): Int {
        return this.sueldo
    }

    //funcion para imprimir los datos del empleado
    fun imprimir() {
        println("nombre: $nombre, sueldo: $sueldo")
    }
}