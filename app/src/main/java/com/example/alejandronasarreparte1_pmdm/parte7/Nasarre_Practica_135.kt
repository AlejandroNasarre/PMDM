package com.example.alejandronasarreparte1_pmdm.parte7

//utilizacion de objeto con implementacion interna
fun main() {
    val dados = object {
        val tiradasDados = IntArray(5)

        //funcion para tirar los dados
        fun tirar() {
            for (i in tiradasDados.indices)
                tiradasDados[i] = (Math.random() * 6 + 1).toInt()
        }

        //funcion para mostrar los resultados
        fun mostrar() {
            for (i in tiradasDados)
                println(i)
        }

        //funcion para mostrar el resultado mayor
        fun mostrarMayor() {
            var mayor = tiradasDados[0]
            for (i in tiradasDados) {
                if (i > mayor)
                    mayor = i
            }
            println(mayor)
        }
    }
    dados.tirar()
    dados.mostrar()
    dados.mostrarMayor()
}