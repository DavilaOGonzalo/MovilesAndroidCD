package com.gonzalo.carritodecomprasia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalo.carritodecomprasia.ui.theme.CarritoDeComprasIATheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // ==========================================================
        // EJECUCIÓN FINAL - CARRITO DE COMPRAS POO
        // ==========================================================

        println("=== INICIO DE LA DEMOSTRACIÓN FINAL ===")

        // 1. Creación de productos (Abstracción y Herencia)
        println("\n1. Creando productos disponibles...")
        val laptop = ProductoFisico("Laptop Gaming", 2500.0)
        val mouse = ProductoFisico("Mouse Inalámbrico", 50.0)
        val cursoAndroid = ProductoDigital("Curso Kotlin desde Cero", 99.9, "Video MP4")
        val ebook = ProductoDigital("Guía POO en Kotlin", 25.0, "PDF")

        // 2. Mostrar diferentes tipos de productos (Polimorfismo)
        println("\n2. Tipos de productos en inventario:")
        val inventario = listOf(laptop, mouse, cursoAndroid, ebook)
        for (prod in inventario) {
            prod.mostrarInformacion()
        }

        // 3. Prueba de Encapsulamiento y Validación
        println("\n3. Ajustando precios (Encapsulamiento):")
        mouse.setPrecio(45.0) // Cambio válido
        ebook.setPrecio(-5.0)  // Cambio inválido (debería mostrar error)
        println("Precio final del ebook: S/ ${ebook.getPrecio()}")

        // 4. Gestión del Carrito (Uso integral de POO)
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

        setContent {
            CarritoDeComprasIATheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarritoDeComprasIATheme {
        Greeting("Android")
    }
}