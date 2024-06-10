fun main() {
    /*
    //Problema 1
    var x = 1
    while (x <= 100){
        println(x)
        x++
    }
     */

    /*
    //Problema 2
    print("Ingrese un valor:")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor) {
        println("x")
        x++
    }
     */

    /*
    //problema propuesto 1
    var x = 1
    var notasmax = 0
    var notasmin = 0
    while (x <= 10){
        print("Ingrese la nota del alumno:")
        val nota: Int = readln().toInt()
        x++
        if(nota>=7 && nota<10)
            notasmax = notasmax + 1
        else
            notasmin = notasmin + 1
    }
    println("La cantidad de notas que aprobaron son: $notasmax")
    println("La cantidad de notas que reprobaron son: $notasmin")
     */

    /*
    //problema propuesto 2
    var x = 1
    print("Ingrese el numero de alturas que desea ingresar:")
    val n: Int = readln().toInt()
    var suma = 0.0
    while (x <= n) {
        print("Ingrese la altura:")
        val altura: Double = readln().toDouble()
        suma = suma + altura
        x = x + 1
    }
    val promedio = suma/n
    println("La altura promedio de las personas es: $promedio")
     */

    /*
    //problema propuesto 3
    var x = 1
    print("Ingrese la cantidad de empleados:")
    val n: Int = readln().toInt()
    var suma = 0
    var sueldomin = 0
    var sueldomax = 0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo: Int = readln().toInt()
        suma = suma + sueldo
        x = x + 1
        if(sueldo >= 100 && sueldo <= 300)
            sueldomin = sueldomin + 1
        else
            if(sueldo >= 300 && sueldo <= 500)
                sueldomax = sueldomax + 1
    }
    val importe = suma*n
    println("Los cantidad de empleados que cobran entre $100 y $300 son: $sueldomin")
    println("Los cantidad de empleados que cobran más de $300 son: $sueldomax")
    println("El importe que gasta la empresa es de $importe dolares")
     */

/*
    //problema propuesto 4
    var x = 11
    while (x <= 275) {
        println("$x")
        x = x + 11
    }
    */

    /*
    //problema propuesto 5
    var x = 8
    while (x <= 500) {
        println("$x")
        x = x + 8
    }
     */

    /*
    //problema propuesto 6
    var x = 1
    var x2 = 1
    var suma1 = 0
    var suma2 = 0
    println("Lista 1")
    while (x <= 5) {
        print("Ingrese un valor:")
        val vall1: Int = readln().toInt()
        suma1 = suma1 + vall1
        x = x + 1
    }
    println("Lista 2")
    while (x2 <= 5) {
        print("Ingrese un valor:")
        val vall2: Int = readln().toInt()
        suma2 = suma2 + vall2
        x2 = x2 + 1
    }
    if(suma1 == suma2)
        println("Listas iguales")
    else
        if(suma1 > suma2)
            println("Lista 1 mayor")
        else
            if(suma2 > suma1)
                println("Lista 2 mayor")
     */

    /*
    //problema propuesto 7
    var x = 1
    var pares = 0
    var impares = 0
    print("Ingrese la cantidad de numeros deseada a ingresar:")
    val n : Int = readln().toInt()
    while (x <= n) {
        print("Ingrese un numero:")
        val num: Int = readln().toInt()
        x = x + 1
        if (num % 2 == 0)
            pares = pares + 1
        else
            impares = impares + 1
    }
    println("La cantidad de numero pares es: $pares")
    println("La cantidad de numero impares es: $impares")
     */

}