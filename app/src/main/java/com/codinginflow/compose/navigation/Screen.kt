package com.codinginflow.compose.navigation

import com.codinginflow.compose.navigation.Constant.Companion.DETAIL_ARGUMENT_KEY
import com.codinginflow.compose.navigation.Constant.Companion.DETAIL_ARGUMENT_KEY2

sealed class Screen(val route: String) {
    object Home : Screen(
        route = "home_screen"
    )

    object Detail : Screen(
        route = "detail_screen?id={$DETAIL_ARGUMENT_KEY}&name={$DETAIL_ARGUMENT_KEY2}"
    ) {
        fun passNameAndId(
            id: Int = 0,
            name: String = "Sina Hadi"
        ): String {
            return "detail_screen?id=$id&name=$name"
        }
    }

    object Login : Screen(route = "login_screen")
    object SignUp : Screen(route = "sign_up_screen")
}
