package Estructura_Repetitiva_For

fun main(){
    var suma = 0
    for(index in 1..10){
        print("Ingrese el valor $index:")
        val valor = readln().toInt()
        suma += valor
    }
    println("La suma de los valores ingresados es $suma")
    val promedio = suma / 10
    println("Su promedio es $promedio")
}