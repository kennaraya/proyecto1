package Estructura_condicional_when_argumento

fun main(){
print("Ingrese un valor entero positivo comprendido entre 1 y 9999:")
    val valor = readln().toInt()
    when(valor){
        in 1..9 -> print("Tiene 1 digito")
        in 10..99 -> print("Tiene 2 digito")
        in 100..999 -> print("Tiene 3 digito")
        in 1000..9999 -> print("Tiene 4 digito")
        in 10000..99999 -> print("Tiene 5 digito")
        else->print("No se encuentra comprendido en el rango indicado")
    }


}