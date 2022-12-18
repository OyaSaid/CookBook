package com.oyaness.cookbook.data.model

/**
 * @author Oya
 * @date 01.1.2022
 */
data class Recipe(
    var id: String? = null,
    val title: String,
    val category: Category,
    val steps: List<String>,
    val ingredients: List<Ingredient>,
    val author: String? = null,
    val image: String? = null,
    val servings: Int? = null,
    val relatedRecipes: List<RelatedRecipe>
)


data class Ingredient(val name: String, val quantity: Quantity, val comment: String?)

data class Quantity(val number: Double, val type: String? = null)

data class RelatedRecipe(val id: String, val description: String)