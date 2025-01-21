package org.joseph.designsystem.colors

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color

@Stable
class DesignSystemColors(
    textHeadline: Color,
    textPrimary: Color,
    onTextPrimary: Color,
    textSecondary: Color,
    textTertiary: Color,
    textInverted: Color,
    textPositive: Color,
    textNegative: Color,
    textPrimaryLink: Color,
    textPrimaryLinkInverted: Color,
    textSecondaryLink: Color,

    backgroundPrimary: Color,
    onBackgroundPrimary: Color,
    backgroundPrimaryElevated: Color,
    backgroundModal: Color,
    backgroundStroke: Color,
    backgroundSecondary: Color,
    backgroundSecondaryElevated: Color,
    backgroundInverted: Color,
    backgroundOverlay: Color,
    backgroundHover: Color,
    backgroundNavbarIos: Color,

    iconsPrimary: Color,
    iconsSecondary: Color,
    iconsTertiary: Color,

    controlsPrimaryActive: Color,
    controlsSecondaryActive: Color,
    controlsTertiaryActive: Color,
    controlsInactive: Color,
    controlsAlternative: Color,
    controlsActiveTabBar: Color,
    controlsInactiveTabBar: Color,

    accentActive: Color,
    accentPositive: Color,
    accentWarning: Color,
    accentNegative: Color,

    accentActiveInverted: Color,
    accentPositiveInverted: Color,
    accentWarningInverted: Color,
    accentNegativeInverted: Color,

    primary: Color,

    isDark: Boolean,
) {
    var textHeadline by mutableStateOf(textHeadline)
        private set
    var textPrimary by mutableStateOf(textPrimary)
        private set

    var onTextPrimary by mutableStateOf(onTextPrimary)
        private set
    var textSecondary by mutableStateOf(textSecondary)
        private set
    var textTertiary by mutableStateOf(textTertiary)
        private set
    var textInverted by mutableStateOf(textInverted)
        private set
    var textPositive by mutableStateOf(textPositive)
        private set
    var textNegative by mutableStateOf(textNegative)
        private set
    var textPrimaryLink by mutableStateOf(textPrimaryLink)
        private set
    var textPrimaryLinkInverted by mutableStateOf(textPrimaryLinkInverted)
        private set
    var textSecondaryLink by mutableStateOf(textSecondaryLink)
        private set

    var backgroundPrimary by mutableStateOf(backgroundPrimary)
        private set
    var onBackgroundPrimary by mutableStateOf(onBackgroundPrimary)
        private set

    var backgroundPrimaryElevated by mutableStateOf(backgroundPrimaryElevated)
        private set
    var backgroundModal by mutableStateOf(backgroundModal)
        private set
    var backgroundStroke by mutableStateOf(backgroundStroke)
        private set
    var backgroundSecondary by mutableStateOf(backgroundSecondary)
        private set
    var backgroundSecondaryElevated by mutableStateOf(backgroundSecondaryElevated)
        private set
    var backgroundInverted by mutableStateOf(backgroundInverted)
        private set
    var backgroundOverlay by mutableStateOf(backgroundOverlay)
        private set
    var backgroundHover by mutableStateOf(backgroundHover)
        private set
    var backgroundNavbarIos by mutableStateOf(backgroundNavbarIos)
        private set

    var iconsPrimary by mutableStateOf(iconsPrimary)
        private set
    var iconsSecondary by mutableStateOf(iconsSecondary)
        private set
    var iconsTertiary by mutableStateOf(iconsTertiary)
        private set

    var controlsPrimaryActive by mutableStateOf(controlsPrimaryActive)
        private set
    var controlsSecondaryActive by mutableStateOf(controlsSecondaryActive)
        private set
    var controlsTertiaryActive by mutableStateOf(controlsTertiaryActive)
        private set
    var controlsInactive by mutableStateOf(controlsInactive)
        private set
    var controlsAlternative by mutableStateOf(controlsAlternative)
        private set
    var controlsActiveTabBar by mutableStateOf(controlsActiveTabBar)
        private set
    var controlsInactiveTabBar by mutableStateOf(controlsInactiveTabBar)
        private set

    var accentActive by mutableStateOf(accentActive)
        private set
    var accentPositive by mutableStateOf(accentPositive)
        private set
    var accentWarning by mutableStateOf(accentWarning)
        private set
    var accentNegative by mutableStateOf(accentNegative)
        private set

    var accentActiveInverted by mutableStateOf(accentActiveInverted)
        private set
    var accentPositiveInverted by mutableStateOf(accentPositiveInverted)
        private set
    var accentWarningInverted by mutableStateOf(accentWarningInverted)
        private set
    var accentNegativeInverted by mutableStateOf(accentNegativeInverted)
        private set

    var primary by mutableStateOf(primary)
        private set

    var isDark by mutableStateOf(isDark)
        private set

    fun update(other: DesignSystemColors) {
        textHeadline = other.textHeadline
        textPrimary = other.textPrimary
        onTextPrimary = other.onTextPrimary
        textSecondary = other.textSecondary
        textTertiary = other.textTertiary
        textInverted = other.textInverted
        textPositive = other.textPositive
        textNegative = other.textNegative
        textPrimaryLink = other.textPrimaryLink
        textPrimaryLinkInverted = other.textPrimaryLinkInverted
        textSecondaryLink = other.textSecondaryLink

        backgroundPrimary = other.backgroundPrimary
        onBackgroundPrimary = other.onBackgroundPrimary
        backgroundPrimaryElevated = other.backgroundPrimaryElevated
        backgroundModal = other.backgroundModal
        backgroundStroke = other.backgroundStroke
        backgroundSecondary = other.backgroundSecondary
        backgroundSecondaryElevated = other.backgroundSecondaryElevated
        backgroundInverted = other.backgroundInverted
        backgroundOverlay = other.backgroundOverlay
        backgroundHover = other.backgroundHover
        backgroundNavbarIos = other.backgroundNavbarIos

        iconsPrimary = other.iconsPrimary
        iconsSecondary = other.iconsSecondary
        iconsTertiary = other.iconsTertiary

        controlsPrimaryActive = other.controlsPrimaryActive
        controlsSecondaryActive = other.controlsSecondaryActive
        controlsTertiaryActive = other.controlsTertiaryActive
        controlsInactive = other.controlsInactive
        controlsAlternative = other.controlsAlternative
        controlsActiveTabBar = other.controlsActiveTabBar
        controlsInactiveTabBar = other.controlsInactiveTabBar

        accentActive = other.accentActive
        accentPositive = other.accentPositive
        accentWarning = other.accentWarning
        accentNegative = other.accentNegative

        accentActiveInverted = other.accentActiveInverted
        accentPositiveInverted = other.accentPositiveInverted
        accentWarningInverted = other.accentWarningInverted
        accentNegativeInverted = other.accentNegativeInverted

        primary = other.primary

        isDark = other.isDark
    }
}

internal fun debugColors(
    darkTheme: Boolean,
    darkPalette: DesignSystemColors,
    lightPalette: DesignSystemColors,
) = if (darkTheme) darkColorScheme(
    primary = darkPalette.onBackgroundPrimary,
    secondary = darkPalette.backgroundSecondary
) else lightColorScheme(
    primary = lightPalette.onBackgroundPrimary,
    secondary = lightPalette.backgroundSecondary
)