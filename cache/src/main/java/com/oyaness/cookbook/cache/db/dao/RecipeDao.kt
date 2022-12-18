package com.oyaness.cookbook.cache.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.oyaness.cookbook.cache.db.entity.RecipeEntity

/**
 * @author Oya
 * @date 29.12.2021
 */
@Dao
internal interface RecipeDao : CookbookDao<RecipeEntity> {

    @Query("SELECT * FROM recipes")
    suspend fun getAll(): List<RecipeEntity>

    @Insert
    suspend fun insertRecipe(recipe: RecipeEntity)

    @Delete
    suspend fun deleteRecipe(recipe: RecipeEntity)

    @Query("DELETE FROM recipes")
    suspend fun deleteAll()

    @Query("DELETE FROM recipes WHERE id = :id")
    suspend fun deleteRecipeWithId(id: Long)
}