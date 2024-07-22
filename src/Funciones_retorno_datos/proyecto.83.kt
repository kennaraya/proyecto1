package Funciones_retorno_datos

fun retornarPerimetro (lado: Int): Int {
    val P = lado * 4
    return P
}

fun main() {
    print("Ingrese el lado del cuadrado:")
    val la = readln().toInt()
    val perimetro = retornarPerimetro(la)
    println("El perimetro del cuadrado es $perimetro")
}