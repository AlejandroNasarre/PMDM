package com.example.alejandronasarreparte1_pmdm.`parte8 completado`

//implementacion de interfaz Figura en dos clases Cuadrado y Rectangulo
fun main() {
    val c = Cuadrado(4)
    val r = Rectangulo(3, 5)
    c.tituloResultado()
    println(c.calcularPerimetro())
    println(c.calcularSuperficie())
    r.tituloResultado()
    println(r.calcularPerimetro())
    println(r.calcularSuperficie())
}

//interfaz figura
interface Figura {
    //funcion para calcular la superficie de las figuras que implementen la interfaz
    fun calcularSuperficie(): Int

    //funcion para calcular el perimetro de las figuras que implementen la interfaz
    fun calcularPerimetro(): Int

    //funcion para imprimir el titulo
    fun tituloResultado() {
        println("Datos de la figura")
    }
}

//clase Cuadrado que implementa la interfaz Figura
class Cuadrado(var lado: Int) : Figura {
    //funcion de la interfaz figura para calcular la superficie
    override fun calcularSuperficie(): Int {
        return lado * lado
    }

    //funcion de la interfaz figura para calcular el perimetro
    override fun calcularPerimetro(): Int {
        return lado * 4
    }
}

//clase Rectangulo que implementa la interfaz Figura
class Rectangulo(var base: Int, var altura: Int) : Figura {
    //funcion de la interfaz figura para calcular la superficie
    override fun calcularSuperficie(): Int {
        return base * altura
    }

    //funcion de la interfaz figura para calcular el perimetro
    override fun calcularPerimetro(): Int {
        return base * 2 + altura * 2
    }
}