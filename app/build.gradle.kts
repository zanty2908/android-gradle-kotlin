plugins {
    `android-base-app`
    `android-base`
}

android {
    defaultConfig {
        applicationId = "com.zanty.simple.gradlekts"
        versionCode = 1
        versionName = "1.0"
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
}
