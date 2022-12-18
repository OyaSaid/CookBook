package com.oyaness.cookbook.menu.di

import com.oyaness.cookbook.common_ui.base.ActivityScope
import com.oyaness.cookbook.menu.MenuActivity
import com.oyaness.cookbook.menu.api.navigation.MenuNavigator
import com.oyaness.cookbook.menu.navigation.MenuNavigatorImpl
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * @author Oya
 * @date 01.1.2022
 */
@Module
abstract class MenuModule {

    @ActivityScope
    @ContributesAndroidInjector()
    abstract fun menuActivity(): MenuActivity

    @Binds
    internal abstract fun bindMenuNavigator(navigator: MenuNavigatorImpl): MenuNavigator
}