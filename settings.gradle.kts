rootProject.name = "CoachFitnessBro"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":app")
include(":server")
include(":common")
include(":core")
include(":component")
include(":features")
include(":common:logger")
include(":common:mvi")
include(":common:mvi:mvi-general")
include(":common:mvi:mvi-koin-voyager")
include(":common:utils")
include(":core:database")
include(":core:network")
include(":core:resources")
include(":features:main-screen-api")
include(":features:main-screen-impl")
include(":features:main-screen")
include(":features:main-screen:main-screen-api")
include(":features:main-screen:main-screen-impl")
