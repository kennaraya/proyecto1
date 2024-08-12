package Conceptos_POO

class Alumno {
    var nombre: String = ""
    var nota: Double = 0.0

    // Método para inicializar las propiedades por teclado
    fun inicializar() {
        println("Ingrese el nombre del alumno:")
        nombre = readLine() ?: ""
        println("Ingrese la nota del alumno:")
        nota = readLine()?.toDoubleOrNull() ?: 0.0
    }

    // Método para imprimir las propiedades
    fun imprimir() {
        println("Nombre: $nombre")
        println("Nota: $nota")
    }

    // Método para mostrar si está regular
    fun estaRegular() {
        if (nota >= 4.0) {
            println("El alumno $nombre está regular.")
        } else {
            println("El alumno $nombre no está regular.")
        }
    }
}

fun main() {
    // Crear dos objetos de la clase Alumno
    val alumno1 = Alumno()
    val alumno2 = Alumno()

    // Inicializar, imprimir y verificar si están regulares
    println("Datos del primer alumno:")
    alumno1.inicializar()
    alumno1.imprimir()
    alumno1.estaRegular()

    println("\nDatos del segundo alumno:")
    alumno2.inicializar()
    alumno2.imprimir()
    alumno2.estaRegular()
}