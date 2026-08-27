package com.gonzalo.carritodecompras

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
import com.gonzalo.carritodecompras.ui.theme.CarritoDeComprasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        println("===== PRODUCTOS =====")

        for (i in productos.indices) {
            println("${i + 1}. ${productos[i].nombre} - S/${productos[i].precio}")
        }

        val carrito = Carrito()

        carrito.agregarProducto(productos[0])
        carrito.agregarProducto(productos[3])

        carrito.mostrarCarrito()

        enableEdgeToEdge()
        setContent {
            CarritoDeComprasTheme {
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
    CarritoDeComprasTheme {
        Greeting("Android")
    }
}