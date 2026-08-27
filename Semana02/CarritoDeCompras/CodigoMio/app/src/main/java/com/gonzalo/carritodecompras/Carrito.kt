package com.gonzalo.carritodecompras

class Carrito {

    val productos = mutableListOf<Producto>()

    fun agregarProducto(producto: Producto) {
        productos.add(producto)
    }

    fun mostrarCarrito() {
        println("===== CARRITO =====")

        for (producto in productos) {
            println("${producto.nombre} - S/${producto.precio}")
        }
    }
}