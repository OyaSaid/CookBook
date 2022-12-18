package com.oyaness.cookbook.cache.db.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Update
import com.oyaness.cookbook.cache.db.entity.CookbookEntity

/**
 * @author Oya
 * @date 29.12.2021
 */
internal interface CookbookDao<in E : CookbookEntity> {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(entity: E)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(entity: E)

    @Delete
    fun delete(entity: E)
}