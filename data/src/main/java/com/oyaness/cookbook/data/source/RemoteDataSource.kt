package com.oyaness.cookbook.data.source

import com.oyaness.cookbook.data.model.Recipe

/**
 * @author Oya
 * @date 01.1.2022
 */
interface RemoteDataSource {
    fun addRecipe(recipe: Recipe)
}