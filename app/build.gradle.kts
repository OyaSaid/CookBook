plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("com.google.gms.google-services")
}

android {
    compileSdk = Config.compileSdkVersion

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdkVersion
        targetSdk = Config.targetSdkVersion
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    namespace = "com.oyaness.cookbook"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(Modules.common_ui))
//    implementation(project(Modules.cache))
//    implementation(project(Modules.network))
//    implementation(project(Modules.data))
    implementation(project(Modules.menuApi))
    implementation(project(Modules.menuImplementation))


    implementation(platform(Firebase.bom))

    implementation(Kotlin.core)
//    implementation(Koin.core)


    //injection
    compileOnly(Dagger.annotations)
    implementation(Dagger.dagger)
    implementation(Dagger.dagger_android)
    kapt(Dagger.dagger_compiler)
    kapt(Dagger.dagger_android_compiler)

    implementation("com.google.android.material:material:1.3.0")
}