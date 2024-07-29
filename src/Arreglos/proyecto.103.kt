package Arreglos

fun main() {
    val array = IntArray(8)  // Crear un arreglo de 8 elementos enteros

    // Primer for: cargar el arreglo con valores ingresados por el usuario
    for (i in array.indices) {
        print("Ingrese el elemento ${i + 1}: ")
        array[i] = readLine()?.toIntOrNull() ?: 0
    }

    var valorAcumuladoTotal = 0
    var valorAcumuladoMayor36 = 0
    var cantidadMayor50 = 0

    // Segundo for: analizar cada elemento del arreglo
    for (element in array) {
        valorAcumuladoTotal += element
        if (element > 36) {
            valorAcumuladoMayor36 += element
        }
        if (element > 50) {
            cantidadMayor50++
        }
    }

    // Informar resultados
    println("Valor acumulado de todos los elementos: $valorAcumuladoTotal")
    println("Valor acumulado de los elementos mayores a 36: $valorAcumuladoMayor36")
    println("Cantidad de valores mayores a 50: $cantidadMayor50")
}