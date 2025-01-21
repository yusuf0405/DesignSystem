package org.joseph.designsystem.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import org.joseph.designsystem.dimens.bodyExtraLargeFontSize
import org.joseph.designsystem.dimens.bodyExtraMediumFontSize
import org.joseph.designsystem.dimens.bodyExtraSmallFontSize
import org.joseph.designsystem.dimens.bodyLargeFontSize
import org.joseph.designsystem.dimens.bodyMediumFontSize
import org.joseph.designsystem.dimens.bodySmallFontSize
import org.joseph.designsystem.dimens.titleExtraLargeFontSize
import org.joseph.designsystem.dimens.titleExtraMediumFontSize
import org.joseph.designsystem.dimens.titleExtraSmallFontSize
import org.joseph.designsystem.dimens.titleLargeFontSize
import org.joseph.designsystem.dimens.titleMediumFontSize
import org.joseph.designsystem.dimens.titleSmallFontSize

@Immutable
class DesignSystemTypography(fontFamily: FontFamily) {
    /** Title **/
    val titleExtraLarge = fontFamily.createFontsType(titleExtraLargeFontSize)
    val titleLarge = fontFamily.createFontsType(titleLargeFontSize)
    val titleExtraMedium = fontFamily.createFontsType(titleExtraMediumFontSize)
    val titleMedium = fontFamily.createFontsType(titleMediumFontSize)
    val titleExtraSmall = fontFamily.createFontsType(titleExtraSmallFontSize)
    val titleSmall = fontFamily.createFontsType(titleSmallFontSize)

    /** Body **/
    val bodyExtraLarge = fontFamily.createFontsType(bodyExtraLargeFontSize)
    val bodyLarge = fontFamily.createFontsType(bodyLargeFontSize)
    val bodyExtraMedium = fontFamily.createFontsType(bodyExtraMediumFontSize)
    val bodyMedium = fontFamily.createFontsType(bodyMediumFontSize)
    val bodyExtraSmall = fontFamily.createFontsType(bodyExtraSmallFontSize)
    val bodySmall = fontFamily.createFontsType(bodySmallFontSize)
}

/**
 * Universal function for creating 'DesignSystemFontsType`
 */
private fun FontFamily.createFontsType(fontSize: TextUnit): DesignSystemFontsType {
    return DesignSystemFontsType(
        black = createTextStyle(FontWeight.Black).copy(fontSize = fontSize),
        bold = createTextStyle(FontWeight.Bold).copy(fontSize = fontSize),
        regular = createTextStyle(FontWeight.Normal).copy(fontSize = fontSize),
        light = createTextStyle(FontWeight.Light).copy(fontSize = fontSize),
        medium = createTextStyle(FontWeight.Medium).copy(fontSize = fontSize),
        semiBold = createTextStyle(FontWeight.SemiBold).copy(fontSize = fontSize),
        thin = createTextStyle(FontWeight.Thin).copy(fontSize = fontSize),
        extraBold = createTextStyle(FontWeight.ExtraBold).copy(fontSize = fontSize)
    )
}

/**
 * Creating a `TextStyle` with the specified 'FontWeight'
 */
private fun FontFamily.createTextStyle(fontWeight: FontWeight): TextStyle {
    return TextStyle(fontFamily = this, fontWeight = fontWeight)
}

internal fun debugTypography(debugTextStyle: TextStyle = TextStyle()) = Typography(
    titleLarge = debugTextStyle,
    titleMedium = debugTextStyle,
    titleSmall = debugTextStyle,
    bodyLarge = debugTextStyle,
    bodyMedium = debugTextStyle,
    bodySmall = debugTextStyle,
    headlineSmall = debugTextStyle,
    headlineLarge = debugTextStyle,
    headlineMedium = debugTextStyle,
    labelSmall = debugTextStyle,
    labelLarge = debugTextStyle,
    labelMedium = debugTextStyle,
    displayLarge = debugTextStyle,
    displayMedium = debugTextStyle,
    displaySmall = debugTextStyle,
)