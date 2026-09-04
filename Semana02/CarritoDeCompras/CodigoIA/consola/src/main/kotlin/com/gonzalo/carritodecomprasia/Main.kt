package com.gonzalo.carritodecomprasia

fun main() {
    // ==========================================================
    // EJECUCIÓN FINAL - CARRITO DE COMPRAS POO (CONSOLA)
    // ==========================================================

    println("=== INICIO DE LA DEMOSTRACION FINAL (MODO CONSOLA) ===")

    // 1. Creacion de productos (Abstraccion y Herencia)
    println("\n1. Creando productos disponibles...")
    val laptop = ProductoFisico("Laptop Gaming", 2500.0)
    val mouse = ProductoFisico("Mouse Inalambrico", 50.0)
    val cursoAndroid = ProductoDigital("Curso Kotlin desde Cero", 99.9, "Video MP4")
    val ebook = ProductoDigital("Guia POO en Kotlin", 25.0, "PDF")

    // 2. Mostrar diferentes tipos de productos (Polimorfismo)
    println("\n2. Tipos de productos en inventario:")
    val inventario = listOf(laptop, mouse, cursoAndroid, ebook)
    for (prod in inventario) {
        prod.mostrarInformacion()
    }

    // 3. Prueba de Encapsulamiento y Validacion
    println("\n3. Ajustando precios (Encapsulamiento):")
    mouse.setPrecio(45.0) // Cambio valido
    ebook.setPrecio(-5.0)  // Cambio invalido (debe mostrar error)
    println("Precio final del ebook: S/ ${ebook.getPrecio()}")

    // 4. Gestion del Carrito (Uso integral de POO)
    println("\n4. Agregando productos al carrito...")
    val miCarrito = Carrito()
    miCarrito.agregarProducto(laptop)
    miCarrito.agregarProducto(cursoAndroid)
    miCarrito.agregarProducto(mouse)

    // 5. Contenido final y Total
    miCarrito.mostrarCarrito()
    val total = miCarrito.calcularTotal()
    println("-----------------------------------")
    println("TOTAL FINAL A PAGAR: S/ $total")
    println("-----------------------------------")

    println("\n=== FIN DE LA DEMOSTRACIÓN ===")
}
