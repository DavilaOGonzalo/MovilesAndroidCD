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

    // Mostrar el resumen de la matrícula
    println("\n==========================================")
    println("RESUMEN DE MATRÍCULA")
    println("Estudiante: $nombreEstudiante")
    println("------------------------------------------")
    
    for (i in 0 until nombresCursos.size) {
        println("Curso: ${nombresCursos[i]} | Créditos: ${creditosCursos[i]} | Costo: S/. ${costosCursos[i]}")
    }
    println("==========================================")
}
