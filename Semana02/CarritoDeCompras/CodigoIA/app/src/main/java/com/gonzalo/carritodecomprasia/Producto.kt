package com.gonzalo.carritodecomprasia

/**
 * Clase abstracta que representa un Producto genérico.
 * Aplica el concepto de ABSTRACCIÓN al definir características comunes
 * pero dejar el comportamiento de 'mostrarInformacion' para las subclases.
 */
abstract class Producto(val nombre: String, val precio: Double) {
    // Método abstracto: define QUÉ debe hacer, pero no CÓMO.
    abstract fun mostrarInformacion()
}
