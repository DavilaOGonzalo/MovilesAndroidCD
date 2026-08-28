fun main() {
    println("--- SISTEMA DE MATRÍCULA DE ESTUDIANTES ---")

    // Solicitar datos básicos del estudiante
    print("Ingrese el nombre completo del estudiante: ")
    val nombreEstudiante = readln()

    print("¿Cuántos cursos desea matricular?: ")
    val cantidadCursos = readln().toIntOrNull() ?: 0

    // Listas para almacenar los datos de los cursos
    val nombresCursos = mutableListOf<String>()
    val creditosCursos = mutableListOf<Int>()
    val costosCursos = mutableListOf<Double>()

    // Bucle para solicitar datos de cada curso
    for (i in 1..cantidadCursos) {
        println("\nDatos del curso #$i:")
        
        print("Nombre del curso: ")
        nombresCursos.add(readln())

        print("Cantidad de créditos: ")
        creditosCursos.add(readln().toIntOrNull() ?: 0)

        print("Costo del curso: ")
        costosCursos.add(readln().toDoubleOrNull() ?: 0.0)
    }

    // Variables para los totales
    var totalCreditos = 0
    var totalPagar = 0.0

    // Mostrar el resumen de la matrícula
    println("\n==========================================")
    println("RESUMEN DE MATRÍCULA")
    println("Estudiante: $nombreEstudiante")
    println("------------------------------------------")
    
    for (i in 0 until nombresCursos.size) {
        println("Curso: ${nombresCursos[i]} | Créditos: ${creditosCursos[i]} | Costo: S/. ${costosCursos[i]}")
        
        // Operaciones aritméticas para acumular totales
        totalCreditos += creditosCursos[i]
        totalPagar += costosCursos[i]
    }

    // Determinar la carga académica según el total de créditos
    val cargaAcademica = if (totalCreditos <= 12) {
        "M.R"
    } else if (totalCreditos <= 18) {
        "Carga completa"
    } else {
        "Renuncia automática"
    }

    // Determinar la forma de pago según el total a pagar
    val formaPago = if (totalPagar > 2500) {
        "3 cuotas"
    } else {
        "2 cuotas"
    }

    println("------------------------------------------")
    println("Total de cursos: ${nombresCursos.size}")
    println("Total de créditos: $totalCreditos")
    println("Total a pagar: S/. $totalPagar")
    println("Carga académica: $cargaAcademica")
    println("Forma de pago: $formaPago")
    println("==========================================")
}
