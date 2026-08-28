# Carrito de Compras - Kotlin POO

## Objetivo
Este proyecto tiene como propósito el aprendizaje del lenguaje Kotlin mediante la implementación de un carrito de compras básico, aplicando los pilares fundamentales de la Programación Orientada a Objetos (POO).

## Tecnologías
- **Kotlin**: Lenguaje de programación principal.
- **Android Studio**: Entorno de desarrollo.
- **Jetpack Compose**: Para la estructura base de la aplicación.
- **Logcat**: Para la visualización de resultados mediante `println()`.

## Estructura del proyecto
- **Producto.kt**: Clase base abstracta que define los atributos y métodos comunes.
- **ProductoFisico.kt**: Subclase para productos tangibles.
- **ProductoDigital.kt**: Subclase para productos descargables.
- **Carrito.kt**: Clase que gestiona la colección de productos y realiza cálculos.
- **MainActivity.kt**: Punto de entrada donde se ejecutan las pruebas y demostraciones.

## Pilares de POO

### Abstracción
Se aplica mediante la clase `abstract class Producto`, que define la estructura general pero no permite instancias directas.
```kotlin
abstract class Producto(val nombre: String, precioInicial: Double) {
    abstract fun mostrarInformacion()
}
```

### Encapsulamiento
Protegemos el precio usando el modificador `private` y exponiendo métodos seguros para su acceso y modificación.
```kotlin
private var precio: Double = ...
fun getPrecio(): Double = precio
fun setPrecio(nuevoPrecio: Double) {
    if (nuevoPrecio >= 0) precio = nuevoPrecio
}
```

### Herencia
`ProductoFisico` y `ProductoDigital` extienden de `Producto`, heredando sus propiedades y métodos.
```kotlin
class ProductoDigital(...) : Producto(nombre, precio)
```

### Polimorfismo
El carrito maneja una lista de tipo `Producto`, pero cada objeto ejecuta su propia versión de `mostrarInformacion()` en tiempo de ejecución.
```kotlin
for (p in productos) {
    p.mostrarInformacion() // Ejecuta la versión del hijo correspondiente
}
```

## Funcionalidades
- Crear productos físicos y digitales.
- Mostrar información detallada por tipo de producto.
- Agregar productos a un carrito virtual.
- Mostrar el resumen de compra.
- Calcular el total automáticamente.
- Validar que no existan precios negativos.

## Prompts utilizados

### Prompt 1 - Abstracción
Estoy desarrollando una aplicación Android Studio con Kotlin para aprender programación orientada a objetos.
Quiero crear un carrito de compras básico y mostrar los resultados mediante println() en la consola de Android Studio (Logcat).
Este es el primer avance del proyecto y corresponde al primer commit.
Quiero aplicar el concepto de ABSTRACCIÓN.
Requisitos:
- Crear una clase abstracta llamada Producto.
- Producto debe tener nombre de tipo String y precio de tipo Double.
- Crear una función abstracta llamada mostrarInformacion().
- Crear una clase llamada ProductoFisico que herede de Producto.
- ProductoFisico debe implementar mostrarInformacion().
- Crear algunos productos físicos para comprobar que funciona.
- Mostrar los productos mediante println().
- Mantener el código sencillo y apropiado para un estudiante que está aprendiendo Kotlin.
- Usar programación orientada a objetos básica.
- No utilizar bases de datos, APIs, ViewModel, Repository, patrones de diseño ni funcionalidades innecesariamente avanzadas.
- No implementar todavía encapsulamiento, herencia adicional, polimorfismo ni carrito de compras. Solo preparar la abstracción necesaria para este primer avance.
Indícame qué archivos debo crear o modificar y proporciona el código completo de cada archivo.
Explica brevemente dónde se está aplicando la abstracción.

