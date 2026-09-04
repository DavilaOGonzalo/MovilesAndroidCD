package com.gonzalo.carritodecomprasia

/**
 * Clase ProductoFisico.
 * Implementa el método abstracto usando los mecanismos de la superclase.
 */
class ProductoFisico(nombre: String, precio: Double) : Producto(nombre, precio) {

    override fun mostrarInformacion() {
        // Accedemos al precio mediante el metodo publico getPrecio() 
        // debido a que la propiedad 'precio' en la clase base es privada.
        println("Producto Fisico: $nombre - Precio: S/ ${getPrecio()}")
    }
}
