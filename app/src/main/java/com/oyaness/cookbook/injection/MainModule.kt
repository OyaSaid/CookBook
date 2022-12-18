package com.oyaness.cookbook.injection

import com.oyaness.cookbook.MainActivity
import com.oyaness.cookbook.common_ui.base.ActivityScope
import com.oyaness.cookbook.menu.di.MenuModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Oya
 * @date 17.12.2022
 */

@Module(includes = [MenuModule::class])
abstract class MainModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun mainActivity(): MainActivity

}