package com.oyaness.cookbook.network.di

import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.oyaness.cookbook.network.RemoteDataSourceImpl
import org.koin.dsl.module

/**
 * @author Oya
 * @date 15.1.2022
 */
val networkModule = module {
    single { Firebase.database }
    single { RemoteDataSourceImpl(get()) }
}