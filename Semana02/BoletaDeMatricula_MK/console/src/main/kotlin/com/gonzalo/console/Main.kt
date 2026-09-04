package com.gonzalo.console

fun main() {
    println("==========================================")
    println("     SISTEMA DE MATRÍCULA DE ESTUDIANTES")
    println("==========================================")

    var aforoMaximo: Int
    while (true) {
        print("Ingrese el aforo máximo de estudiantes: ")
        val input = readln()
        val num = input.toIntOrNull()
        if (num != null && num > 0) {
            aforoMaximo = num
            break
        }
        println("Error: Ingrese un número válido mayor a 0.")
    }

    var estudiantesRegistrados = 0

    while (estudiantesRegistrados < aforoMaximo) {
        println("\n--- Registro de Estudiante #${estudiantesRegistrados + 1} ---")

        // BLOQUE 1: Ingreso de datos con validación

        var nombreEstudiante: String
        while (true) {
            print("Ingrese el nombre del estudiante: ")
            nombreEstudiante = readln().trim()
            if (nombreEstudiante.isEmpty()) {
                println("Error: El nombre no puede estar vacío.")
            } else if (!nombreEstudiante.all { it.isLetter() || it.isWhitespace() }) {
                println("Error: El nombre del estudiante solo puede contener letras (A-Z).")
            } else {
                break
            }
        }

        var categoria: String
        while (true) {
            print("Ingrese la categoría (O: Ordinario, B: Becado): ")
            categoria = readln().uppercase().trim()
            if (categoria == "O" || categoria == "B") break
            println("Error: Ingrese 'O' para Ordinario o 'B' para Becado.")
        }

        val costoPorCredito: Double
        if (categoria == "O") {
            var costo: Double
            while (true) {
                print("Ingrese el costo por crédito: S/. ")
                val input = readln()
                val num = input.toDoubleOrNull()
                if (num != null && num > 0) {
                    costo = num
                    break
                }
                println("Error: Ingrese un monto numérico válido mayor a 0 (ej: 50.0).")
            }
            costoPorCredito = costo
        } else {
            costoPorCredito = 0.0
        }

        var turno: String
        while (true) {
            print("Ingrese el turno (M: Mañana, T: Tarde, N: Noche): ")
            turno = readln().uppercase().trim()
            if (turno == "M" || turno == "T" || turno == "N") break
            println("Error: Ingrese 'M', 'T' o 'N'.")
        }

        var cantidadCursos: Int
        while (true) {
            print("¿Cuántos cursos desea matricular?: ")
            val input = readln()
            val num = input.toIntOrNull()
            if (num != null && num > 0) {
                cantidadCursos = num
                break
            }
            println("Error: Ingrese un número de cursos válido (mínimo 1).")
        }

        val nombresCursos = mutableListOf<String>()
        val creditosCursos = mutableListOf<Int>()

        for (i in 1..cantidadCursos) {
            println("\nDatos del curso #$i")
            
            var nombreCurso: String
            while (true) {
                print("Nombre del curso: ")
                nombreCurso = readln().trim()
                if (nombreCurso.isEmpty()) {
                    println("Error: El nombre del curso no puede estar vacío.")
                } else if (!nombreCurso.all { it.isLetter() || it.isWhitespace() }) {
                    println("Error: El nombre del curso solo puede contener letras (A-Z).")
                } else {
                    nombresCursos.add(nombreCurso)
                    break
                }
            }

            while (true) {
                print("Cantidad de créditos: ")
                val input = readln()
                val num = input.toIntOrNull()
                if (num != null && num > 0) {
                    creditosCursos.add(num)
                    break
                }
                println("Error: Ingrese una cantidad de créditos válida mayor a 0.")
            }
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
            println("Curso: ${nombresCursos[i]} | Créditos: ${creditosCursos[i]} | Costo: S/. $costoCurso")
            totalCreditos += creditosCursos[i]
            totalPagar += costoCurso
        }

        // BLOQUE 3: Condicionales y Cálculos Finales

        val cargaAcademica = when {
            totalCreditos <= 12 -> "M.R"
            totalCreditos <= 18 -> "Carga completa"
            else -> "Requiere autorización"
        }

        val numCuotas = if (totalPagar > 2500) 3 else 2

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
        val subtotalConIncremento = totalPagar + incremento
        val igv = subtotalConIncremento * 0.18

        val esBecado = categoria == "B"
        val totalFinal = if (esBecado) 0.0 else (subtotalConIncremento + igv)
        val nombreCategoria = if (esBecado) "Becado" else "Ordinario"

        val montoPorCuota = totalFinal / numCuotas

        // Resultado final

        println("------------------------------------------")
        println("Turno: $nombreTurno")
        println("Categoría: $nombreCategoria")
        println("Cursos matriculados: ${nombresCursos.size}")
        println("Total de créditos: $totalCreditos")
        println("Subtotal a pagar: S/. $totalPagar")
        println("Incremento por turno ($nombreTurno): S/. $incremento")
        println("IGV (18%): S/. $igv")
        println("Total a pagar: S/. $totalFinal")
        println("Carga académica: $cargaAcademica")
        println("Forma de pago: $numCuotas cuotas")
        for (i in 1..numCuotas) {
            println("Pago cuota #$i: S/. $montoPorCuota")
        }
        println("==========================================")

        estudiantesRegistrados++

        if (estudiantesRegistrados < aforoMaximo) {
            var continuar: String
            while (true) {
                print("\n¿Desea registrar otro estudiante? (S/N): ")
                continuar = readln().uppercase().trim()
                if (continuar == "S" || continuar == "N") break
                println("Error: Ingrese 'S' para sí o 'N' para no.")
            }
            if (continuar == "N") break
        } else {
            println("\nSe ha alcanzado el aforo máximo ($aforoMaximo).")
        }
    }

    println("\n==========================================")
    println("PROCESO FINALIZADO")
    println("Estudiantes registrados: $estudiantesRegistrados")
    println("==========================================")
}
