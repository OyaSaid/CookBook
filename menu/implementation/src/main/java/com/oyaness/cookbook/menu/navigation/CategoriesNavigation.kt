//package com.oyaness.cookbook.menu.navigation
//
//import androidx.compose.foundation.layout.PaddingValues
//import androidx.compose.foundation.layout.padding
//import androidx.compose.runtime.LaunchedEffect
//import androidx.compose.ui.Modifier
//import androidx.lifecycle.ViewModelProvider
//import androidx.navigation.NavController
//import androidx.navigation.NavGraphBuilder
//import androidx.navigation.compose.composable
//import androidx.navigation.navOptions
//
///**
// * @author Oya
// * @date 24.1.2023
// */
//internal fun NavGraphBuilder.categories(
//    viewModelFactory: ViewModelProvider.Factory,
//    navController: NavController,
//    contentPadding: PaddingValues
//) {
//
////    composable(Welcome.route) {
////        val welcomeViewModel = composeViewModel<WelcomeViewModel>(viewModelFactory = viewModelFactory)
////        val viewState by welcomeViewModel.viewState.liveData.observeAsState()
////
////        LaunchedEffect(key1 = Unit) {
////            welcomeViewModel.onScreenOpened()
////        }
////
////        WelcomeScreen(
////            modifier = Modifier.padding(contentPadding),
////            state = viewState!!,
////            navigateToCountrySelection = {
////                navController.navigate(
////                    CountrySelection.route,
////                    navOptions {
////                        popUpTo(Welcome.route) {
////                            inclusive = true
////                        }
////                    }
////                )
////            },
////            navigateToSignIn = {
////                navController.navigate(
////                    SignIn.route,
////                    navOptions {
////                        popUpTo(Welcome.route) {
////                            inclusive = true
////                        }
////                    }
////                )
////            }
////        )
////    }
//}