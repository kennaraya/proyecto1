fun main(){
    /*
    //problema 1
    do {
        print("Ingrese un valor comprendido entre 0 y 999")
        val valor = readln().toInt()
        if(valor < 10)
            println("El valor ingresado tiene un digito")
        else
            if(valor < 100)
                println("El valor ingresado tiene dos digitos")
            else
                println("El valor ingresado tiene 3 digitos")
    }while(valor != 0)
     */

    /*
//problema propuesto 1
    var sumas = 0
    do{
        print("Ingrese el valor")
        val num = readln().toInt()
        if(num != 9999) {
            sumas += num
        }
    }while (num != 9999)
    println ("La suma de valores es $sumas")
    if (sumas < 0)
        println("La suma es menor que cero")
    else
        if (sumas > 0)
            println("La suma es mayor que cero")
    else
        println ("La suma es 0")
     */

    /*
    //problema propuesto 2
    var sumacred = 0.0
    do {
        print("Ingrese un numero de cuenta (negativo para finalizar):")
        val numcuenta: Int = readln().toInt()
        if (numcuenta >= 0) {
            print("Ingrese el saldo actual:")
            val saldo: Double = readln().toDouble()
            if (saldo > 0.0) {
                println("El estado de la cuenta con el numero $numcuenta es Acreedor")
                sumacred += saldo
            }else
                if (saldo < 0.0){
                    println("El estado de la cuenta con el numero $numcuenta es Deudor")
                }else
                    if (saldo == 0.0){
                        println("El estado de la cuenta con el numero $numcuenta es Nulo")
                    }
        }
    }while (numcuenta >= 0)
    println("La suma total del saldo de los Acreedores es $sumacred")
     */

}