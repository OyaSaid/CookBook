package com.oyaness.cookbook.cache.file

import android.content.Context
import java.io.IOException

/**
 * @author Oya
 * @date 29.12.2021
 *
 * Manager class to read json files
 */
class AssetsManager(private val context: Context) {

    fun getJsonDataFromAsset(fileName: String): String =
        context.assets.open(fileName).bufferedReader().use { it.readText() }
}