package com.oyaness.cookbook.data.di

import com.oyaness.cookbook.data.repository.CookbookRepository
import org.koin.dsl.module

/**
 * @author Oya
 * @date 01.1.2022
 */
val dataModule = module {
    single { CookbookRepository(get(), get(), get()) }
}