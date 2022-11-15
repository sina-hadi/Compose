package com.codinginflow.compose.navigation.nav_graph

import androidx.navigation.*
import androidx.navigation.compose.composable
import com.codinginflow.compose.navigation.Constant
import com.codinginflow.compose.navigation.Constant.Companion.HOME_GRAPH_ROUTE
import com.codinginflow.compose.navigation.screen.DetailsScreen2
import com.codinginflow.compose.navigation.screen.HomeScreen2
import com.codinginflow.compose.navigation.Screen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
) {
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_GRAPH_ROUTE
    ) {
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen2(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(Constant.DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(Constant.DETAIL_ARGUMENT_KEY2) {
                    type = NavType.StringType
                }
            )
        ) {
            DetailsScreen2(navController)
        }
    }
}