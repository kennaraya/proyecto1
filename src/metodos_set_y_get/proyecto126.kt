package metodos_set_y_get

class Empleado(val nombre: String, sueldoInicial: Double) {

    var sueldo: Double = sueldoInicial
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("Error: El sueldo no puede ser negativo.")
            }
        }

    fun imprimir() {
        println("Nombre: $nombre, Sueldo: $sueldo")
    }
}

fun main() {
    val empleado1 = Empleado("Juan", 1500.0)
    empleado1.imprimir()

    empleado1.sueldo = 2000.0
    empleado1.imprimir()

    empleado1.sueldo = -500.0  // Esto generará un mensaje de error
    empleado1.imprimir()
}