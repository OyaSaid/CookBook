package com.oyaness.cookbook.menu

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import com.oyaness.cookbook.common_ui.base.BaseInjectionActivity
import com.oyaness.cookbook.menu.categories.CategoriesContent
import com.oyaness.cookbook.menu.categories.model.Category

/**
 * @author Oya
 * @date 17.12.2022
 */
class MenuActivity : BaseInjectionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("oja", "menu")

         setContent {
            CategoriesContent(
                categories = listOf(
                    Category(1, R.drawable.bread, "Bread"),
                    Category(1, R.drawable.meat, "Meat"),
                    Category(1, R.drawable.desert, "Desert"),
                    Category(1, R.drawable.salad, "Salad")
                )
            )
////            NavigationHost(rememberNavController())
        }
    }
}