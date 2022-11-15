package com.codinginflow.compose.blur

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.unit.dp

@Composable
fun BlurScreen() {
    var checked by remember { mutableStateOf(true) }
    val animatedBlur by animateDpAsState(targetValue = if (checked) 10.dp else 0.dp)

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            modifier = Modifier.blur(
                radius = animatedBlur,
                edgeTreatment = BlurredEdgeTreatment.Unbounded
            ),
            text = "Hello world!",
            fontSize = MaterialTheme.typography.displayLarge.fontSize
        )
        Spacer(modifier = Modifier.height(24.dp))
        Switch(checked = checked, onCheckedChange = { checked = !checked })
    }
}