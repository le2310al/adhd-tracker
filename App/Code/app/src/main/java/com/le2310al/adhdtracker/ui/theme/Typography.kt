package com.le2310al.adhdtracker.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.le2310al.adhdtracker.R

val OpenDyslexic = FontFamily(
    Font(R.font.opendyslexic_regular, FontWeight.Normal),
    Font(R.font.opendyslexic_italic, FontWeight.Medium),
    Font(R.font.opendyslexic_bold, FontWeight.Bold),
)

val AdhdTypography = Typography(
    headlineLarge	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    headlineMedium	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    headlineSmall	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    titleLarge	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    titleMedium	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    titleSmall	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    bodyLarge	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    bodyMedium = TextStyle(
        fontFamily = OpenDyslexic,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodySmall	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    labelLarge	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    labelMedium	= TextStyle(
        fontFamily = OpenDyslexic
    ),
    labelSmall	= TextStyle(
        fontFamily = OpenDyslexic
    ),

)
