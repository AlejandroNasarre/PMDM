package com.example.alejandronasarreparte1_pmdm

import java.io.File
import java.io.FileOutputStream
import java.io.FileWriter

fun main() {
    var proyecto = 21
    for (i in 2..10) {
        for (j in 1..20) {
            val file =
                File("/home/INFORMATICA/alu10182258/AndroidStudioProjects/alejandroNasarreParte1_PMDM/app/src/main/java/com/example/alejandronasarreparte1_pmdm/parte$i/Nasarre_Practica_$proyecto.kt")
            file.writeText("package com.example.alejandronasarreparte1_pmdm.parte$i\n" +
                    "\n" +
                    "fun main() {\n" +
                    "    \n" +
                    "}")
            proyecto++
            if (proyecto ==192) break
        }
        if (proyecto ==192) break
    }
}