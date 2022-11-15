package com.codinginflow.compose.navigation.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codinginflow.compose.navigation.Person
import com.codinginflow.compose.navigation.Screen

@Composable
fun LoginScreen2(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier
                .clickable {
                    // Can done with viewmodel as well
                    val person = Person(firstName = "John", lastName = "Doa")
                    navController.currentBackStackEntry?.savedStateHandle?.set(
                        key = "person",
                        value = person
                    )
                    navController.navigate(route = Screen.SignUp.route)
                },
            text = "Login",
            color = Color.Magenta,
            fontSize = MaterialTheme.typography.h3.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            modifier = Modifier
                .padding(top = 150.dp)
                .clickable {
                    navController.popBackStack()
                    navController.navigate(Screen.Detail.passNameAndId())
                },
            text = "Open Detail Screen",
            fontSize = MaterialTheme.typography.h6.fontSize,
            fontWeight = FontWeight.Medium
        )
    }
}