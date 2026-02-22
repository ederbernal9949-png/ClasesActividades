package com.example.clase1.composables
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clase1.R

@Composable
fun imagentarea() {

    var gender by remember { mutableStateOf("Boy") }
    var age by remember { mutableStateOf(5f) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Create Profile",
            style = MaterialTheme.typography.titleLarge,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { gender = "Boy" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (gender == "Boy") Color(0xFF4CAF50) else Color.LightGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Boy")
            }

            Spacer(modifier = Modifier.width(10.dp))

            Button(
                onClick = { gender = "Girl" },
                colors = ButtonDefaults.buttonColors(
                    containerColor = if (gender == "Girl") Color(0xFFE91E63) else Color.LightGray
                ),
                shape = RoundedCornerShape(20.dp)
            ) {
                Text("Girl")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = R.drawable.foto_perfil),
            contentDescription = "Imagen de Perfil",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(180.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Your Age: ${age.toInt()}",
            style = MaterialTheme.typography.titleMedium
        )


        Slider(
            value = age,
            onValueChange = { age = it },
            valueRange = 3f..8f,
            steps = 4,
            modifier = Modifier.padding(horizontal = 20.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(
            onClick = {
                println("Guardado: $gender - Edad ${age.toInt()}")
            },
            modifier = Modifier
                .fillMaxWidth(0.7f)
                .height(50.dp),
            shape = RoundedCornerShape(25.dp)
        ) {
            Text("Save")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun imagentareaPreview() {
    imagentarea()
}