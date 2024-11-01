package com.pharos.main_screen_impl

import com.pharos.main_screen_api.MainScreenApi
import com.pharos.main_screen_impl.MainScreenImpl
import com.pharos.main_screen_impl.screens.main_screen.MainScreen
import com.pharos.main_screen_impl.screens.main_screen.MainScreenModel
import org.koin.dsl.module
import com.pharos.mvi_koin_voyager.impl.provideMviModel

val mainScreenModule
    get() = module {
        provideMviModel<MainScreen> { tag, _ -> MainScreenModel(tag) }
        single<MainScreenApi> { MainScreenImpl() }
    }
