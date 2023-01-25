package com.oyaness.cookbook.menu.categories

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.oyaness.cookbook.menu.R
import com.oyaness.cookbook.menu.categories.model.Category

/**
 * @author Oya
 * @date 25.1.2023
 */

@Composable
internal fun CategoriesContent(
    modifier: Modifier = Modifier,
    categories: List<Category>
) {
    Column(modifier = modifier.fillMaxWidth()) {
        for (category in categories) {
            CategoryItemContent(modifier = modifier, category = category)
        }
    }
}

@Composable
internal fun CategoryItemContent(modifier: Modifier, category: Category) {
    Box() {

        Image(painter = painterResource(id = category.image), contentDescription = category.name,
            modifier = Modifier
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
        Text(
            category.name,
            color = Color.White,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomStart)
                .padding(24.dp)
        )
    }
}

@Preview(heightDp = 800)
@Composable
internal fun CategoriesContentPreview() {
    CategoriesContent(
        categories = listOf(
            Category(1, R.drawable.bread, "Bread"),
            Category(2, R.drawable.meat, "Meat"),
            Category(3, R.drawable.desert, "Desert"),
            Category(4, R.drawable.salad, "Salad")
        )
    )
}