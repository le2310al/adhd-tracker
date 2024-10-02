plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.room)
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "com.le2310al.adhdtracker"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.le2310al.adhdtracker"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.15"
    }

    kotlinOptions {
        jvmTarget =  JavaVersion.VERSION_17.toString()
    }

    room {
        schemaDirectory("$projectDir/schemas")
    }

}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.webkit)
    implementation(libs.androidx.room.common)
    implementation(libs.androidx.room.ktx)
    implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation(libs.navigation.compose)
    implementation(libs.navigation.compose)
    implementation(libs.kotlinx.serialization.json)
    implementation(kotlin("stdlib-jdk8"))
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.androidx.hilt.navigation.compose)
    ksp(libs.hilt.compiler)
    kspTest(libs.hilt.compiler)
    testImplementation(libs.hilt.android.testing)
    androidTestImplementation(libs.hilt.android.testing)
    androidTestImplementation(kotlin("test"))

    implementation(libs.androidx.material3)
    implementation(libs.androidx.material3.window.size)
    implementation(libs.androidx.material3.adaptive.navigation.suite)
    ksp(libs.androidx.room.compiler)
    /*
    implementation(libs.androidx.activity.compose)
    implementation(libs.androidx.compose.material3.adaptive)
    implementation(libs.androidx.compose.material3.adaptive.layout)
    implementation(libs.androidx.compose.material3.adaptive.navigation)
    implementation(libs.androidx.compose.material3.windowSizeClass)
    implementation(libs.androidx.compose.runtime.tracing)
    implementation(libs.androidx.core.splashscreen)
    implementation(libs.androidx.lifecycle.runtimeCompose)
    implementation(libs.androidx.navigation.compose)
    implementation(libs.androidx.profileinstaller)
    implementation(libs.androidx.tracing.ktx)
    implementation(libs.androidx.window.core)
    implementation(libs.kotlinx.coroutines.guava)
    implementation(libs.coil.kt)
    debugImplementation(libs.androidx.compose.ui.testManifest)
     */
    //testImplementation(projects.core.dataTest)
    //testImplementation(projects.sync.syncTest)
    //testImplementation(libs.kotlin.test)
    //testDemoImplementation(libs.robolectric)
    //testDemoImplementation(libs.roborazzi)
    //testDemoImplementation(projects.core.screenshotTesting)
    //androidTestImplementation(projects.core.testing)
    //androidTestImplementation(projects.core.dataTest)
    //androidTestImplementation(projects.core.datastoreTest)
    //androidTestImplementation(libs.androidx.test.espresso.core)
    //androidTestImplementation(libs.androidx.navigation.testing)
    //androidTestImplementation(libs.androidx.compose.ui.test)

    //debugImplementation(libs.androidx.ui.tooling)
    //implementation(libs.androidx.ui.tooling.preview)
    //implementation(libs.androidx.runtime)
    //implementation(libs.androidx.runtime.livedata)
    //implementation(libs.androidx.runtime.rxjava2)
    //implementation(libs.androidx.material3.adaptive.navigation.suite)
    //implementation(libs.androidx.activity.compose)
    //implementation(libs.androidx.lifecycle.viewmodel.compose)
    //implementation(libs.dagger)
    //annotationProcessor(libs.google.dagger.compiler)
    //ksp(libs.google.dagger.compiler)
    //implementation(libs.androidx.room.runtime)
    //annotationProcessor(libs.room.compiler)
    //ksp(libs.room.compiler)
    //debugImplementation(libs.androidx.ui.test.manifest)
    //androidTestImplementation(libs.androidx.ui.test.junit4)
}
