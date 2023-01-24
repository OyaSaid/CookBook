/**
 * @author Oya
 * @date 27.12.2021
 */
object Kotlin {
    private const val version = "1.7.20"

    const val core = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${version}"
    const val test = "org.jetbrains.kotlin:kotlin-test-junit:${version}"
}

object Timber {
    private const val version = "5.0.1"
    const val timber = "com.jakewharton.timber:timber:${version}"
}

object Dagger {
    /** https://github.com/google/dagger */
    private const val version = "2.44.2"
    const val annotations = "org.glassfish:javax.annotation:10.0-b28"
    const val anvil_plugin = "com.squareup.anvil:gradle-plugin:2.4.3"
    const val dagger = "com.google.dagger:dagger:${version}"
    const val dagger_compiler = "com.google.dagger:dagger-compiler:${version}"
    const val dagger_android = "com.google.dagger:dagger-android-support:${version}"
    const val dagger_android_compiler = "com.google.dagger:dagger-android-processor:${version}"
}

object Lottie {
    const val core = "com.airbnb.android:lottie-compose:5.2.0"
}

object Koin {
    private const val version = "3.1.4"

    // Koin Core features
    const val koin_kotlin = "io.insert-koin:koin-core:$version"

    // Koin Test features (testImplementation)
    const val koin_test = "io.insert-koin:koin-test:$version"

    // Koin for JUnit 4 (testImplementation)
    const val koin_junit4 = "io.insert-koin:koin-test-junit4:$version"

    // Koin for JUnit 5 (testImplementation)
    const val koin_junit5 = "io.insert-koin:koin-test-junit5:$version"

    // Koin main features for Android
    const val core = "io.insert-koin:koin-android:$version"

    // Java Compatibility
    const val koin_java = "io.insert-koin:koin-android-compat:$version"

    // Jetpack WorkManager
    const val koin_work_manager = "io.insert-koin:koin-androidx-workmanager:$version"

    // Navigation Graph
    const val koin_nav = "io.insert-koin:koin-androidx-navigation:$version"

    // Jetpack Compose
    const val koin_compose = "io.insert-koin:koin-androidx-compose:$version"
}

object Compose {
    // Integration with activities
    const val core = "androidx.activity:activity-compose:1.3.1"

    // Compose Material Design
    const val material = "androidx.compose.material:material:1.0.5"

    //Preview
    const val preview = "androidx.compose.ui:ui-tooling-preview:1.0.5"

    // Animations
    const val animations = "androidx.compose.animation:animation:1.0.5"

    // Tooling support (Previews, etc.)
    const val tooling = "androidx.compose.ui:ui-tooling:1.0.5"

    // Integration with ViewModels
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"

    const val navigation = "androidx.navigation:navigation-compose:1.0.0-alpha07"

    // UI Tests (test implementation)
    const val test = "androidx.compose.ui:ui-test-junit4:1.0.5"
}

object Hilt {
    private const val version = "2.38.1"
    const val android = "com.google.dagger:hilt-android:$version"
    const val compiler = "com.google.dagger:hilt-android-compiler:$version"
}

object Firebase {
    const val bom = "com.google.firebase:firebase-bom:29.0.3"
    const val database = "com.google.firebase:firebase-database-ktx"
}

object Lifecycle {
    private const val lifecycle_version = "2.4.0"
    private const val arch_version = "2.1.0"

    const val lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"

    // ViewModel (implementation)
    const val lifecycle_viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"

    // LiveData (implementation)
    const val lifecycle_livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

    // optional - Test helpers for LiveData (testImplementation)
    const val lifecycle_test = "androidx.arch.core:core-testing:$arch_version"
}

object Retrofit {
    private const val version = "2.8.1"
    const val core = "com.squareup.retrofit2:retrofit:$version"
    const val gson = "com.squareup.retrofit2:converter-gson:$version"
    const val moshi = "com.squareup.retrofit2:converter-moshi:$version"
    const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:$version"
    const val rxJavaAdapter3 = "com.github.akarnokd:rxjava3-retrofit-adapter:3.0.0"
}

object OkHttp {
    private const val version = "4.5.0"
    const val core = "com.squareup.okhttp3:okhttp:$version"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
}

object RX {
    private const val version3 = "3.0.0"
    private const val version = "2.1.1"

    // const val rxKotlin3 = "io.reactivex.rxjava3:rxkotlin:$version3"
    const val rxAndroid3 = "io.reactivex.rxjava3:rxandroid:$version3"

    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$version"
    const val reley = "com.jakewharton.rxrelay2:rxrelay:$version"
}

object Room {
    private const val version = "2.4.0"
    const val runtime = "androidx.room:room-runtime:$version"
    const val compiler = "androidx.room:room-compiler:$version"
    const val testing = "androidx.room:room-testing:$version"
    const val ktx = "androidx.room:room-ktx:$version"
}

object Coroutine {
    private const val version = "1.3.5"
    const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
    const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
}

object Testing {
    const val junit = "junit:junit:4.12"
    const val assertj = "org.assertj:assertj-core:3.15.0"
    const val mockito = "com.nhaarman.mockitokotlin2:mockito-kotlin:2.2.0"
    const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
}

object AndroidX {
    private const val multidex_version = "2.0.1"
    const val multidex = "androidx.multidex:multidex:$multidex_version"
    const val ktx = "androidx.core:core-ktx:1.2.0"

    const val appcompat = "androidx.appcompat:appcompat:1.3.1"
    const val recyclerview = "androidx.recyclerview:recyclerview:1.1.0"
}

object Google {
    private const val services_version = "4.3.4"
    const val google_services = "com.google.gms:google-services:$services_version"

    private const val ads_version = "19.1.0"
    const val ads = "com.google.android.gms:play-services-ads:$ads_version"

    private const val analytics_version = "17.5.0"
    const val analytics = "com.google.firebase:firebase-analytics:$analytics_version"

    private const val crashlytics_gradle_version = "2.3.0"
    const val crashlytics_gradle =
        "com.google.firebase:firebase-crashlytics-gradle:$crashlytics_gradle_version"

    private const val crashlytics_version = "17.2.2"
    const val crashlytics = "com.google.firebase:firebase-crashlytics:$crashlytics_version"

    private const val measurement_version = "17.1.0"
    const val measurment = "com.google.android.gms:play-services-measurement:$measurement_version"
    const val measurment_sdk =
        "com.google.android.gms:play-services-measurement-sdk:$measurement_version"

    private const val gson_version = "2.8.6"
    const val gson = "com.google.code.gson:gson:$gson_version"
}