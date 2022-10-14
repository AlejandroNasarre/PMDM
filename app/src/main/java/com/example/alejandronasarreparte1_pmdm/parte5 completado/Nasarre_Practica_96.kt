package com.example.alejandronasarreparte1_pmdm.`parte5 completado`
fun main() {
    multiplosDe2y5()
}

//funcion que pide 10 numeros y cuenta los multiplos de 2 y de 5
//mediante funcion interna
fun multiplosDe2y5() {
    fun multiplo(multiplo: Int, n: Int) = multiplo % n == 0
    var mult2 = 0
    var mult5 = 0
    for (i in 1..10) {
        println("introducir valor $i:")
        val n = readLine()!!.toInt()
        if (multiplo(n, 2))
            mult2++
        if (multiplo(n, 5))
            mult5++
    }
    println("hay $mult2 multiples de 2")
    println("hay $mult5 multiples de 5")
}