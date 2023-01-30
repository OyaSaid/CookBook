package com.oyaness.cookbook.common_ui.composable.style

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


/**
 * @author Oya
 * @date 26.1.2023
 */

@Composable
fun CategoryHeader(text: String, modifier: Modifier = Modifier) {
    Text(
        text,
        style = HeaderStyle,
        modifier = modifier
            .padding(24.dp)
    )
}

val HeaderStyle = TextStyle(
    color = Color.White,
    fontSize = 28.sp,
    fontWeight= FontWeight.W800,
    fontFamily = FontFamily.Serif,
    letterSpacing = 10.sp,
    textAlign = TextAlign.Start,
    shadow = Shadow(
        color = Color.Black,
        offset = Offset(8f, 8f),
        blurRadius = 4f
    )
)
