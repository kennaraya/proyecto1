package Funciones_con_argumentos_nombrados

fun mostrarTablaDeMultiplicar(valor: Int, termino: Int = 10) {
    for (i in 1..termino) {
        println("$valor x $i = ${valor * i}")
    }
}

fun main() {
    mostrarTablaDeMultiplicar(valor = 5, termino = 12)
    mostrarTablaDeMultiplicar(valor = 7)
}