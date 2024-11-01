package com.pharos.main_screen_impl.screens.main_screen

import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenAction
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenEffect
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenEvent
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenState
import com.pharos.mvi_koin_voyager.impl.MviModel

internal class MainScreenModel(
    tag: String
) : MviModel<MainScreenAction, MainScreenEffect, MainScreenEvent, MainScreenState>(
    defaultState = MainScreenState,
    tag = tag,
) {

}