### Prompt 2 - Encapsulamiento
Continúa trabajando sobre el mismo proyecto de carrito de compras en Kotlin.
El proyecto ya tiene:
- Una clase abstracta Producto.
- Una clase ProductoFisico que herede de Producto.
- El método mostrarInformacion().
- Los resultados se muestran mediante println() en la consola de Android Studio.
Este es el segundo avance del proyecto y debe corresponder al segundo commit.
Ahora quiero implementar el concepto de ENCAPSULAMIENTO.
Requisitos:
- Mantener la estructura existente del proyecto.
- En la clase Producto, hacer que el precio no pueda ser modificado directamente desde fuera de la clase.
- Utilizar una propiedad privada para el precio.
- Crear un método público para obtener el precio.
- Crear un método público para cambiar el precio de manera controlada.
- El precio no debe permitir valores negativos.
- Mantener nombre y precio como datos básicos del producto.
- Mantener Producto como clase abstracta.
- Mantener ProductoFisico funcionando.
- Mostrar mediante println() una prueba de que el precio puede consultarse y modificarse correctamente.
- Mantener el código sencillo, apropiado para un estudiante que está aprendiendo Kotlin y POO.
- No implementar todavía polimorfismo, carrito de compras ni productos digitales.
- No utilizar ViewModel, Repository, interfaces complejas, bases de datos ni patrones de diseño.
Indica claramente qué cambios realizaste y explica brevemente dónde se aplica el encapsulamiento.

### Prompt 3 - Herencia
Continúa trabajando sobre el mismo proyecto de carrito de compras en Kotlin.
Hasta ahora el proyecto tiene:
- Una clase abstracta Producto.
- Una clase ProductoFisico que herede de Producto.
- El método mostrarInformacion().
- El precio está encapsulado mediante una propiedad privada, getPrecio() y setPrecio().
- El precio no permite valores negativos.
- Los resultados se muestran mediante println() en la consola de Android Studio.
Este es el tercer avance del proyecto y debe corresponder al tercer commit.
Ahora quiero implementar y demostrar claramente el concepto de HERENCIA.
Requisitos:
- Mantener la clase abstracta Producto como clase base.
- Mantener el encapsulamiento del precio que ya existe.
- Crear una nueva clase llamada ProductoDigital que herede de Producto.
- ProductoDigital debe tener una característica propia llamada tipoArchivo de tipo String.
- ProductoFisico y ProductoDigital deben ser clases hijas de Producto.
- Ambas clases deben implementar mostrarInformacion() de acuerdo con su propio tipo de producto.
- Crear ejemplos de ProductoFisico y ProductoDigital.
- Mostrar ambos tipos mediante println().
- Demostrar claramente que las dos clases heredan características de Producto.
- Mantener el código sencillo y apropiado para un estudiante que está aprendiendo Kotlin y POO.
- No implementar todavía polimorfismo de manera explícita, carrito de compras ni productos adicionales.
- No utilizar ViewModel, Repository, interfaces complejas, bases de datos ni patrones de diseño.
- No eliminar ni romper el encapsulamiento implementado en el Prompt 2.
Indica claramente qué archivos creaste o modificaste y explica brevemente dónde se aplica la HERENCIA.

### Prompt 4 - Polimorfismo
Continúa trabajando sobre el mismo proyecto de carrito de compras en Kotlin.
Hasta ahora el proyecto tiene:
- Una clase abstracta Producto.
- Una clase ProductoFisico que herede de Producto.
- Una clase ProductoDigital que hereda de Producto.
- Encapsulamiento del precio mediante private, getPrecio() y setPrecio().
- El método mostrarInformacion() implementado en las clases hijas.
- Resultados mostrados mediante println() en la consola de Android Studio.
Este es el cuarto avance del proyecto y debe corresponder al cuarto commit.
Ahora quiero implementar claramente el concepto de POLIMORFISMO.
Requisitos:
- Mantener todas las clases y funcionalidades anteriores.
- Crear una lista de tipo Producto.
- Agregar a esa misma lista objetos ProductoFisico y ProductoDigital.
- Recorrer la lista utilizando un for.
- Llamar a mostrarInformacion() desde una referencia de tipo Producto.
- Cada objeto debe ejecutar su propia implementación de mostrarInformacion().
- Mostrar claramente mediante println() que se están procesando diferentes tipos de productos desde una misma lista.
- Mantener el encapsulamiento del precio.
- No crear todavía la clase Carrito.
- No calcular todavía el total del carrito.
- Mantener el código sencillo y apropiado para un estudiante que está aprendiendo Kotlin y POO.
- No utilizar ViewModel, Repository, bases de datos, interfaces complejas ni patrones de diseño.
Quiero que expliques claramente dónde está el polimorfismo y por qué una lista de tipo Producto puede contener objetos ProductoFisico y ProductoDigital.
Indica qué archivos modificaste y proporciona el código completo de los archivos modificados.

