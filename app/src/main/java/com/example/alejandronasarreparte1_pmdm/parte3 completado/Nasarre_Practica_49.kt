package com.example.alejandronasarreparte1_pmdm.`parte3 completado`

fun main() {
    //conteo de notas de 10 alumnos introducidos por consola y clasificacion
    // mediante for y operador de rango
    var notasMayoresA7= 0
    for (i in 1..10){
        println("introducir nota numero $i:")
        val nota = readLine()!!.toInt()
        if (nota >= 7)
            notasMayoresA7++
    }
    println("hay $notasMayoresA7 notas mayores o iguales a 7")
    println("hay ${10-notasMayoresA7} notas menores a 7")
}