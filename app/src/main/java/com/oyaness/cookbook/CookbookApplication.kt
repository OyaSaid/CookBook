package com.oyaness.cookbook

import com.oyaness.cookbook.injection.ApplicationComponent
import com.oyaness.cookbook.injection.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

/**
 * @author Oya
 * @date 29.12.2021
 */
class CookbookApplication :DaggerApplication() {

    private val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(this)
    }
    override fun onCreate() {
        super.onCreate()
        component.inject(this)
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>  = component
}