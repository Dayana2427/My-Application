package com.example.myapplication.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.screens.PantallaDetalle
import com.example.myapplication.screens.PantallaInicio

@Composable
fun NavGraph(
    navController: NavHostController,
    padding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = "PantallaInicio",
        modifier = Modifier.padding(padding)
    ) {
        composable("PantallaInicio") {
            PantallaInicio(navController)
        }

        composable("pantallaDetalle") {
            PantallaDetalle()
        }
    }
}