### Prompt 5 - Carrito
Continúa trabajando sobre el mismo proyecto de carrito de compras en Kotlin.
Hasta ahora el proyecto tiene:
- Una clase abstracta Producto.
- ProductoFisico y ProductoDigital como clases hijas.
- Encapsulamiento del precio mediante private, getPrecio() y setPrecio().
- Herencia.
- Polimorfismo mediante una lista de tipo Producto.
- Los resultados se muestran mediante println() en la consola de Android Studio.
Este es el quinto avance del proyecto y debe corresponder al quinto commit.
Ahora quiero implementar la clase Carrito.
Requisitos:
- Crear una clase llamada Carrito.
- El carrito debe tener una lista privada de tipo MutableList<Producto>.
- Crear una función agregarProducto(producto: Producto).
- Crear una función mostrarCarrito().
- Crear una función calcularTotal(): Double.
- El carrito debe poder almacenar tanto ProductoFisico como ProductoDigital.
- Utilizar el polimorfismo existente, trabajando con objetos de tipo Producto.
- calcularTotal() debe recorrer los productos y sumar sus precios utilizando getPrecio().
- mostrarCarrito() debe mostrar mediante println() los productos que están dentro del carrito.
- Mostrar también el total del carrito.
- Mantener el código sencillo y apropiado para un estudiante que está aprendiendo Kotlin y POO.
- Mantener la abstracción, encapsulamiento, herencia y polimorfismo que ya existen.
- No implementar todavía el README final.
- No agregar interfaz gráfica para el carrito.
- No utilizar ViewModel, Repository, bases de datos, APIs ni patrones de diseño.
Indica claramente qué archivos creaste o modificaste y explica brevemente cómo se relaciona la clase Carrito con los cuatro pilares de POO que ya implementamos.

### Prompt 6 - Integración final
Continúa trabajando sobre el mismo proyecto de carrito de compras en Kotlin.

Este es el sexto y último avance del proyecto y debe corresponder al sexto commit.

Hasta ahora hemos implementado:

1. Abstracción:
   - Clase abstracta Producto.
   - Método abstracto mostrarInformacion().

2. Encapsulamiento:
   - Precio privado.
   - Métodos getPrecio() y setPrecio().
   - Validación para evitar precios negativos.

3. Herencia:
   - ProductoFisico hereda de Producto.
   - ProductoDigital hereda de Producto.

4. Polimorfismo:
   - Lista de tipo Producto.
   - Objetos ProductoFisico y ProductoDigital dentro de la misma lista.
   - Llamada polimórfica a mostrarInformacion().

5. Carrito:
   - Clase Carrito.
   - Lista privada de productos.
   - agregarProducto().
   - mostrarCarrito().
   - calcularTotal().

OBJETIVO DEL SEXTO AVANCE:

Integrar y dejar funcionando todo el proyecto como un ejemplo final sencillo de un carrito de compras orientado a objetos.

Requisitos:

- Mantener las clases y funcionalidades anteriores.
- No eliminar ninguno de los cuatro pilares de POO.
- Crear una ejecución final clara desde MainActivity.
- Mostrar mediante println():
  1. Los productos disponibles.
  2. Los diferentes tipos de productos.
  3. Los productos agregados al carrito.
  4. El contenido final del carrito.
  5. El total a pagar.
- Utilizar tanto ProductoFisico como ProductoDigital.
- Utilizar el objeto Carrito.
- Calcular correctamente el total.
- Mantener el código sencillo y apropiado para un estudiante que está aprendiendo Kotlin.
- No utilizar ViewModel, Repository, bases de datos, APIs, patrones de diseño ni funcionalidades avanzadas innecesarias.
