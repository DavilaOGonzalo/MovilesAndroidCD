package com.gonzalo.carritodecompras

class Carrito {

    val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun eliminarProducto(posicion: Int) {
        if (posicion >= 0 && posicion < productos.size) {
            productos.removeAt(posicion)
        }
    }

    fun mostrarCarrito() {
        println("===== CARRITO =====")

        for (producto in productos) {
            println("${producto.nombre} - S/${producto.precio}")
        }
    }

    fun calcularTotal(): Double {
        var total = 0.0

        for (producto in productos) {
            total += producto.precio
        }

        return total
    }
}