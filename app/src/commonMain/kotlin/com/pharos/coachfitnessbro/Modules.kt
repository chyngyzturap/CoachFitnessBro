package com.pharos.coachfitnessbro

import com.pharos.database.databaseModule
import com.pharos.main_screen_impl.mainScreenModule
import com.pharos.network.networkModule

private val coreModules
    get() = listOf(
        networkModule,
        databaseModule,
    )

//private val componentsModules
//    get() = listOf(
//        userModule,
//    )

private val featureModules
    get() = listOf(
        mainScreenModule,
//        coachScreensModule,
    )

val appModules
    get() = listOf(
        coreModules,
//        componentsModules,
        featureModules,
    ).flatten()
