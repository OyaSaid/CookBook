package com.oyaness.cookbook.cache.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.oyaness.cookbook.cache.db.converter.CategoryEntityConverter
import com.oyaness.cookbook.cache.db.converter.IngredientEntityConverter
import com.oyaness.cookbook.cache.db.converter.ListTypeConverter
import com.oyaness.cookbook.cache.db.converter.RelatedRecipeEntityConverter
import com.oyaness.cookbook.cache.db.dao.RecipeDao
import com.oyaness.cookbook.cache.db.entity.RecipeEntity

/**
 * @author Oya
 * @date 29.12.2021
 */
@TypeConverters(
    CategoryEntityConverter::class,
    IngredientEntityConverter::class,
    RelatedRecipeEntityConverter::class,
    ListTypeConverter::class
)
@Database(entities = [RecipeEntity::class], version = 1)
abstract class CookbookDatabase : RoomDatabase() {

    internal abstract fun recipeDao(): RecipeDao

    companion object {
        @Volatile
        private var instance: CookbookDatabase? = null
        private val LOCK = Any()

        fun getInstance(context: Context): CookbookDatabase = instance
            ?: synchronized(LOCK) {
                instance ?: buildDatabase(context).also { instance = it }
            }

        private fun buildDatabase(context: Context): CookbookDatabase =
            Room.databaseBuilder(
                context.applicationContext,
                CookbookDatabase::class.java,
                "cookbook-database"
            )
                .fallbackToDestructiveMigration()
                .build()
    }
}