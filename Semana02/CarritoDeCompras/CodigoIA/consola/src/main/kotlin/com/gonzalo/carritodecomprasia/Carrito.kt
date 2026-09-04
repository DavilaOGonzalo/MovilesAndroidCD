package com.gonzalo.carritodecomprasia

/**
 * Clase Carrito.
 * Coordina la gestión de productos aplicando los conceptos de POO aprendidos.
 */
class Carrito {
    // Encapsulamiento: La lista de productos es privada para evitar modificaciones directas.
    private val productos = mutableListOf<Producto>()

    // Polimorfismo: Recibe cualquier objeto que sea un 'Producto'.
    fun agregarProducto(producto: Producto) {
        productos.add(producto)
        println("Agregado al carrito: ${producto.nombre}")
    }

    // Polimorfismo: Itera sobre la lista llamando a mostrarInformacion() de cada tipo de producto.
    fun mostrarCarrito() {
        println("\n--- Resumen del Carrito ---")
        if (productos.isEmpty()) {
            println("El carrito esta vacio.")
        } else {
            for (p in productos) {
                p.mostrarInformacion()
            }
        }
    }

    // Abstracción y Encapsulamiento: Calcula el total usando el método getPrecio() heredado.
    fun calcularTotal(): Double {
        var total = 0.0
        for (p in productos) {
            total += p.getPrecio()
        }
        return total
    }
}
