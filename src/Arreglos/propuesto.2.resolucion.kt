package Arreglos

import kotlin.random.Random

fun main (){
    val arreglo1: IntArray
    arreglo1 = IntArray(4 )
    var arreglo2 = IntArray(4)
    val arregloSuma = IntArray(4)

    var verArreglo1 = "Arreglo1: "
    var verArreglo2 = "Arreglo2: "
    var verArregloSuma = "ArregloSumado: "
    for (i in 0..arreglo1.size - 1) {

        arreglo1[i] = Random.nextInt(0,10)
        arreglo2[i] = Random.nextInt(0,10)
        arregloSuma[i] = arreglo1[i] + arreglo2[i]

        verArreglo1 += if (i == arreglo1.lastIndex)
            arreglo1[i] else arreglo1[i].toString() + ","

        verArreglo2 += if (i == arreglo2.lastIndex)
            arreglo2[i] else arreglo2[i].toString() + ","
        verArregloSuma += if (i == arregloSuma.lastIndex)
            arregloSuma[i] else arregloSuma[i].toString() + ","
    }
    println("verArreglo1")
    println("verArreglo2")
    println("verArregloSuma")
}