package com.oyaness.cookbook.common_ui.base

import javax.inject.Scope

/**
 * @author Oya
 * @date 17.12.2022
 */

@Scope
@kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.TYPE, AnnotationTarget.CLASS, AnnotationTarget.FUNCTION)
annotation class ActivityScope