package modificadores_private_y_public

import kotlin.random.Random

class ArregloEnteros {
    // Propiedad privada de tipo arreglo de 5 enteros
    private val numeros: IntArray = IntArray(5)

    init {
        // Llamada al método privado para cargar valores aleatorios
        cargarValoresAleatorios()
    }

    // Método privado para cargar valores aleatorios entre 0 y 10
    private fun cargarValoresAleatorios() {
        for (i in numeros.indices) {
            numeros[i] = Random.nextInt(0, 11) // Valores aleatorios entre 0 y 10
        }
    }

    // Método público para mostrar el arreglo
    fun mostrarArreglo() {
        println("Arreglo: ${numeros.joinToString(", ")}")
    }

    // Método público para mostrar el mayor elemento del arreglo
    fun mostrarMayor() {
        val mayor = numeros.maxOrNull() ?: Int.MIN_VALUE
        println("Mayor elemento: $mayor")
    }

    // Método público para mostrar el menor elemento del arreglo
    fun mostrarMenor() {
        val menor = numeros.minOrNull() ?: Int.MAX_VALUE
        println("Menor elemento: $menor")
    }
}

fun main() {
    val arregloEnteros = ArregloEnteros()
    arregloEnteros.mostrarArreglo()
    arregloEnteros.mostrarMayor()
    arregloEnteros.mostrarMenor()
}