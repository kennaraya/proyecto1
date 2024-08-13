package POO_Llamada_Metodos

class Hijos(private val edades: IntArray = IntArray(5)) {

    // Método para cargar las edades desde teclado
    fun cargar() {
        for (i in edades.indices) {
            println("Ingrese la edad de la persona ${i + 1}:")
            edades[i] = readLine()?.toIntOrNull() ?: 0
        }
        imprimirMayorEdad()
        imprimirPromedioEdades()
    }

    // Método para encontrar y imprimir la mayor edad
    private fun imprimirMayorEdad() {
        val mayorEdad = edades.maxOrNull() ?: 0
        println("La mayor edad es: $mayorEdad")
    }

    // Método para calcular y imprimir el promedio de edades
    private fun imprimirPromedioEdades() {
        val promedio = edades.average()
        println("El promedio de edades es: $promedio")
    }
}

fun main() {
    val hijos = Hijos()
    hijos.cargar()
}