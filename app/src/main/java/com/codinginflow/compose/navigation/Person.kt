package com.codinginflow.compose.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    val firstName: String,
    val lastName: String
) : Parcelable