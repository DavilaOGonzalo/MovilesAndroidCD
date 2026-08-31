package com.gonzalo.console

fun main() {
    println("==========================================")
    println("     SISTEMA DE MATRÍCULA DE ESTUDIANTES")
    println("==========================================")

    print("Ingrese el nombre del estudiante: ")
    val nombreEstudiante = readln()

    print("Ingrese el costo por crédito: S/. ")
    val costoPorCredito = readln().toDoubleOrNull() ?: 0.0

    print("¿Cuántos cursos desea matricular?: ")
    val cantidadCursos = readln().toIntOrNull() ?: 0

    val nombresCursos = mutableListOf<String>()
    val creditosCursos = mutableListOf<Int>()

    for (i in 1..cantidadCursos) {
        println("\nDatos del curso #$i")

        print("Nombre del curso: ")
        nombresCursos.add(readln())

        print("Cantidad de créditos: ")
        creditosCursos.add(readln().toIntOrNull() ?: 0)
    }

    println("\n==========================================")
    println("DATOS INGRESADOS")
    println("Estudiante: $nombreEstudiante")
    println("Costo por crédito: S/. $costoPorCredito")
    println("------------------------------------------")

    for (i in nombresCursos.indices) {
        println(
            "Curso: ${nombresCursos[i]} | " +
                    "Créditos: ${creditosCursos[i]}"
        )
    }

    println("==========================================")
}