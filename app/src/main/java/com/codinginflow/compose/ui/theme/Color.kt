package com.codinginflow.compose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)
val DarkGreen = Color(0xFF139E41)
val DarkBlue = Color(0xFF0D2E91)

val Colors.backgroundColor
    get() = if (isLight) Purple200 else Purple700