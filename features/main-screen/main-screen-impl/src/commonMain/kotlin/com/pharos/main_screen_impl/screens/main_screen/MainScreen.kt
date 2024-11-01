package com.pharos.main_screen_impl.screens.main_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.pharos.core.resources.Res
import com.pharos.core.resources.multiplatform
import kotlinx.coroutines.flow.Flow
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenAction
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenEvent
import com.pharos.main_screen_impl.screens.main_screen.mvi.MainScreenState
import com.pharos.mvi_koin_voyager.impl.MviView
import org.jetbrains.compose.resources.painterResource

internal class MainScreen : MviView<MainScreenAction, MainScreenEvent, MainScreenState> {

    @Composable
    override fun content(
        state: MainScreenState,
        eventFlow: Flow<MainScreenEvent>,
        pushAction: (MainScreenAction) -> Unit
    ) {
        val navigator = LocalNavigator.currentOrThrow

        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painterResource(Res.drawable.multiplatform), null)
            Text("Compose: HI")
        }

    }
}
