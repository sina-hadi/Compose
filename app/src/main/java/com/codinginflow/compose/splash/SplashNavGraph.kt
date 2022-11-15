package com.codinginflow.compose.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SplashSetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = SplashScreen.Splash.route
    ) {
        composable(route = SplashScreen.Splash.route) {
            AnimatedSplashScreen(navController = navController)
        }
        composable(route = SplashScreen.Home.route) {
            Box(modifier = Modifier.fillMaxSize())
        }
    }
}