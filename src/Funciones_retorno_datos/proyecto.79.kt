package Funciones_retorno_datos

fun retornarSuperficie(ladop: Int): Int {
    val sup = ladop*ladop
    return sup
}

fun main(){
    print("Ingrese el valor del lado del cuadrado: ")
    val lado = readln().toInt()
    val superficie = retornarSuperficie(lado)
    println("La superficie del cuadrado es: $superficie")
}