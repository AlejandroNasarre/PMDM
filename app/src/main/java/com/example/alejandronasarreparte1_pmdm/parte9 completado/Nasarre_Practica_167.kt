package com.example.alejandronasarreparte1_pmdm.`parte9 completado`
//implementacion de clase dados con funcion de operador invoke
fun main() {
    val dados = Dados()
    dados.tirar()
    println(dados(6))
    println(dados(3))
}

class Dados (){
    val array = IntArray(10)

    fun tirar() {
        for(i in array.indices)
            array[i] = ((Math.random() * 6) + 1).toInt()
    }
//funcion operador invoke
    operator fun invoke(pos: Int) = array[pos]
}
