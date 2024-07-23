package Funciones_parametros_valor_por_defecto

fun suma(v1: Int, v2: Int, v3: Int = 0, v4: Int = 0, v5: Int = 0) = v1+v2+v3+v4+v5

fun main(){
    println("La suma de 5+6 es ${suma(5,6)}")
    println("La suma de 1+2+3 es ${suma(1,2,3)}")
    print("La suma de 1+2+3+4+5 es ${suma(1,2,3,4,5)}")
}