fun main() {
    //problema1
    print("Ingrese primer valor:")
    // readln() captura la entrada del teclado
    // .toInt() convierte los datos de entrada a tipo numerico
    val valor1= readln() .toInt()
    print("Ingrese segundo valor:")
    val valor2= readln() .toInt()
    val suma=valor1+valor2
    println("La suma de $valor1 y $valor2 es $suma")
    val producto = valor1*valor2
    println("El producto de $valor1 y $valor2 es $producto")
    //problema2
    print("Ingrese el valor de los lados del cuadrado:")
    val lado= readln().toInt()
    val superficie = lado*lado
    val perimetro= lado*4
    println("Un cuadrado con lados de $lado tiene como superficie $superficie y perimetro $perimetro")
    //problema3
    print("Ingrese el precio del producto:")
    val precio= readln().toInt()
    print("Ingrese la cantidad del producto:")
    val cantidad= readln().toInt()
    val abonar= precio*cantidad
    println("El comprador debe abonar $abonar")
        //problema4
    print("Ingrese el primer valor:")
    val valor1= readln().toInt()
    print("Ingrese el segundo valor:")
    val valor2= readln().toInt()
    print("Ingrese el tercer valor:")
    val valor3= readln().toInt()
    print("Ingrese el cuarto valor:")
    val valor4= readln().toInt()
    val suma= valor1+valor2+valor3+valor4
    val producto= valor1*valor2*valor3*valor4
    println("La suma de $valor1 + $valor2 + $valor3 + $valor4 es $suma")
    println("El producto de $valor1 * $valor2 * $valor3 * $valor4 es $producto")

}