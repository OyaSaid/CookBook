/**
 * @author Oya
 * @date 27.12.2021
 */
object Config {
    const val applicationId = "com.oyaness.cookbook"
    const val compileSdkVersion = 33
    const val targetSdkVersion = 33
    const val minSdkVersion = 21
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Modules {
    const val common_ui = ":common-ui"
    const val navigation = ":navigation"
    const val recipes = ":recipes"
    const val data = ":data"
    const val network = ":network"
    const val cache = ":cache"
    const val menuApi = ":menu:api"
    const val menuImplementation = ":menu:implementation"
}