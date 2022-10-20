package com.example.alejandronasarreparte1_pmdm.`parte6 completado`

//creacion de un objeto alumno con nombre y nota y utilizacion de sus funciones
fun main() {
    val persona1 = Alumno()
    persona1.inicializar("Juan", 7)
    persona1.imprimir()
    persona1.estado()

    val persona2 = Alumno()
    persona2.inicializar("Pedro", 3)
    persona2.imprimir()
    persona2.estado()
}

class Alumno {
    private var nombre: String = ""
    private var nota: Int = 0

    //inicializadro de las variables de clase
    fun inicializar(nombre: String, nota: Int) {
        this.nombre = nombre
        this.nota = nota
    }

    //funcion para imprimir el objeto
    fun imprimir() {
        println("Nombre: $nombre, nota:$nota")
    }

    //funcion para comprobar si el alumno esta aprobado o suspendido
    fun estado() {
        if (nota >= 4)
            println("nota aprobada")
        else
            println("nota suspendida")
    }
}