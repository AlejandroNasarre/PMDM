package com.example.alejandronasarreparte1_pmdm

import java.io.File

fun main() {
    var proyecto = 1
    val salida = File("C:\\Users\\alexn\\AndroidStudioProjects\\PMDM\\trabajoKotlin")
    var str = ""
    for (i in 1..10) {
        for (j in 1..20) {
            val file =
                File("C:\\Users\\alexn\\AndroidStudioProjects\\PMDM\\app\\src\\main\\java\\com\\example\\alejandronasarreparte1_pmdm\\parte$i completado\\Nasarre_Practica_$proyecto.kt")
            val code = file.readText()
            str += "Práctica $proyecto.\n\n\n$code\n\n\n"
            proyecto++
            if (proyecto == 192) break
        }
        if (proyecto == 192) break
    }
    salida.writeText(str)
}