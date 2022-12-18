package com.oyaness.cookbook.data.source

import com.oyaness.cookbook.data.model.Category

/**
 * @author Oya
 * @date 29.12.2021
 */
interface FileDataSource {
    suspend fun getCategories(): List<Category>
}