package com.oyaness.cookbook.cache.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.oyaness.cookbook.cache.db.entity.IngredientEntity
import java.util.*

/**
 * @author Oya
 * @date 29.12.2021
 */
internal class IngredientEntityConverter {
    private var gson = Gson()

    @TypeConverter
    fun stringToList(data: String?): List<IngredientEntity>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType = object : TypeToken<List<IngredientEntity>>() {}.type
        return gson.fromJson<List<IngredientEntity>>(data, listType)
    }

    @TypeConverter
    fun listToString(ingredientList: List<IngredientEntity>?): String? =
        gson.toJson(ingredientList)
}