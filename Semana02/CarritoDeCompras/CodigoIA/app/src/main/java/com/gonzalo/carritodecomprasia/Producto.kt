package com.gonzalo.carritodecomprasia

/**
 * Clase abstracta Producto.
 * En este avance implementamos ENCAPSULAMIENTO.
 */
abstract class Producto(val nombre: String, precioInicial: Double) {

    // PROPIEDAD PRIVADA: No es accesible directamente desde fuera de esta clase.
    private var precio: Double = if (precioInicial >= 0) precioInicial else 0.0

    // MÉTODO PÚBLICO (Getter): Permite consultar el precio de forma controlada.
    fun getPrecio(): Double {
        return precio
    }

    // MÉTODO PÚBLICO (Setter): Permite modificar el precio aplicando validación.
    fun setPrecio(nuevoPrecio: Double) {
        if (nuevoPrecio >= 0) {
            precio = nuevoPrecio
        } else {
            println("Error: El precio de '$nombre' no puede ser negativo ($nuevoPrecio).")
        }
    }

    abstract fun mostrarInformacion()
}
