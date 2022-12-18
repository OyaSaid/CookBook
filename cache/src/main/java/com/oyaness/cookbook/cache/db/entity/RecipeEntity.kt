package com.oyaness.cookbook.cache.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverters
import com.oyaness.cookbook.cache.db.converter.CategoryEntityConverter
import com.oyaness.cookbook.cache.db.converter.IngredientEntityConverter
import com.oyaness.cookbook.cache.db.converter.RelatedRecipeEntityConverter

/**
 * @author Oya
 * @date 29.12.2021
 *
 * Model used for caching recipes
 */
@Entity(tableName = "recipes")
internal data class RecipeEntity(
    @PrimaryKey val id: String,
    val title: String,
    @TypeConverters(CategoryEntityConverter::class)
    val category: CategoryEntity,
    val steps: List<String>,
    @TypeConverters(IngredientEntityConverter::class)
    val ingredients: List<IngredientEntity>,
    val author: String?,
    val image: String?,
    val servings: Int?,
    @TypeConverters(RelatedRecipeEntityConverter::class)
    val relatedRecipes: List<RelatedRecipeEntity>
) : CookbookEntity

internal data class CategoryEntity(val id: Int, val name: String)

internal data class IngredientEntity(
    val name: String,
    val quantity: QuantityEntity,
    val comment: String?
)

internal data class QuantityEntity(val number: Double, val type: String?)

internal data class RelatedRecipeEntity(val id: String, val description: String)

