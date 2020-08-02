import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin

fun DependencyHandler.appCompat() = implementations(
    "androidx.appcompat:appcompat" version Versions.APP_COMPAT,
    "androidx.core:core-ktx" version Versions.CORE_KTX,
    "com.google.android.material:material" version Versions.MATERIAL_ANDROID,
    "androidx.constraintlayout:constraintlayout" version Versions.CONSTRAINT_LAYOUT
)

fun DependencyHandler.lifecycle() = implementations(
    "androidx.lifecycle:lifecycle-runtime" version Versions.LIFECYCLE,
    "androidx.lifecycle:lifecycle-extensions" version Versions.LIFECYCLE,
    "androidx.lifecycle:lifecycle-viewmodel-ktx" version Versions.LIFECYCLE,
    "androidx.lifecycle:lifecycle-livedata-ktx" version Versions.LIFECYCLE
)

fun DependencyHandler.base() = implementations(
    kotlin("stdlib"),
    "org.jetbrains.kotlinx:kotlinx-coroutines-android" version Versions.COROUTINES_ANDROID,
    "com.jakewharton.timber:timber" version Versions.TIMBER
)

fun DependencyHandler.test() {
    implementation(kotlin("reflect"))
    testImplementation(kotlin("test"))
    testImplementation(kotlin("test-junit"))
}

fun DependencyHandler.androidTest() {
    androidTestImplementation("androidx.test:runner" version Versions.ANDROID_TEST_RUNNER)
    androidTestImplementation("androidx.test.espresso:espresso-core" version Versions.ANDROID_TEST_ESPRESSO)
}

fun DependencyHandler.retrofit() = implementations(
    "com.squareup.retrofit2:retrofit" version Versions.RETROFIT,
    "com.squareup.retrofit2:converter-moshi" version Versions.RETROFIT,
    "com.squareup.okhttp3:logging-interceptor" version Versions.OKHTTP3
)

fun DependencyHandler.moshi() {
    implementation("com.squareup.moshi:moshi-kotlin" version Versions.MOSHI)
    kapt("com.squareup.moshi:moshi-kotlin-codegen" version Versions.MOSHI)
}

fun DependencyHandler.room() {
    implementations(
        "androidx.room:room-runtime" version Versions.ROOM,
        "androidx.room:room-ktx" version Versions.ROOM
    )
    kapt("androidx.room:room-compiler" version Versions.ROOM)
}
