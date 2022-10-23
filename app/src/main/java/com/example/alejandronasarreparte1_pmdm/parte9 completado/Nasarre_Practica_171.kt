package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de funcion operar con numero variable de parametros
//y creacion de clase enumerada TipoOp
fun main() {
    println("suma: ${operar(TipoOp.SUMA, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 4.0)}")
    println("media: ${operar(TipoOp.MEDIA, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 4.0)}")
}

//enum class con las operaciones disponibles
enum class TipoOp {
    SUMA,
    MEDIA
}

//funcion operar con numero variable de parametros
fun operar(operacion: TipoOp, vararg numeros: Double): Double {
    var suma = 0.0
    for (n in numeros)
        suma += n
    if (operacion == TipoOp.SUMA)
        return suma
    else
        return suma / numeros.size
}