plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
}

compose.resources {
    generateResClass = never
}

kotlin {
    androidTarget()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            implementation(projects.common.logger)
            implementation(projects.common.utils)
            implementation(projects.common.mvi.mviGeneral)

            implementation(libs.kotlinx.coroutines.core)

            implementation(compose.runtime)

            implementation(libs.koin.core)

            implementation(libs.voyager.koin)
            implementation(libs.voyager.screenModel)
        }
        iosMain.dependencies {
            implementation(libs.touchlab.stately.common)
            implementation(libs.compose.runtime.saveable)
        }
    }
}

android {
    namespace = "com.pharos.mvi_koin_voyager"
    compileSdk = 34
    defaultConfig {
        minSdk = 24
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_21
        targetCompatibility = JavaVersion.VERSION_21
    }
}
