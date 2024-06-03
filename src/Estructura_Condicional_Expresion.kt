fun main() {
    /*
    //problema 1
    fun main(parametro: Array<String>) {
        print("Ingrese primer valor:")
        val valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        val valor2 = readln().toInt()
        val mayor = if (valor1 > valor2) valor1 else valor2
        println("El mayor entre $valor1 y $valor2 es $mayor")
    }
     */

    //problema 1
        print("Ingrese un valor entero:")
        val valor = readln().toInt()
        val resultado = if (valor % 2 == 0) {
            print("Cuadrado:")
            valor * valor
        } else {
            print("Cubo:")
            valor * valor * valor
        }
        print(resultado)


}