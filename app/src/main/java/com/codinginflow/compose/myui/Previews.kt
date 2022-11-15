package com.codinginflow.compose.myui

import android.content.res.Configuration.UI_MODE_NIGHT_NO
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Preview(
    name = "Small Font",
    group = "Small Font Group",
    fontScale = 0.5f,
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "Normal Font",
    group = "Normal Font Group",
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Preview(
    name = "Normal Font",
    group = "Normal Font Group",
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "Large Font",
    group = "Large Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_NO,
    showBackground = true
)
@Preview(
    name = "Large Font",
    group = "Large Font Group",
    fontScale = 1.5f,
    uiMode = UI_MODE_NIGHT_YES,
    showBackground = true
)
@Preview(
    name = "PIXEL 2",
    group = "Devices",
    device = Devices.PIXEL_XL,
    showSystemUi = true
)
@Preview(
    name = "PIXEL 3",
    group = "Devices",
    device = Devices.PIXEL_3,
    showSystemUi = true
)
@Preview(
    name = "PIXEL 4",
    group = "Devices",
    device = Devices.PIXEL_4,
    showSystemUi = true
)
@Preview(
    name = "PIXEL XL",
    group = "Devices",
    device = Devices.PIXEL_XL,
    showSystemUi = true
)
@Preview(
    name = "PIXEL C",
    group = "Devices",
    device = Devices.PIXEL_C,
    showSystemUi = true
)
annotation class FontScalePreviews