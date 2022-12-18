package com.oyaness.cookbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.oyaness.cookbook.common_ui.base.BaseInjectionActivity
import com.oyaness.cookbook.menu.api.navigation.MenuNavigator
import javax.inject.Inject

class MainActivity : BaseInjectionActivity() {

    @Inject
    lateinit var navigator: MenuNavigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navigator.goToMenu(this)
    }

    private fun addRecipe(recipe: String = "recipe") {
//        asd.addRecipe(
//            Recipe(
//                id = null,
//                title = "title",
//                Category(id = 1, name = "category", image = null),
//                steps = listOf("step1", "step2"),
//                ingredients = listOf(Ingredient("ingredient", Quantity(2.0,"tbsp"))),
//                author = "author",
//                image = "image",
//                servings = 2,
//                relatedRecipes = listOf(RelatedRecipe("related", "description"))
//            )
//        )
    }
}