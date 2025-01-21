package org.joseph.designsystem

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.font.FontFamily
import org.joseph.designsystem.colors.DesignSystemColors
import org.joseph.designsystem.colors.LocalDesignSystemColors
import org.joseph.designsystem.colors.ProvideColors
import org.joseph.designsystem.colors.darkPalette
import org.joseph.designsystem.colors.debugColors
import org.joseph.designsystem.colors.lightPalette
import org.joseph.designsystem.dimens.DesignSystemDimens
import org.joseph.designsystem.shapes.Shapes
import org.joseph.designsystem.typography.DesignSystemTypography
import org.joseph.designsystem.typography.LocalDesignSystemTypography
import org.joseph.designsystem.typography.PoppinsFont
import org.joseph.designsystem.typography.ProvideTypography
import org.joseph.designsystem.typography.debugTypography

val LocalThemeIsDark = compositionLocalOf { mutableStateOf(true) }
private val LocalDimens = staticCompositionLocalOf { DesignSystemDimens() }

@Composable
fun DesignSystemTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    fontFamily: FontFamily = PoppinsFont(),
    content: @Composable () -> Unit
) {
    val isDarkState = remember { mutableStateOf(isDarkTheme) }
    val typography = remember { DesignSystemTypography(fontFamily) }
    val colors = if (isDarkState.value) darkPalette else lightPalette

    CompositionLocalProvider(
        LocalThemeIsDark provides isDarkState,
        LocalDimens provides DesignSystemDimens()
    ) {
        ProvideTypography(typography) {
            ProvideColors(colors) {
                SystemAppearance(!isDarkState.value)
                MaterialTheme(
                    colorScheme = debugColors(isDarkState.value, darkPalette, lightPalette),
                    typography = debugTypography(),
                    shapes = Shapes,
                    content = content
                )
            }
        }
    }
}

object DesignSystemTheme {
    val colors: DesignSystemColors
        @Composable
        get() = LocalDesignSystemColors.current

    val typography: DesignSystemTypography
        @Composable
        get() = LocalDesignSystemTypography.current

    val shapes: Shapes
        @Composable
        get() = MaterialTheme.shapes

    val dimens: DesignSystemDimens
        @Composable
        get() = LocalDimens.current

    val isDarkTheme: MutableState<Boolean>
        @Composable
        get() = LocalThemeIsDark.current
}

@Composable
internal expect fun SystemAppearance(isDark: Boolean)