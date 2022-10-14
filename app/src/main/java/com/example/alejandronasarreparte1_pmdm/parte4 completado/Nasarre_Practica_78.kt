package com.example.alejandronasarreparte1_pmdm.`parte4 completado`
//ordenacion de tres numeros introducidos por consola mediante metodo
fun main() {
    println("Introducir primer valor:")
    val n1 = readLine()!!.toInt()
    println("Introducir segundo valor:")
    val n2 = readLine()!!.toInt()
    println("Introducir tercer valor:")
    val n3 = readLine()!!.toInt()
    ordenarMayorAMenor(n1,n2,n3)
}
//funcion para ordenar tres numeros pasados por parametro de mayor a menor
fun ordenarMayorAMenor(n1: Int,n2: Int,n3: Int){
    if (n1 > n2 && n1 > n3){
        if (n2 > n3)
            println("$n1,$n2,$n3")
        else
            println("$n1,$n3,$n2")

    }else if (n2 > n3){
        if (n1>n3)
            println("$n2,$n1,$n3")
        else
            println("$n2,$n3,$n1")
    }else{
        if (n1>n2)
            println("$n3,$n1,$n2")
        else
            println("$n3,$n2,$n1")
    }
}