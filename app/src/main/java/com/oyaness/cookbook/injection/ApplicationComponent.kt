package com.oyaness.cookbook.injection

import com.oyaness.cookbook.CookbookApplication
import com.oyaness.cookbook.menu.di.MenuModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author Oya
 * @date 15.12.2022
 */


@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ApplicationModule::class,
        MainModule::class
    ]
)
internal interface ApplicationComponent : AndroidInjector<CookbookApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: CookbookApplication): ApplicationComponent
    }

    override fun inject(application: CookbookApplication)
}