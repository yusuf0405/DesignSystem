package org.joseph.designsystem.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.runtime.staticCompositionLocalOf

val LocalDesignSystemTypography = staticCompositionLocalOf<DesignSystemTypography> {
    error("No typography provided")
}

@Composable
fun ProvideTypography(
    DesignSystemTypography: DesignSystemTypography,
    content: @Composable () -> Unit,
) {
    val styles = remember { DesignSystemTypography }
    CompositionLocalProvider(
        values = arrayOf(LocalDesignSystemTypography provides styles),
        content = content
    )
}