package com.codinginflow.compose.myui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NewBox() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Color.White
            ),
        contentAlignment = Alignment.TopCenter
    ) {
        Box(
            modifier = Modifier
                .background(MaterialTheme.colors.primary)
                .width(300.dp)
                .height(300.dp)
                .verticalScroll(rememberScrollState())
        ) {
            SelectionContainer(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = stringResource(id = com.codinginflow.compose.R.string.app_name),
                    fontSize = 40.sp,
                    color = Color.White
                )
            }
        }
    }
}