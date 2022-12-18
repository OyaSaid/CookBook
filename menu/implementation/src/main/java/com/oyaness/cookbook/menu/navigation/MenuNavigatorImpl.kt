package com.oyaness.cookbook.menu.navigation

import android.app.Activity
import android.content.Intent
import com.oyaness.cookbook.menu.MenuActivity
import com.oyaness.cookbook.menu.api.navigation.MenuNavigator
import javax.inject.Inject

/**
 * @author Oya
 * @date 16.12.2022
 */
internal class MenuNavigatorImpl @Inject constructor() : MenuNavigator {

    override fun goToMenu(activity: Activity) {
        activity.startActivity(Intent(activity, MenuActivity::class.java))
    }
}