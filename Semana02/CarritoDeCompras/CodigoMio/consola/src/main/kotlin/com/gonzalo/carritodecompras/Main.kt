package com.gonzalo.carritodecompras

fun main() {
    println("===== PRODUCTOS =====")

    for (i in productos.indices) {
        println("${i + 1}. ${productos[i].nombre} - S/${productos[i].precio}")
    }

    val carrito = Carrito()

    carrito.agregarProducto(productos[0])
    carrito.agregarProducto(productos[3])

    carrito.eliminarProducto(0)

    carrito.mostrarCarrito()

    println("TOTAL: S/${carrito.calcularTotal()}")
}
