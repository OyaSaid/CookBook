package com.oyaness.cookbook.data.source

import com.oyaness.cookbook.data.model.Recipe

/**
 * @author Oya
 * @date 01.1.2022
 */
interface CachedDataSource {
    suspend fun getFavoriteRecipes(): List<Recipe>
    suspend fun addFavRecipe(recipe: Recipe)
    suspend fun removeFavRecipe(recipe: Recipe)
}