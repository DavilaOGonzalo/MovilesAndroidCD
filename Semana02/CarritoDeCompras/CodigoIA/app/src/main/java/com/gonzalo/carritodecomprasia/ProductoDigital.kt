package com.gonzalo.carritodecomprasia

/**
 * Clase ProductoDigital.
 * Aplica el concepto de HERENCIA al extender de la clase base Producto.
 * Además, añade su propia característica específica: tipoArchivo.
 */
class ProductoDigital(nombre: String, precio: Double, val tipoArchivo: String) : Producto(nombre, precio) {

    override fun mostrarInformacion() {
        // Hereda nombre y el método getPrecio() de la clase Producto.
        println("Producto Digital: $nombre - Precio: S/ ${getPrecio()} - Formato: $tipoArchivo")
    }
}
