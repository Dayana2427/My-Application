package com.example.myapplication

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

// @Composable indica que esta función crea un componente visual en Jetpack Compose
@Composable
fun MiTextoReutilizable (

    // Parámetro obligatorio: el texto que se va a mostrar
    text: String,

    // Tamaño de la fuente (valor por defecto: 20.sp)
    // sp significa "scale-independent pixels", usado para texto
    fontSize: TextUnit = 20.sp,

    // Grosor del texto (por defecto: Thin = delgado)
    fontWeight: FontWeight = FontWeight.Thin,

    // Tipo de fuente (por defecto: Serif)
    fontFamily: FontFamily = FontFamily.Serif,

    // Color del texto (por defecto: el color primario del tema actual)
    color: Color = MaterialTheme.colorScheme.primary
) {

    // Composable Text que muestra el texto en pantalla
    Text(

        // Texto que se va a renderizar
        text = text,

        // Tamaño del texto
        fontSize = fontSize,

        // Grosor del texto
        fontWeight = fontWeight,

        // Tipo de fuente
        fontFamily = fontFamily,

        // Color del texto
        color = color
    )
}