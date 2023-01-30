package com.oyaness.cookbook.menu.categories

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.oyaness.cookbook.common_ui.composable.style.CategoryHeader
import com.oyaness.cookbook.menu.categories.model.Category

/**
 * @author Oya
 * @date 28.1.2023
 */
@Composable
internal fun CategoryItem(modifier: Modifier, category: Category) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(painter = painterResource(id = category.image),
            contentDescription = category.name,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(30.dp))
                .drawWithCache {
                    val gradient = Brush.verticalGradient(
                        colors = listOf(Color.Transparent, Color.Black),
                        startY = size.height / 4,
                        endY = size.height
                    )
                    onDrawWithContent {
                        drawContent()
                        drawRect(gradient, blendMode = BlendMode.Multiply)
                    }
                })
        CategoryHeader(
            text = category.name,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
        )
    }
}