package com.codinginflow.compose.splash

sealed class SplashScreen (val route: String) {
    object Splash: SplashScreen("splash_screen")
    object Home: SplashScreen("home_screen")
}