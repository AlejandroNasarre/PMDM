package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de metodo con numero variable de argumentos
fun main() {
    println(suma(2,3,8,6,7))
}
//funcion con numero variable de parametros que retorna la suma de todos ellos
fun suma(vararg valores: Int): Int {
    var suma = 0
    for (n in valores)
        suma += n
    return suma

}