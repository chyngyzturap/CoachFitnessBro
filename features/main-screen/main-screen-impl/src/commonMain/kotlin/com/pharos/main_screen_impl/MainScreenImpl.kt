package com.pharos.main_screen_impl

import cafe.adriel.voyager.core.screen.Screen
import com.pharos.main_screen_api.MainScreenApi
import com.pharos.main_screen_impl.screens.main_screen.MainScreen

internal class MainScreenImpl : MainScreenApi {
    override fun mainScreen(): Screen = MainScreen()
}
