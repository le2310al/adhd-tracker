package com.le2310al.adhdtracker.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColorScheme = lightColorScheme(
    primary = latteBlue,
    onPrimary = latteMantle,
    //primaryContainer = latteSurface0,
    //onPrimaryContainer = latteText,
    secondary = latteGreen,
    onSecondary = latteMantle,
    //secondaryContainer = secondaryContainerLight,
    //onSecondaryContainer = latteText,
    tertiary = latteYellow,
    onTertiary = latteMantle,
    //tertiaryContainer = tertiaryContainerLight,
    //nTertiaryContainer = latteText,
    error = latteRed,
    onError = latteMantle,
    //errorContainer = errorContainerLight,
    //onErrorContainer = latteText,
    background = latteMantle,
    onBackground = latteText,
    surface = latteSurface0,
    onSurface = latteText,
    //surfaceVariant = surfaceVariantLight,
    //onSurfaceVariant = latteText,
    //outline = outlineLight,
    //outlineVariant = outlineVariantLight,
    //scrim = latteRed,
    //inverseSurface = inverseSurfaceLight,
    //inverseOnSurface = inverseOnSurfaceLight,
    //inversePrimary = inversePrimaryLight,
    surfaceDim = latteCrust,
    surfaceBright = latteBase,
    //surfaceContainerLowest = surfaceContainerLowestLight,
    //surfaceContainerLow = surfaceContainerLowLight,
    surfaceContainer = latteSurface0,
    //surfaceContainerHigh = surfaceContainerHighLight,
    //surfaceContainerHighest = surfaceContainerHighestLight,
)

private val DarkColorScheme = darkColorScheme(
    primary = frappeBlue,
    onPrimary = frappeText,
    //primaryContainer = primaryContainerLight,
    //onPrimaryContainer = frappeText,
    secondary = frappeGreen,
    onSecondary = frappeText,
    //secondaryContainer = secondaryContainerLight,
    //onSecondaryContainer = frappeText,
    tertiary = frappeYellow,
    onTertiary = frappeText,
    //tertiaryContainer = tertiaryContainerLight,
    //nTertiaryContainer = frappeText,
    error = frappeRed,
    onError = frappeText,
    //errorContainer = errorContainerLight,
    //onErrorContainer = frappeText,
    background = frappeMantle,
    onBackground = frappeText,
    surface = frappeSurface0,
    onSurface = frappeText,
    //surfaceVariant = surfaceVariantLight,
    //onSurfaceVariant = frappeText,
    //outline = outlineLight,
    //outlineVariant = outlineVariantLight,
    //scrim = scrimLight,
    //inverseSurface = inverseSurfaceLight,
    //inverseOnSurface = inverseOnSurfaceLight,
    //inversePrimary = inversePrimaryLight,
    surfaceDim = frappeCrust,
    surfaceBright = frappeBase,
    //surfaceContainerLowest = surfaceContainerLowestLight,
    //surfaceContainerLow = surfaceContainerLowLight,
    //surfaceContainer = surfaceContainerLight,
    //surfaceContainerHigh = surfaceContainerHighLight,
    //surfaceContainerHighest = surfaceContainerHighestLight,
)

@Composable
fun AdhdTrackerTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme =
        if (!darkTheme) {
            LightColorScheme
        } else {
            DarkColorScheme
        }
    MaterialTheme(
        typography = AdhdTypography,
        colorScheme = colorScheme,
        content = content
    )
}