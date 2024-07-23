package Funciones_parametros_valor_por_defecto

fun tituloSubrayado(titulo: String, caracter: String = "*"){
    println("titulo")
    for (d in 1..titulo.length)
        print(caracter)
    println()
}

fun main(){
    tituloSubrayado("Sistema de administracion")
    tituloSubrayado("Ventas", "-")
}