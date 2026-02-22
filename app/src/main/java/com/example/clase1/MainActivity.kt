package com.example.clase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clase1.composables.ListaCompras
import com.example.clase1.composables.contadorCafe
import com.example.clase1.ui.theme.Clase1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Clase1Theme {
                ListaCompras()
                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Button({}) {
        Icon(imageVector = Icons.Filled.Favorite, contentDescription ="")
        Text(
            text = "Hello $name!",
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Clase1Theme {
        Greeting("Eder")
    }
}