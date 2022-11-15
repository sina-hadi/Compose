package com.codinginflow.compose.navigation.nav_graph

import android.util.Log
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.codinginflow.compose.navigation.Constant
import com.codinginflow.compose.navigation.Person
import com.codinginflow.compose.navigation.screen.LoginScreen2
import com.codinginflow.compose.navigation.Screen
import com.codinginflow.compose.navigation.screen.SignUpScreen2

fun NavGraphBuilder.authNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Login.route,
        route = Constant.AUTH_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen2(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            LaunchedEffect(key1 = it) {
                val result =
                    navController.previousBackStackEntry?.savedStateHandle?.get<Person>("person")
                Log.e("ABCD", "${result?.firstName}")
                Log.e("ABCD", "${result?.lastName}")
            }
            SignUpScreen2(navController = navController)
        }
    }
}