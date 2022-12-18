package com.oyaness.cookbook.cache.db.mapper

import com.oyaness.cookbook.cache.db.entity.CookbookEntity

/**
 * @author Oya
 * @date 01.1.2022
 */
internal interface DBEntityMapper<E : CookbookEntity, T> {
    fun mapToEntity(model: T): E

    fun mapFromEntity(entity: E): T
}