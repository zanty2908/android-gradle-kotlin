plugins {
    `kotlin-dsl`
}

dependencies {
    // android gradle plugin, required by custom plugin
    implementation("com.android.tools.build:gradle:4.0.1")

    // kotlin plugin, required by custom plugin
    implementation(kotlin("gradle-plugin", "1.3.72"))
}

repositories {
    jcenter()
    google()
}
