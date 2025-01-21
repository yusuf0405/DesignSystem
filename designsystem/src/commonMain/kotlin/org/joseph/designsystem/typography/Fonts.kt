package org.joseph.designsystem.typography

import androidx.compose.runtime.Composable
import org.jetbrains.compose.resources.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import io.github.yusuf0405.designsystem.generated.resources.Res
import io.github.yusuf0405.designsystem.generated.resources.poppins
import io.github.yusuf0405.designsystem.generated.resources.poppins_black
import io.github.yusuf0405.designsystem.generated.resources.poppins_bold
import io.github.yusuf0405.designsystem.generated.resources.poppins_extra_bold
import io.github.yusuf0405.designsystem.generated.resources.poppins_extra_light
import io.github.yusuf0405.designsystem.generated.resources.poppins_light
import io.github.yusuf0405.designsystem.generated.resources.poppins_medium
import io.github.yusuf0405.designsystem.generated.resources.poppins_thin

@Composable
internal fun PoppinsFont(): FontFamily {
    return FontFamily(
        Font(Res.font.poppins, FontWeight.Normal),
        Font(Res.font.poppins_bold, FontWeight.Bold),
        Font(Res.font.poppins_light, FontWeight.Light),
        Font(Res.font.poppins_extra_bold, FontWeight.ExtraBold),
        Font(Res.font.poppins_extra_light, FontWeight.ExtraLight),
        Font(Res.font.poppins_thin, FontWeight.Thin),
        Font(Res.font.poppins_black, FontWeight.Black),
        Font(Res.font.poppins_medium, FontWeight.Medium),
    )
}