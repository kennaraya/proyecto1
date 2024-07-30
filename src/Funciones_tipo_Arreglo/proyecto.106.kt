package Funciones_tipo_Arreglo

fun cargar(): IntArray {
    print("Cuantos sueldos quiere cargar:")
    val cantidad = readln().toInt()
    val sueldos = IntArray(cantidad)
    for(i in sueldos.indices) {
        print("Ingrese elemento:")
        sueldos[i] = readln().toInt()
    }
    return sueldos
}
fun imprime(sueldos: IntArray) {
    println("Listado de todos los sueldos")
    for(sueldo in sueldos)
        println(sueldo)
}
fun main(parametro: Array<String>) {
    val sueldos = cargar()
    imprime(sueldos)
}