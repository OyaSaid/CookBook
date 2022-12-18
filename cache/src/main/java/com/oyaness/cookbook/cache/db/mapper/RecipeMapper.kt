package com.oyaness.cookbook.cache.db.mapper

import com.oyaness.cookbook.cache.db.entity.*
import com.oyaness.cookbook.data.model.*

/**
 * @author Oya
 * @date 01.1.2022
 */
internal class RecipeMapper : DBEntityMapper<RecipeEntity, Recipe> {
    override fun mapToEntity(model: Recipe): RecipeEntity =
        RecipeEntity(
            id = model.id ?: "",
            title = model.title,
            category = model.category.mapCategoryEntity(),
            steps = model.steps,
            ingredients = model.ingredients.map { it.mapIngredientEntity() },
            author = model.author,
            image = model.image,
            servings = model.servings,
            relatedRecipes = model.relatedRecipes.map { it.mapRelatedRecipeEntity() }
        )

    override fun mapFromEntity(entity: RecipeEntity): Recipe =
        Recipe(
            id = entity.id,
            title = entity.title,
            category = entity.category.mapCategory(),
            steps = entity.steps,
            ingredients = entity.ingredients.map { it.mapIngredient() },
            author = entity.author,
            image = entity.image,
            servings = entity.servings,
            relatedRecipes = entity.relatedRecipes.map { it.mapRelatedRecipe() }
        )

    private fun Category.mapCategoryEntity(): CategoryEntity =
        CategoryEntity(
            id = id,
            name = name
        )

    private fun CategoryEntity.mapCategory(): Category = Category(
        id = id,
        name = name,
        image = null
    )

    private fun Ingredient.mapIngredientEntity(): IngredientEntity = IngredientEntity(
        name = name,
        quantity = QuantityEntity(number = quantity.number, type = quantity.type),
        comment = comment
    )

    private fun IngredientEntity.mapIngredient(): Ingredient = Ingredient(
        name = name,
        quantity = Quantity(number = quantity.number, type = quantity.type),
        comment = comment
    )

    private fun RelatedRecipe.mapRelatedRecipeEntity(): RelatedRecipeEntity = RelatedRecipeEntity(
        id = id,
        description = description
    )

    private fun RelatedRecipeEntity.mapRelatedRecipe(): RelatedRecipe = RelatedRecipe(
        id = id,
        description = description
    )
}