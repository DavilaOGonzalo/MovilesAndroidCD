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

        // --- Ejemplo de Abstracción ---
        val laptop = ProductoFisico("Laptop Gaming", 2500.0)
        val mouse = ProductoFisico("Mouse Inalámbrico", 50.0)

        // Llamada a los métodos implementados
        laptop.mostrarInformacion()
        mouse.mostrarInformacion()
        
        // --- Ejemplo de Encapsulamiento ---
        println("--- Prueba de Encapsulamiento ---")
        
        // Consultamos el precio usando el getter
        println("Precio actual del mouse: S/ ${mouse.getPrecio()}")
        
        // Intentamos cambiar el precio a un valor válido
        mouse.setPrecio(45.0)
        println("Precio modificado del mouse: S/ ${mouse.getPrecio()}")
        
        // Intentamos cambiar el precio a un valor negativo (inválido)
        mouse.setPrecio(-10.0)
        println("Precio final del mouse tras error: S/ ${mouse.getPrecio()}")

        // --- Ejemplo de Herencia ---
        println("--- Prueba de Herencia ---")

        // Creamos un ProductoDigital, que hereda de Producto
        val cursoAndroid = ProductoDigital("Curso Kotlin desde Cero", 99.9, "Video MP4")
        val ebook = ProductoDigital("Guía POO en Kotlin", 25.0, "PDF")

        // Ambos productos pueden usar mostrarInformacion() pero cada uno a su manera
        cursoAndroid.mostrarInformacion()
        ebook.mostrarInformacion()

        // Demostramos que ProductoDigital también heredó el encapsulamiento del precio
        println("Precio del eBook (heredado): S/ ${ebook.getPrecio()}")
        // ------------------------------

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