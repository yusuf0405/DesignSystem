package org.joseph.designsystem.shapes

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import org.joseph.designsystem.dimens.MediumSpacing
import org.joseph.designsystem.dimens.LargeSpacing
import org.joseph.designsystem.dimens.SmallSpacing

val Shapes = Shapes(
    small = RoundedCornerShape(SmallSpacing),
    medium = RoundedCornerShape(MediumSpacing),
    large = RoundedCornerShape(LargeSpacing)
)