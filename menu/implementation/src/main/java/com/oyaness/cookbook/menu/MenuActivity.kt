package com.oyaness.cookbook.menu

import android.os.Bundle
import android.util.Log
import androidx.activity.compose.setContent
import com.oyaness.cookbook.common_ui.base.BaseInjectionActivity
import com.oyaness.cookbook.menu.navigation.NavigationHost
import timber.log.Timber

/**
 * @author Oya
 * @date 17.12.2022
 */
class MenuActivity :BaseInjectionActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("oja", "menu")

        setContent {
            NavigationHost()
        }
    }
}