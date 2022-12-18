package com.oyaness.cookbook.cache.file

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.oyaness.cookbook.cache.file.CategoryFileEntity
import com.oyaness.cookbook.cache.file.AssetsManager
import com.oyaness.cookbook.data.model.Category
import com.oyaness.cookbook.data.source.FileDataSource
import java.io.IOException

/**
 * @author Oya
 * @date 01.1.2022
 *
 * Implementation for retrieving Category instances. This class implements the
 * [FileDataSource] from the Data layer as it is that layers responsibility for defining the
 * operations in which data store implementation layers can carry out.
 */
internal class FileDataSourceImpl(
    private val gson: Gson,
    private val assetsManager: AssetsManager
) : FileDataSource {
    override suspend fun getCategories(): List<Category> = try {
        val jsonString = assetsManager.getJsonDataFromAsset("categories.json")
        val listType = object : TypeToken<List<CategoryFileEntity>>() {}.type
        gson.fromJson(jsonString, listType)
    } catch (ex: IOException) {
        ex.printStackTrace()
        emptyList()
    }
}