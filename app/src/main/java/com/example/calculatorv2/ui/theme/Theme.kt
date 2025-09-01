package com.example.calculatorv2.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Color(0xFF84C9EF),   // Main color for key UI elements
    primaryContainer = Color(0xFFB4D2ED), // Slightly different variant for accents or pressed states
    secondary = Color(0xFFCBBDDD), // Used for secondary elements
    secondaryContainer = Color(0xFFDcb5D4), // Used for accents related to secondary elements
    tertiary = Color(0xFFE3B1D2), // For additional accents or highlights
    background = Color(0xFF141429), // Main background color
    surface = Color(0xFF141429), // Surface color, typically the same as background
    onPrimary = Color.White,  // Text/icons on top of primary color
    onSecondary = Color.Black, // Text/icons on top of secondary color
    onTertiary = Color.Black, // Text/icons on top of tertiary color
    onBackground = Color.White, // Text/icons on top of background color
    onSurface = Color.White // Text/icons on top of surfaces

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun CalculatorV2Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}