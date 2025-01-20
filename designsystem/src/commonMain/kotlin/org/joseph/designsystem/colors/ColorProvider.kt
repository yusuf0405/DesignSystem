package org.joseph.designsystem.colors

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

val LocalDesignSystemColors = staticCompositionLocalOf<DesignSystemColors> {
    error("No palette provided")
}

@Composable
fun ProvideColors(
    colors: DesignSystemColors,
    content: @Composable () -> Unit,
) {
    colors.update(colors)
    CompositionLocalProvider(
        values = arrayOf(LocalDesignSystemColors provides colors),
        content = content
    )
}