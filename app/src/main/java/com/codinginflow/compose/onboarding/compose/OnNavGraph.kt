package com.codinginflow.compose.onboarding.compose

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun OnNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = OnScreen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = OnScreen.OnHome.route) {
            OnHomeScreen()
        }
    }
}