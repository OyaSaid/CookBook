package com.oyaness.cookbook.network

import com.google.firebase.database.FirebaseDatabase
import com.oyaness.cookbook.data.model.Recipe
import com.oyaness.cookbook.data.source.RemoteDataSource
import timber.log.Timber

/**
 * @author Oya
 * @date 10.1.2022
 */
class RemoteDataSourceImpl(private val database: FirebaseDatabase) : RemoteDataSource {

    override fun addRecipe(recipe: Recipe) {
       val recipeRef = database.getReference("recipes")
        val key = recipeRef.push().key
        if (key == null) {
            Timber.w("Couldn't get push key for posts")
            return
        }
        recipeRef.child(key).setValue(recipe)
    }
}