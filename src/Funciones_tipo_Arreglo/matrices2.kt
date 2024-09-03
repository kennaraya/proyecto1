package Funciones_tipo_Arreglo

/*
Ejercicio 1: Suma de dos matrices
Escribe un programa en Kotlin que tome dos matrices de
enteros de las mismas dimensiones y calcule su suma.
El programa debe mostrar la matriz resultante.
Instrucciones:
1. Define en el main dos matrices de enteros
(por ejemplo, de tamaño 3x3).
2. Metodo que sume las matrices elemento por
elemento y reciba por parametro las filas,
las columnas, y ambas matrices.
3. Metodo que recibe e imprime la matriz resultante.
*/

fun sumarMatriz(
    filas: Int, columnas: Int, matrix1: Array<IntArray>,
    matrix2: Array<IntArray>
): Array<IntArray> {
    val result = Array(filas) { IntArray(columnas) }

    for (f in 0 until filas) {
        for (c in 0 until filas) {
            result[f][c] = matrix1[f][c] + matrix2[f][c]
        }
    }
    return result
}

fun imprimirMatriz(matriz: Array<IntArray>) {
    println("Matriz resultante:")
    for (valores in matriz) {
        println(valores.joinToString(""))
    }
}

fun main(){
    val filas = 3 //cantidad de filas
    val columnas = 3 //cantidad de columnas

}