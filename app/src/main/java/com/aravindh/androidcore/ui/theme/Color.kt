package com.aravindh.androidcore.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

val purple200 = Color(0xFFBB86FC)
val purple500 = Color(0xFF6200EE)
val purple700 = Color(0xFF3700B3)
val teal200 = Color(0xFF03DAC5)

val lightGray = Color(0x60DCDCDC)
val lightGreen200 = Color(0x9932CD32)
val whiteColor = Color(0xFFFFFFFF)
val blackColor = Color(0xF7000000)
val redColor = Color(0xF7F30606)

val Color.lightGreen: Color
    @Composable
    get() = lightGreen200

class MyColor(

    var white: Color = whiteColor,

    var black: Color = blackColor,

    var gray: Color = lightGray,

    var lightGreen: Color = whiteColor,

    var profileCircle : Color = lightGreen200
)

val LocalAppColors = staticCompositionLocalOf<MyColor> { error("") }

/**
 * The FdsTheme is called to access the FdsColors, typography and icons
 */
object MyTheme {
    val colors: MyColor
        @Composable
        get() = MyColor()

    val typography: FdsTypography = FdsTypography
    val icons: FdsIcons = FdsIcons
}