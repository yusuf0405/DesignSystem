package org.joseph.designsystem.typography

import androidx.compose.material3.Typography
import androidx.compose.runtime.Immutable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
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
class DesignSystemTypography(
    /** Title **/
    val titleExtraLarge: DesignSystemFontsType = titleExtraLargeSet,
    val titleLarge: DesignSystemFontsType = titleLargeSet,
    val titleExtraMedium: DesignSystemFontsType = titleExtraMediumSet,
    val titleMedium: DesignSystemFontsType = titleMediumSet,
    val titleExtraSmall: DesignSystemFontsType = titleExtraSmallSet,
    val titleSmall: DesignSystemFontsType = titleSmallSet,

    /** Body **/
    val bodyExtraLarge: DesignSystemFontsType = bodyExtraLargeSet,
    val bodyLarge: DesignSystemFontsType = bodyLargeSet,
    val bodyExtraMedium: DesignSystemFontsType = bodyExtraMediumSet,
    val bodyMedium: DesignSystemFontsType = bodyMediumSet,
    val bodyExtraSmall: DesignSystemFontsType = bodyExtraSmallSet,
    val bodySmall: DesignSystemFontsType = bodySmallSet,
)

private val blackPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Black,
)
private val boldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Bold,
)
private val regularPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Normal,
)
private val lightPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Light,
)
private val mediumPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Medium,
)
private val semiBoldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.SemiBold,
)
private val thinPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.Thin,
)
private val extraBoldPoppins = TextStyle(
    fontFamily = PoppinsFont,
    fontWeight = FontWeight.ExtraBold,
)

val titleExtraLargeSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleExtraLargeFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraLargeFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraLargeFontSize),
    light = lightPoppins.copy(fontSize = titleExtraLargeFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraLargeFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraLargeFontSize)
)

val titleLargeSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleLargeFontSize),
    bold = boldPoppins.copy(fontSize = titleLargeFontSize),
    regular = regularPoppins.copy(fontSize = titleLargeFontSize),
    light = lightPoppins.copy(fontSize = titleLargeFontSize),
    medium = mediumPoppins.copy(fontSize = titleLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleLargeFontSize),
    thin = thinPoppins.copy(fontSize = titleLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleLargeFontSize)
)

val titleExtraMediumSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleExtraMediumFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraMediumFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraMediumFontSize),
    light = lightPoppins.copy(fontSize = titleExtraMediumFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraMediumFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraMediumFontSize)
)

val titleMediumSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleMediumFontSize),
    bold = boldPoppins.copy(fontSize = titleMediumFontSize),
    regular = regularPoppins.copy(fontSize = titleMediumFontSize),
    light = lightPoppins.copy(fontSize = titleMediumFontSize),
    medium = mediumPoppins.copy(fontSize = titleMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleMediumFontSize),
    thin = thinPoppins.copy(fontSize = titleMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleMediumFontSize)
)

val titleExtraSmallSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleExtraSmallFontSize),
    bold = boldPoppins.copy(fontSize = titleExtraSmallFontSize),
    regular = regularPoppins.copy(fontSize = titleExtraSmallFontSize),
    light = lightPoppins.copy(fontSize = titleExtraSmallFontSize),
    medium = mediumPoppins.copy(fontSize = titleExtraSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleExtraSmallFontSize),
    thin = thinPoppins.copy(fontSize = titleExtraSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleExtraSmallFontSize)
)

val titleSmallSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = titleSmallFontSize),
    bold = boldPoppins.copy(fontSize = titleSmallFontSize),
    regular = regularPoppins.copy(fontSize = titleSmallFontSize),
    light = lightPoppins.copy(fontSize = titleSmallFontSize),
    medium = mediumPoppins.copy(fontSize = titleSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = titleSmallFontSize),
    thin = thinPoppins.copy(fontSize = titleSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = titleSmallFontSize)
)

val bodyExtraLargeSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraLargeFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraLargeFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraLargeFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraLargeFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraLargeFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraLargeFontSize)
)

val bodyLargeSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodyLargeFontSize),
    bold = boldPoppins.copy(fontSize = bodyLargeFontSize),
    regular = regularPoppins.copy(fontSize = bodyLargeFontSize),
    light = lightPoppins.copy(fontSize = bodyLargeFontSize),
    medium = mediumPoppins.copy(fontSize = bodyLargeFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyLargeFontSize),
    thin = thinPoppins.copy(fontSize = bodyLargeFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyLargeFontSize)
)

val bodyExtraMediumSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraMediumFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraMediumFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraMediumFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraMediumFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraMediumFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraMediumFontSize)
)

val bodyMediumSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodyMediumFontSize),
    bold = boldPoppins.copy(fontSize = bodyMediumFontSize),
    regular = regularPoppins.copy(fontSize = bodyMediumFontSize),
    light = lightPoppins.copy(fontSize = bodyMediumFontSize),
    medium = mediumPoppins.copy(fontSize = bodyMediumFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyMediumFontSize),
    thin = thinPoppins.copy(fontSize = bodyMediumFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyMediumFontSize)
)

val bodyExtraSmallSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodyExtraSmallFontSize),
    bold = boldPoppins.copy(fontSize = bodyExtraSmallFontSize),
    regular = regularPoppins.copy(fontSize = bodyExtraSmallFontSize),
    light = lightPoppins.copy(fontSize = bodyExtraSmallFontSize),
    medium = mediumPoppins.copy(fontSize = bodyExtraSmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodyExtraSmallFontSize),
    thin = thinPoppins.copy(fontSize = bodyExtraSmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodyExtraSmallFontSize)
)

val bodySmallSet: DesignSystemFontsType = DesignSystemFontsType(
    black = blackPoppins.copy(fontSize = bodySmallFontSize),
    bold = boldPoppins.copy(fontSize = bodySmallFontSize),
    regular = regularPoppins.copy(fontSize = bodySmallFontSize),
    light = lightPoppins.copy(fontSize = bodySmallFontSize),
    medium = mediumPoppins.copy(fontSize = bodySmallFontSize),
    semiBold = semiBoldPoppins.copy(fontSize = bodySmallFontSize),
    thin = thinPoppins.copy(fontSize = bodySmallFontSize),
    extraBold = extraBoldPoppins.copy(fontSize = bodySmallFontSize)
)

fun debugTypography(
    debugTextStyle: TextStyle = TextStyle(
        fontWeight = FontWeight.W100,
        fontSize = 6.sp
    ),
) = Typography(
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