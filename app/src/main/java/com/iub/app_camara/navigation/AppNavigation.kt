package com.iub.app_camara.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iub.app_camara.screens.CameraScreen
import com.iub.app_camara.screens.GalleryScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "camera") {

        // Ruta 1: Cámara
        composable("camera") {
            CameraScreen(
                onNavigateToGallery = {
                    navController.navigate("gallery")
                }
            )
        }

        // Ruta 2: Galería
        composable("gallery") {
            GalleryScreen(
                onNavigateBack = {
                    navController.popBackStack() // Volver atrás
                }
            )
        }
    }
}