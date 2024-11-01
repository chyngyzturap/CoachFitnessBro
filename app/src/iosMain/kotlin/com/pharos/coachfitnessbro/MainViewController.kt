package com.pharos.coachfitnessbro

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.ComposeUIViewController
import cafe.adriel.voyager.navigator.Navigator
import com.pharos.logger.Logger
import com.pharos.main_screen_api.MainScreenApi
import com.pharos.utils.ThreadUtils
import org.koin.compose.koinInject
import org.koin.core.context.startKoin

@Suppress("unused", "FunctionName")
fun MainViewController() = ComposeUIViewController {
    val mainScreenFeatureApi = koinInject<MainScreenApi>()
    MaterialTheme {
        Navigator(
            mainScreenFeatureApi.mainScreen()
        )
    }
}

@Suppress("unused")
fun initApp(
    iosUtils: IosUtils
) {
    initKoin()
    Logger.init()
    ThreadUtils.init(iosUtils::getThreadName)
}

private fun initKoin() {
    startKoin {
        modules(
            appModules
        )
    }
}