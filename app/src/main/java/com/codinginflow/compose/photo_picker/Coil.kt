package com.codinginflow.compose.photo_picker

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.codinginflow.compose.R

@Composable
fun CoilImage(){
    Box(
        modifier = Modifier
            .height(300.dp)
            .width(300.dp),
        contentAlignment = Alignment.Center
    ) {
        val matrix = ColorMatrix()
        matrix.setToSaturation(0.5F)

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data("https://avatars.githubusercontent.com/u/14994036?v=4")
                .crossfade(500)
                .build(),
            placeholder = painterResource(id = R.drawable.loading_placeholder),
            error = painterResource(id = R.drawable.error_placeholder),
            contentDescription = stringResource(R.string.app_name),
            contentScale = ContentScale.Crop,
            modifier = Modifier.clip(RectangleShape),
            colorFilter = ColorFilter.colorMatrix(matrix)
        )
    }
}