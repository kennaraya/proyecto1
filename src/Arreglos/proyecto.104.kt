package Arreglos

fun main() {
    val size = 4
    val array1 = IntArray(size)
    val array2 = IntArray(size)
    val sumArray = IntArray(size)

    println("Ingrese los elementos del primer arreglo:")
    for (i in 0 until size) {
        print("Elemento $i: ")
        array1[i] = readLine()?.toIntOrNull() ?: 0
    }

    println("Ingrese los elementos del segundo arreglo:")
    for (i in 0 until size) {
        print("Elemento $i: ")
        array2[i] = readLine()?.toIntOrNull() ?: 0
    }

    for (i in 0 until size) {
        sumArray[i] = array1[i] + array2[i]
    }

    println("El arreglo resultante de la suma es:")
    for (i in 0 until size) {
        println("Elemento $i: ${sumArray[i]}")
    }
}