package com.oyaness.cookbook.injection

import android.app.Application
import com.oyaness.cookbook.CookbookApplication
import com.oyaness.cookbook.menu.di.MenuModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * @author Oya
 * @date 15.12.2022
 */

@Module(includes = [MenuModule::class])
internal class ApplicationModule {

    @Provides
    @Singleton
    internal fun provideApplication(application: CookbookApplication): Application = application
}
