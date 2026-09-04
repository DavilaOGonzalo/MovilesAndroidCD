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

    print("Ingrese el turno (M: Mañana, T: Tarde, N: Noche): ")
    val turno = readln().uppercase()

    print("Ingrese la categoría (O: Ordinario, B: Becado): ")
    val categoria = readln().uppercase()

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

    // BLOQUE 3: Condicionales

    val cargaAcademica = if (totalCreditos <= 12) {
        "M.R"
    } else if (totalCreditos <= 18) {
        "Carga completa"
    } else {
        "Renuncia automática"
    }

    val formaPago = if (totalPagar > 2500) {
        "3 cuotas"
    } else {
        "2 cuotas"
    }

    val porcentajeIncremento = when (turno) {
        "M" -> 0.10
        "T" -> 0.15
        "N" -> 0.20
        else -> 0.0
    }

    val nombreTurno = when (turno) {
        "M" -> "Mañana"
        "T" -> "Tarde"
        "N" -> "Noche"
        else -> "No especificado"
    }

    val incremento = totalPagar * porcentajeIncremento
    val totalConIncremento = totalPagar + incremento

    val esBecado = categoria == "B"
    val totalFinal = if (esBecado) 0.0 else totalConIncremento
    val nombreCategoria = if (esBecado) "Becado" else "Ordinario"

    // Resultado final

    println("------------------------------------------")
    println("Turno: $nombreTurno")
    println("Categoría: $nombreCategoria")
    println("Cursos matriculados: ${nombresCursos.size}")
    println("Total de créditos: $totalCreditos")
    println("Subtotal a pagar: S/. $totalPagar")
    println("Incremento por turno ($nombreTurno): S/. $incremento")
    println("Total a pagar: S/. $totalFinal")
    println("Carga académica: $cargaAcademica")
    println("Forma de pago: $formaPago")
    println("==========================================")
}