package colaboracion_de_clases

// Definición de la clase Socio
class Socio(val nombre: String, val antiguedad: Int)

// Definición de la clase Club
class Club(val socio1: Socio, val socio2: Socio, val socio3: Socio) {

    // Método para imprimir el nombre del socio con mayor antigüedad
    fun imprimirSocioConMayorAntiguedad() {
        val socioConMayorAntiguedad = listOf(socio1, socio2, socio3).maxByOrNull { it.antiguedad }
        println("El socio con mayor antigüedad es: ${socioConMayorAntiguedad?.nombre}")
    }
}

// Ejemplo de uso
fun main() {
    // Crear tres objetos de tipo Socio
    val socio1 = Socio("Juan", 10)
    val socio2 = Socio("Ana", 15)
    val socio3 = Socio("Luis", 8)

    // Crear un objeto de tipo Club
    val club = Club(socio1, socio2, socio3)

    // Imprimir el nombre del socio con mayor antigüedad
    club.imprimirSocioConMayorAntiguedad()
}