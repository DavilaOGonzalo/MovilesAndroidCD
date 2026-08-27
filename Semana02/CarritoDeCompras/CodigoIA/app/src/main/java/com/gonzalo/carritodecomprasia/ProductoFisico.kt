package com.gonzalo.carritodecomprasia

/**
 * Clase que representa un producto físico tangible.
 * Hereda de la clase abstracta Producto.
 */
class ProductoFisico(nombre: String, precio: Double) : Producto(nombre, precio) {

    // Implementación concreta del método abstracto definido en la superclase.
    override fun mostrarInformacion() {
        println("Producto Físico: $nombre - Precio: S/ $precio")
    }
}
