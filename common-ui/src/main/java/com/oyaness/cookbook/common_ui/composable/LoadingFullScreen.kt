package com.oyaness.cookbook.common_ui.composable

import androidx.activity.compose.BackHandler
import androidx.compose.animation.core.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.airbnb.lottie.compose.*
import com.oyaness.cookbook.common_ui.R

/**
 * @author Oya
 * @date 22.1.2023
 */

@Composable
fun LoadingFullScreen(
    modifier: Modifier = Modifier,
    isLoading: Boolean,
    content: @Composable () -> Unit
) {
    Box(modifier = modifier.fillMaxSize()) {
        content()
        if (isLoading) {
//            Scrim(modifier = Modifier.pointerInput(Unit) {})
        }
        LoadingView(show = isLoading)
    }

    BackHandler(enabled = isLoading) {
        // do nothing when non cancellable loading is in loading state
    }
}

@Composable
private fun BoxScope.LoadingView(show: Boolean) {
    if (show) {
//        val composition = LottieAnimationSpec.RawRes(R.raw.loader)
//        LottieAnimation(composition)

        val anim = rememberLottieAnimatable()
        val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loader))
//        LaunchedEffect(composition) {
//            anim.animate(
//                composition,
//                iterations = LottieConstants.IterateForever,
//            )
//        }
        LottieAnimation(anim.composition, { anim.progress })
////        val loadingDrawable = painterResource(id = R.drawable.ic_bold_extra_large_sync_two_direction)
//        val infiniteTransition = rememberInfiniteTransition()
////        val angle by infiniteTransition.animateFloat(
////            initialValue = 360F,
////            targetValue = 0F,
//////            animationSpec = infiniteRepeatable(animation = tween(Integers.AnimationTiming16, easing = LinearEasing))
////        )

        Card(
            modifier = Modifier.align(Alignment.Center)
//            shape = RoundedCornerShape(Dimensions.ComponentCornerRadiusPopup),
//            backgroundColor = Colors.Neutral00
        ) {
//            Icon(
//                painter = loadingDrawable,
//                contentDescription = "Loading",
//                modifier = Modifier.graphicsLayer { rotationZ = angle })
        }
    }
}

@Preview
@Composable
fun PreviewLoadingFullScreen() {
    LoadingFullScreen(isLoading = true) {}
}
