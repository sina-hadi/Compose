package com.codinginflow.compose.swipe

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.codinginflow.compose.R
import com.codinginflow.compose.ui.theme.DarkGreen
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

@Composable
fun SwipeItem2() {
    val archive = SwipeAction(
        onSwipe = {
            Log.e("ABCD", "Archive")
        },
        icon = {
            Icon(
                modifier = Modifier.padding(16.dp),
                painter = painterResource(id = R.drawable.ic_archive),
                contentDescription = null,
                tint = Color.White
            )
        },
        background = DarkGreen
    )

    val email = SwipeAction(
        onSwipe = {
            Log.e("ABCD", "Email")
        },
        icon = {
            Icon(
                modifier = Modifier.padding(16.dp),
                painter = painterResource(id = R.drawable.ic_email),
                contentDescription = null,
                tint = Color.White
            )
        },
        background = Color.Blue
    )

    SwipeableActionsBox(
        swipeThreshold = 150.dp,
        startActions = listOf(archive),
        endActions = listOf(email)
    ) {
        Row(
            modifier = Modifier
                .background(MaterialTheme.colors.surface)
                .padding(horizontal = 16.dp)
                .padding(vertical = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(size = 50.dp))
                    .background(MaterialTheme.colors.primary)
                    .size(50.dp)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column(modifier = Modifier.weight(7f)) {
                Text(
                    text = "Title", style = TextStyle(
                        fontSize = MaterialTheme.typography.h5.fontSize,
                        fontWeight = FontWeight.Bold
                    )
                )
                Text(text = "Some Random Text.")
            }
        }
    }
}