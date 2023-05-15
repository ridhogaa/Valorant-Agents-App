package com.ergea.valorantagentsapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Navy200,
    primaryVariant = Purple700,
    secondary = Teal200,
    background = BlueNightBG,
    onSurface = NightCard,
    surface = LightCard
)

private val LightColorPalette = lightColors(
    primary = Endeavour,
    primaryVariant = Black,
    secondary = Black,
    background = BlueLightBG,
    onSurface = LightCard,
    surface = NightCard

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun ValorantAgentsAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}