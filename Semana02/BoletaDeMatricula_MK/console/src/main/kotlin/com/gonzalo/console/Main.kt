package com.gonzalo.console

fun main() {
    println("==========================================")
    println("     SISTEMA DE MATRÍCULA DE ESTUDIANTES")
    println("==========================================")

    // BLOQUE 1: Ingreso de datos

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

    // BLOQUE 2: Cálculo de créditos y costos

    var totalCreditos = 0
    var totalPagar = 0.0

    println("\n==========================================")
    println("RESUMEN DE MATRÍCULA")
    println("Estudiante: $nombreEstudiante")
    println("------------------------------------------")

    for (i in nombresCursos.indices) {

        val costoCurso = creditosCursos[i] * costoPorCredito

        println(
            "Curso: ${nombresCursos[i]} | " +
                    "Créditos: ${creditosCursos[i]} | " +
                    "Costo: S/. $costoCurso"
        )

        totalCreditos += creditosCursos[i]
        totalPagar += costoCurso
    }

    println("------------------------------------------")
    println("Cursos matriculados: ${nombresCursos.size}")
    println("Total de créditos: $totalCreditos")
    println("Total a pagar: S/. $totalPagar")
    println("==========================================")
}