# Carrito de Compras - CodigoMio

## Descripción

Proyecto básico de carrito de compras desarrollado en Kotlin y Android Studio.

Esta versión fue desarrollada manualmente utilizando conceptos básicos de Kotlin como clases, objetos, listas y funciones.

## Tecnologías

- Kotlin
- Android Studio
- Jetpack Compose
- Git y GitHub

## Estructura del proyecto

### Producto.kt

Contiene la `data class Producto`, que representa un producto mediante:

- Nombre
- Precio

### Productos.kt

Contiene una lista de productos disponibles para utilizar en el carrito.

### Carrito.kt

Contiene la clase `Carrito`, encargada de:

- Agregar productos.
- Eliminar productos.
- Mostrar los productos del carrito.
- Calcular el total.

### MainActivity.kt

Contiene la ejecución principal de las pruebas mediante `println()`.

## Funcionamiento

El programa primero muestra los productos disponibles.

Después se crea un carrito y se agregan productos utilizando sus posiciones dentro de la lista.

También se prueba la eliminación de un producto y finalmente se muestra el contenido del carrito y el total.

## Ejemplo

El programa realiza operaciones como:

```kotlin
val carrito = Carrito()

carrito.agregarProducto(productos[0])
carrito.agregarProducto(productos[3])

carrito.eliminarProducto(0)

carrito.mostrarCarrito()

println("TOTAL: S/${carrito.calcularTotal()}")
