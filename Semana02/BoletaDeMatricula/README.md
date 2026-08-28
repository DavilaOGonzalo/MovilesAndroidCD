# BoletaDeMatricula

## Descripción
Este proyecto es un sistema de matrícula de estudiantes desarrollado en el lenguaje de programación Kotlin. El programa funciona exclusivamente a través de la consola o terminal, permitiendo una interacción fluida con el usuario para el registro de cursos, cálculo de costos y determinación de la situación académica del estudiante.

## Objetivo
El objetivo principal de este proyecto es el aprendizaje y aplicación de conceptos fundamentales de programación en Kotlin, tales como el manejo de variables, listas mutables, estructuras repetitivas (bucles) y estructuras de control condicionales.

## Tecnologías Utilizadas
*   **Lenguaje:** Kotlin
*   **Herramientas de IA:** Gemini (para la generación y refinamiento progresivo del código)
*   **Entorno:** Terminal / Consola

## Funcionalidades
*   Ingreso del nombre del estudiante y cantidad de cursos a matricular.
*   Registro detallado por cada curso (nombre, créditos y costo).
*   Cálculo automático del total de cursos matriculados.
*   Cálculo del total de créditos acumulados.
*   Cálculo del monto total a pagar.
*   Determinación automática de la carga académica.
*   Determinación automática de la forma de pago (cuotas).

## Reglas de Carga Académica
La carga académica se determina en base al total de créditos inscritos:
*   **Menor o igual a 12 créditos:** M.R
*   **De 13 a 18 créditos:** Carga completa
*   **Más de 18 créditos:** Renuncia automática

## Reglas de Forma de Pago
La cantidad de cuotas se asigna según el monto total a pagar:
*   **Menor o igual a S/. 2500:** 2 cuotas
*   **Mayor a S/. 2500:** 3 cuotas

## Estructuras de Programación Utilizadas
*   **Variables y Tipos de Datos:** Uso de `val` y `var` para almacenar información textual, entera y decimal.
*   **Listas (`MutableList`):** Implementadas para almacenar y organizar los nombres, créditos y costos de los cursos ingresados.
*   **Bucle `for`:** Utilizado para la captura iterativa de datos de cada curso y para recorrer las listas al generar el reporte final.
*   **Acumuladores:** Variables empleadas para sumar progresivamente los créditos y costos totales.
*   **Condicionales `if / else`:** Aplicados para implementar la lógica de negocio sobre la carga académica y la forma de pago.
*   **Entrada/Salida de datos:** Uso de `print()`, `println()` y `readln()` para la comunicación con el usuario.

## Desarrollo Progresivo (Prompts con Gemini)

### PROMPT 1
"Quiero desarrollar un sistema de matrícula de estudiantes en Kotlin que funcione exclusivamente mediante consola. Mantén una función main() y utiliza println(), print() y readln() para interactuar con el usuario. El programa debe solicitar primero el nombre del estudiante y luego la cantidad de cursos que desea matricular. Mediante un bucle debe solicitar por cada curso: nombre del curso, cantidad de créditos y costo. Utiliza listas para almacenar los datos de los cursos. Al finalizar, muestra en consola el nombre del estudiante y una lista de los cursos ingresados con sus créditos y costos. En este primer avance NO agregues todavía los cálculos de totales, carga académica ni forma de pago. Quiero un código sencillo para aprender variables, listas y bucles."

### PROMPT 2
"Modifica el programa anterior manteniendo toda la funcionalidad existente y manteniendo la interacción exclusivamente por consola. Ahora agrega el cálculo del total de créditos y el total a pagar. El total de créditos debe obtenerse sumando los créditos de todos los cursos ingresados y el total a pagar debe obtenerse sumando el costo de todos los cursos. Al finalizar, muestra el resumen con el nombre del estudiante, cada curso con sus créditos y costo, la cantidad de cursos matriculados, el total de créditos y el total a pagar. Utiliza las listas y el bucle que ya existen, además de variables y operaciones aritméticas. No agregues todavía las condiciones de carga académica ni la forma de pago."

### PROMPT 3
"Modifica el programa anterior manteniendo toda la funcionalidad existente y la interacción exclusivamente por consola. Ahora agrega estructuras condicionales para determinar la carga académica según el total de créditos: si el total de créditos es menor o igual a 12, mostrar M.R; si el total está entre 13 y 18, mostrar Carga completa; y si el total es mayor a 18, mostrar Renuncia automática. Además, determina la forma de pago según el total a pagar: si el total a pagar es mayor a 2500, mostrar 3 cuotas; si es menor o igual a 2500, mostrar 2 cuotas. Al finalizar, el resumen debe mostrar: estudiante, curso, créditos, costo, cursos matriculados, total de créditos, total a pagar, carga académica y forma de pago. Utiliza if/else, las listas y los bucles existentes. No agregues interfaz gráfica, base de datos ni clases innecesarias."

## Historial de Commits
*   **Commit 1:** `f9a4a62` - Agregar ingreso de datos de matricula
*   **Commit 2:** `395fa1e` - Agregar calculo de creditos y costo
*   **Commit 3:** Agregar reglas de carga academica y forma de pago

## Instrucciones de Ejecución
Para ejecutar este programa desde la terminal, siga los siguientes pasos:

1.  Compile el código fuente:
    ```bash
    kotlinc Main.kt -include-runtime -d BoletaDeMatricula.jar
    ```
2.  Ejecute el archivo generado:
    ```bash
    java -jar BoletaDeMatricula.jar
    ```

## Ejemplo de Ejecución en Consola
```text
--- SISTEMA DE MATRÍCULA DE ESTUDIANTES ---
Ingrese el nombre completo del estudiante: Juan Perez
¿Cuántos cursos desea matricular?: 2

Datos del curso #1:
Nombre del curso: Matematica
Cantidad de créditos: 5
Costo del curso: 1200

Datos del curso #2:
Nombre del curso: Programacion
Cantidad de créditos: 10
Costo del curso: 1500

==========================================
RESUMEN DE MATRÍCULA
Estudiante: Juan Perez
------------------------------------------
Curso: Matematica | Créditos: 5 | Costo: S/. 1200.0
Curso: Programacion | Créditos: 10 | Costo: S/. 1500.0
------------------------------------------
Total de cursos: 2
Total de créditos: 15
Total a pagar: S/. 2700.0
Carga académica: Carga completa
Forma de pago: 3 cuotas
==========================================
```

## Conclusión
A través de este proyecto se logró consolidar el uso de estructuras de datos y lógica de control en Kotlin. El desarrollo incremental asistido por IA permitió comprender cómo escalar una aplicación desde una entrada de datos básica hasta un sistema con lógica de negocio aplicada, manteniendo un código limpio y eficiente.

---
**Nota:** Este proyecto se trabajó íntegramente en la rama `codigo-ia`.
