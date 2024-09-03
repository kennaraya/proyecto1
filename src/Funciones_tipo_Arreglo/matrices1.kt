package Funciones_tipo_Arreglo

fun recorreMatriz1(matriz: Array<IntArray>){
    for (fila in (0 until matriz.size)) {
        println()
        for (columna in (0 until matriz.size)) {
            println("Posicion[$fila][$columna] : ${matriz}")
        }
    }
}
fun recorreMatriz2(matriz: Array<IntArray>){
    for (fila in matriz.indices) {
        println()
        for (columna in matriz.indices) {
            println("Posicion[$fila][$columna] : ${matriz}")
        }
    }
}

fun main() {


    var matriz = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
        intArrayOf(10, 11, 12, 13, 14),
    )
    println(matriz[0][0])// 1
    println(matriz[0][2])// 3
//println(matriz[0][3]// ERROR
    recorreMatriz1(matriz)
    recorreMatriz2(matriz)
}