package Estructura_Repetitiva_For

fun main(){
    var aprobados = 0
    var reprobados = 0
    for(index in 1..10){
        val nota = readln().toInt()
        if (nota >= 7) {
            aprobados++
        }else{
            reprobados++
        }
    }
    println("Cantidad de alumnos con notas mayores o " + "iguales a 7: $aprobados")
    println("Cantidad de alumnos con notas menores a 7: $reprobados ")
}