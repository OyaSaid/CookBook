package com.oyaness.cookbook.menu.categories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
            CategoryItem(modifier = modifier, category = category)
        }
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
