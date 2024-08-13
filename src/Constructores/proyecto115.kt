package Constructores

// Clase Punto
class constructor(val x: Int, val y: Int) {

    // Método que retorna el cuadrante del punto
    fun cuadrante(): String {
        return when {
            x > 0 && y > 0 -> "1er Cuadrante"
            x < 0 && y > 0 -> "2do Cuadrante"
            x < 0 && y < 0 -> "3er Cuadrante"
            x > 0 && y < 0 -> "4to Cuadrante"
            x == 0 && y != 0 -> "En el eje Y"
            x != 0 && y == 0 -> "En el eje X"
            else -> "En el origen"
        }
    }
}

// Creación de 5 objetos de la clase Punto
fun main() {
    val punto1 = constructor(3, 4)    // 1er Cuadrante
    val punto2 = constructor(-5, 7)   // 2do Cuadrante
    val punto3 = constructor(-6, -8)  // 3er Cuadrante
    val punto4 = constructor(9, -2)   // 4to Cuadrante
    val punto5 = constructor(0, 5)    // En el eje Y

    // Impresión del cuadrante de cada punto
    println("Punto 1: (${punto1.x}, ${punto1.y}) está en el ${punto1.cuadrante()}")
    println("Punto 2: (${punto2.x}, ${punto2.y}) está en el ${punto2.cuadrante()}")
    println("Punto 3: (${punto3.x}, ${punto3.y}) está en el ${punto3.cuadrante()}")
    println("Punto 4: (${punto4.x}, ${punto4.y}) está en el ${punto4.cuadrante()}")
    println("Punto 5: (${punto5.x}, ${punto5.y}) está en el ${punto5.cuadrante()}")
}