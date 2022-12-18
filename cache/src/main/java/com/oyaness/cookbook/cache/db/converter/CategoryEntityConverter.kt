package com.oyaness.cookbook.cache.db.converter

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.oyaness.cookbook.cache.db.entity.CategoryEntity

/**
 * @author Oya
 * @date 29.12.2021
 */
internal class CategoryEntityConverter {
    private var gson = Gson()

    @TypeConverter
    fun stringToEntity(data: String?): CategoryEntity? {
        if (data == null) {
            return null
        }
        val category = object : TypeToken<CategoryEntity>() {}.type
        return gson.fromJson<CategoryEntity>(data, category)
    }

    @TypeConverter
    fun categoryToString(categoryEntity: CategoryEntity?): String? =
        gson.toJson(categoryEntity)

}