package com.oyaness.cookbook.cache.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.oyaness.cookbook.cache.db.entity.RelatedRecipeEntity
import java.util.*

/**
 * @author Oya
 * @date 10.1.2022
 */
internal class RelatedRecipeEntityConverter {
    private var gson = Gson()

    @TypeConverter
    fun stringToList(data: String?): List<RelatedRecipeEntity>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType = object : TypeToken<List<RelatedRecipeEntityConverter>>() {}.type
        return gson.fromJson<List<RelatedRecipeEntity>>(data, listType)
    }

    @TypeConverter
    fun listToString(recipeList: List<RelatedRecipeEntity>?): String? =
        gson.toJson(recipeList)
}