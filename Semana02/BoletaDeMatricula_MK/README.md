# Boleta de Matrícula

## Descripción
Este programa es una aplicación de consola desarrollada en Kotlin que permite automatizar el proceso de matrícula de un estudiante. El sistema registra los datos personales del alumno y los detalles de sus cursos, calcula automáticamente el total de créditos y el costo total de la matrícula, determina la categoría de carga académica según la normativa establecida y define la forma de pago más adecuada basada en el monto total a cancelar.

## Objetivo
El objetivo principal de este proyecto es poner en práctica conceptos fundamentales del lenguaje Kotlin mediante la interacción por consola. Se enfoca en el uso de variables, listas mutables para el manejo dinámico de datos, bucles para procesos iterativos, operaciones aritméticas para cálculos financieros y estructuras condicionales para la toma de decisiones lógica.

## Funcionamiento
El programa sigue un flujo secuencial interactivo:
1.  **Ingreso de Identidad:** Solicita el nombre completo del estudiante.
2.  **Configuración de Costos:** Se ingresa el valor monetario de un solo crédito (S/.).
3.  **Definición de Carga:** Se indica la cantidad total de cursos a matricular.
4.  **Captura de Cursos:** Mediante un ciclo, se solicita para cada curso su nombre y el número de créditos asignados.
5.  **Cálculo Individual:** Multiplica los créditos de cada curso por el costo por crédito definido.
6.  **Acumulación de Créditos:** Suma los créditos de todos los cursos ingresados.
7.  **Cálculo de Inversión:** Suma los costos de todos los cursos para obtener el total a pagar.
8.  **Evaluación Académica:** Aplica la lógica de negocio para determinar el estado de la carga académica.
9.  **Planificación de Pago:** Determina si el pago se fragmenta en 2 o 3 cuotas.
10. **Emisión de Resumen:** Muestra en consola una boleta detallada con toda la información procesada.

## Reglas del sistema

### Carga académica
La carga académica se clasifica según el total de créditos acumulados:
-   **Hasta 12 créditos:** M.R (Matrícula Regular)
-   **De 13 a 18 créditos:** Carga completa
-   **Más de 18 créditos:** Renuncia automática

### Forma de pago
La facilidad de pago se asigna automáticamente según el monto total:
-   **Si el total a pagar es menor o igual a S/. 2500:** 2 cuotas.
-   **Si el total a pagar es mayor a S/. 2500:** 3 cuotas.

## Fórmula de cálculo

El sistema utiliza las siguientes expresiones matemáticas:

**Costo por curso individual:**
> *Costo del curso = cantidad de créditos × costo por crédito*

**Monto total de la matrícula:**
> *Total a pagar = Σ (costo de todos los cursos)*

## Tecnologías utilizadas
-   **Kotlin:** Lenguaje de programación principal.
-   **Android Studio:** Entorno de desarrollo integrado (IDE).
-   **Gradle:** Sistema de gestión de proyectos y construcción.
-   **Consola (Standard Input/Output):** Interfaz de interacción con el usuario.

## Estructura del proyecto
La organización de los archivos sigue el estándar de un proyecto multimodular en Android Studio:

```text
BoletaDeMatricula_MK/
├── app/                      # Módulo de aplicación Android
├── console/                  # Módulo de Kotlin puro para consola
│   └── src/
│       └── main/
│           └── kotlin/
│               └── com/
│                   └── gonzalo/
│                       └── console/
│                           └── Main.kt    # Lógica principal del programa
├── gradle/                   # Configuración del wrapper de Gradle
├── build.gradle.kts          # Configuración de construcción de raíz
├── settings.gradle.kts       # Definición de módulos del proyecto
└── README.md                 # Documentación del proyecto
```

## Ejemplo de ejecución
A continuación se presenta un escenario típico de uso del programa:

**Entrada de datos:**
-   **Estudiante:** Gonzalo
-   **Costo por crédito:** S/. 180
-   **Cursos registrados:**
    -   PM: 4 créditos
    -   BD: 4 créditos
    -   Kotlin: 5 créditos

**Resultado en pantalla:**
```text
==========================================
RESUMEN DE MATRÍCULA
Estudiante: Gonzalo
------------------------------------------
Total de créditos: 13
Total a pagar: S/. 2340.0
Carga académica: Carga completa
Forma de pago: 2 cuotas
==========================================
```

## Uso de IA
Este proyecto se desarrolló bajo una metodología de aprendizaje asistido por Inteligencia Artificial, utilizando prompts específicos para construir la aplicación de manera incremental y pedagógica.

### Prompts utilizados

**Prompt 1 — Registro de datos**
> "Genera un programa en Kotlin que permita ingresar por consola el nombre de un estudiante, el costo por crédito, la cantidad de cursos y, mediante un bucle, el nombre y cantidad de créditos de cada curso. Utiliza variables y listas para almacenar la información."

**Prompt 2 — Cálculo de matrícula**
> "Sobre el código anterior, agrega el cálculo del costo de cada curso utilizando la cantidad de créditos multiplicada por el costo por crédito. Calcula también el total de créditos y el total a pagar, y muestra un resumen de la matrícula en consola."

**Prompt 3 — Condicionales**
> "Sobre el código anterior, agrega condicionales para determinar la carga académica según el total de créditos: hasta 12 créditos M.R., de 13 a 18 créditos carga completa y más de 18 créditos renuncia automática. También determina la forma de pago: si el total es mayor a S/. 2500 serán 3 cuotas, de lo contrario serán 2 cuotas."

## Desarrollo mediante commits
El progreso del proyecto se estructuró en tres hitos fundamentales:
-   **Commit 1:** Implementación de la entrada de datos del estudiante y estructura de listas para cursos.
-   **Commit 2:** Desarrollo de la lógica aritmética para el procesamiento de créditos y costos totales.
-   **Commit 3:** Integración de la lógica de negocio mediante estructuras de control condicional.

## Conclusión
Este proyecto ha servido como un ejercicio práctico integral para dominar la sintaxis básica y lógica de Kotlin. A través de su desarrollo, se consolidaron conocimientos sobre el manejo de entradas de usuario, la manipulación de colecciones de datos, la implementación de flujos iterativos y la aplicación de reglas de negocio mediante condicionales, todo bajo un entorno de ejecución interactivo.
