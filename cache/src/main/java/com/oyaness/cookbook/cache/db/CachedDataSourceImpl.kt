package com.oyaness.cookbook.cache.db

import com.oyaness.cookbook.cache.db.mapper.RecipeMapper
import com.oyaness.cookbook.data.model.Recipe
import com.oyaness.cookbook.data.source.CachedDataSource

/**
 * @author Oya
 * @date 01.1.2022
 *
 * Cached implementation for retrieving and saving Recipe instances. This class implements the
 * [CachedDataSource] from the Data layer as it is that layers responsibility for defining the
 * operations in which data store implementation layers can carry out.
 */
internal class CachedDataSourceImpl(
    private val database: CookbookDatabase,
    private val mapper: RecipeMapper
) : CachedDataSource {
    override suspend fun getFavoriteRecipes(): List<Recipe> =
        database.recipeDao().getAll().map { mapper.mapFromEntity(it) }

    override suspend fun addFavRecipe(recipe: Recipe) =
        database.recipeDao().insertRecipe(mapper.mapToEntity(recipe))

    override suspend fun removeFavRecipe(recipe: Recipe) =
        database.recipeDao().deleteRecipe(mapper.mapToEntity(recipe))
}