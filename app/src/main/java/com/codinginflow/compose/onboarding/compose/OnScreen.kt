package com.codinginflow.compose.onboarding.compose

sealed class OnScreen(val route: String) {
    object Welcome : OnScreen(route = "welcome_screen")
    object OnHome : OnScreen(route = "on_home_screen")
}