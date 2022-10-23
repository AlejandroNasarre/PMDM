package com.example.alejandronasarreparte1_pmdm.entradaTeclado

fun retornarInt(mensaje: String): Int {
    print(mensaje)
    return readLine()!!.toInt()
}
fun retornarDouble(mensaje: String): Double {
    print(mensaje)
    return readLine()!!.toDouble()
}
fun retornarFloat(mensaje: String): Float {
    print(mensaje)
    return readLine()!!.toFloat()
}