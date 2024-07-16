package Estructura_Repetitiva_For

fun main(){
    var cant0 = 0
    var cant1 = 0
    var cant2 = 0
    var cantmashijos = 0
    for(d in 1..10) {
        print("Ingrese la cantidad de hijos de la familia:")
        val hijos = readln().toInt()
        when(hijos){
            0 -> cant0++
            1 -> cant1++
            2 -> cant2++
            else -> cantmashijos++
        }
    }
    println("Las familias con 0 hijos son: $cant0")
    println("Las familias con 1 hijos son: $cant1")
    println("Las familias con 2 hijos son: $cant2")
    println("Las familias con mas de 2 hijos son: $cantmashijos")
}