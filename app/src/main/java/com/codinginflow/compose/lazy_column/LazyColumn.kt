package com.codinginflow.compose.lazy_column

import CustomItem
import PersonRepository
import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SetLazyColumn() {
    val getAllData = PersonRepository().getAllData()
    LazyColumn(
        contentPadding = PaddingValues(all = 12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        itemsIndexed(
            items = getAllData,
            key = { _, person -> person.id }
        ) { index, person ->
            CustomItem(person = person) {
                Log.e("ABCD", it + index)
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SetStickyLazyColumn() {
    val sections = listOf("A", "B", "C", "D", "E", "F", "G")

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp), text = "Section $section"
                )
            }
            items(10) {
                Text(
                    modifier = Modifier.padding(12.dp),
                    text = "Item $it from the section $section"
                )
            }
        }
    }
}