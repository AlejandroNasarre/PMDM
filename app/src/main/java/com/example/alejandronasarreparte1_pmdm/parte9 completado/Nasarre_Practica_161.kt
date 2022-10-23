package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de funcion de extension de la clase Int
fun main() {
    val n = 5
    n.hasta(10)

}
//funcion de extension de la clase Intque permite mostrar los numeros hasta el valor
//introducido por parametro
fun Int.hasta(hasta:Int) {
    for (i in this..hasta)
        println("$i, ")
}