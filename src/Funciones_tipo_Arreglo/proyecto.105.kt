package Funciones_tipo_Arreglo

fun cargar(arreglo: IntArray) {
    for(i in arreglo.indices) {
        print("Ingrese elemento:")
        arreglo[i] = readln().toInt()
    }
}
fun imprimir(arreglo: IntArray) {
    for(elemento in arreglo)
        println(elemento)
}
fun main(parametro: Array<String>) {
    val arre = IntArray(5)
    cargar(arre)
    imprimir(arre)
}
