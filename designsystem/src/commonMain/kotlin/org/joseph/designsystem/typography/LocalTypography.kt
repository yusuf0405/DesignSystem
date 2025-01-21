package org.joseph.designsystem.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

internal val LocalDesignSystemTypography = staticCompositionLocalOf<DesignSystemTypography> {
    error("No typography provided")
}

@Composable
internal fun ProvideTypography(
    typography: DesignSystemTypography,
    content: @Composable () -> Unit,
) {
    val styles = remember { typography }
    CompositionLocalProvider(
        values = arrayOf(LocalDesignSystemTypography provides styles),
        content = content
    )
}