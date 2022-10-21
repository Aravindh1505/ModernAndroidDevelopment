package com.aravindh.androidcore.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

val FordExtraLargeTitle: TextStyle = TextStyle(
    fontWeight = FontWeight.ExtraLight,
    fontSize = 48.sp,
    letterSpacing = 3.sp,
    fontFamily = FordAntennaCond
)

val FordLargeTitle: TextStyle = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 32.sp,
    letterSpacing = 3.sp,
    fontFamily = FordAntennaCond
)

val FordTitle1: TextStyle = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 28.sp,
    letterSpacing = 3.sp,
    fontFamily = FordAntennaCond
)

val FordTitle2: TextStyle = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 24.sp,
    letterSpacing = 2.sp,
    fontFamily = FordAntennaCond
)

val FordTitle3: TextStyle = TextStyle(
    fontWeight = FontWeight.Light,
    fontSize = 20.sp,
    letterSpacing = 2.sp,
    fontFamily = FordAntennaCond
)

val FordTitle4: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordSubtitle: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordBody1: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    lineHeight = 20.sp,
    fontFamily = FordAntenna
)

val FordBody1Normal: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntenna
)

val FordBody2: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntenna
)

val FordBody3: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntenna
)

val FordCaption: TextStyle = TextStyle(
    fontWeight = FontWeight.Medium,
    fontSize = 10.sp,
    letterSpacing = 0.8.sp,
    fontFamily = FordAntenna
)

val FordDisplay1: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 28.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordDisplay2: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 18.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordDisplay3: TextStyle = TextStyle(
    fontWeight = FontWeight.Bold,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordButtonNormal: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordButtonNormalSmall: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntennaCond
)

val FordLink: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    letterSpacing = 1.sp,
    fontFamily = FordAntenna,
    textDecoration = TextDecoration.Underline
)

val FordIconText: TextStyle = TextStyle(
    fontWeight = FontWeight.Normal,
    fontSize = 8.sp,
    letterSpacing = 0.5.sp,
    fontFamily = FordAntenna,
)

/**
 *
 * The fonts for Ford Pass
 *
 * They should not be modified unless they are modified by the designers with InVision
 *
 */
object FdsTypography {
    val extraLargeTitle = FordExtraLargeTitle
    val largeTitle = FordLargeTitle
    val title1 = FordTitle1
    val title2 = FordTitle2
    val title4 = FordTitle4
    val title3 = FordTitle3
    val body1 = FordBody1
    val body1Normal = FordBody1Normal
    val body2 = FordBody2
    val body3 = FordBody3
    val subtitle = FordSubtitle
    val caption = FordCaption
    val display1 = FordDisplay1
    val display2 = FordDisplay2
    val display3 = FordDisplay3
    val buttonNormal = FordButtonNormal
    val buttonNormalSmall = FordButtonNormalSmall
    val headerLink = FordLink
    val headerIconText = FordIconText
}


/*
* Text(
        text = stringResource(id = R.string.account_landing_myvehicle_authorizedusersinfo_removealldescription4),
        textAlign = TextAlign.Start,
        style = FdsTheme.typography.body1,
        color = FdsTheme.colors.primaryInfo,
        modifier = Modifier
            .padding(top = dimensionResource(id = com.fordmps.fds.R.dimen.dimen_8dp))
    )*/