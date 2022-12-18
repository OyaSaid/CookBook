package com.oyaness.cookbook.data.repository

import com.oyaness.cookbook.data.model.Category
import com.oyaness.cookbook.data.model.Recipe
import com.oyaness.cookbook.data.source.CachedDataSource
import com.oyaness.cookbook.data.source.FileDataSource
import com.oyaness.cookbook.data.source.RemoteDataSource

/**
 * @author Oya
 * @date 01.1.2022
 */
class CookbookRepository(
    private val cachedDataSource: CachedDataSource,
    private val fileDataSource: FileDataSource,
    private val remoteDataSource: RemoteDataSource
) {
    suspend fun getCategories(): List<Category> = fileDataSource.getCategories()

    suspend fun getFavouriteRecipes(): List<Recipe> = cachedDataSource.getFavoriteRecipes()
}