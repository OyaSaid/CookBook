package com.oyaness.cookbook.cache.di

import com.google.gson.Gson
import com.oyaness.cookbook.cache.db.CachedDataSourceImpl
import com.oyaness.cookbook.cache.db.CookbookDatabase
import com.oyaness.cookbook.cache.db.mapper.RecipeMapper
import com.oyaness.cookbook.cache.file.AssetsManager
import com.oyaness.cookbook.cache.file.FileDataSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

/**
 * @author Oya
 * @date 29.12.2021
 */
val cacheModule = module {
    single { Gson() }
    single { AssetsManager(androidContext()) }
    single { FileDataSourceImpl(get(), get()) }

    single { CookbookDatabase.getInstance(androidContext()) }
    single { RecipeMapper() }
    single { CachedDataSourceImpl(get(), get()) }
}
