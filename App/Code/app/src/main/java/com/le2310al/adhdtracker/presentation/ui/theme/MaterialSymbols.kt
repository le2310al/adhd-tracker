package com.le2310al.adhdtracker.presentation.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Arrow_back: ImageVector
    get() {
        if (arrowBack != null) {
            return arrowBack!!
        }
        arrowBack = ImageVector.Builder(
            name = "Arrow_back",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(313f, 520f)
                lineToRelative(224f, 224f)
                lineToRelative(-57f, 56f)
                lineToRelative(-320f, -320f)
                lineToRelative(320f, -320f)
                lineToRelative(57f, 56f)
                lineToRelative(-224f, 224f)
                horizontalLineToRelative(487f)
                verticalLineToRelative(80f)
                close()
            }
        }.build()
        return arrowBack!!
    }

private var arrowBack: ImageVector? = null

val Settings_heart: ImageVector
    get() {
        if (settingsHeart != null) {
            return settingsHeart!!
        }
        settingsHeart = ImageVector.Builder(
            name = "Settings_heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(482f, 640f)
                lineToRelative(140f, -140f)
                quadToRelative(17f, -17f, 22f, -41.5f)
                reflectiveQuadToRelative(-5f, -47.5f)
                reflectiveQuadToRelative(-30f, -37f)
                reflectiveQuadToRelative(-45f, -14f)
                reflectiveQuadToRelative(-45f, 15.5f)
                reflectiveQuadToRelative(-37f, 32.5f)
                quadToRelative(-18f, -17f, -37.5f, -32.5f)
                reflectiveQuadTo(400f, 360f)
                reflectiveQuadToRelative(-45.5f, 13.5f)
                reflectiveQuadTo(324f, 410f)
                reflectiveQuadToRelative(-4.5f, 47.5f)
                reflectiveQuadTo(342f, 500f)
                close()
                moveTo(370f, 880f)
                lineToRelative(-16f, -128f)
                quadToRelative(-13f, -5f, -24.5f, -12f)
                reflectiveQuadTo(307f, 725f)
                lineToRelative(-119f, 50f)
                lineTo(78f, 585f)
                lineToRelative(103f, -78f)
                quadToRelative(-1f, -7f, -1f, -13.5f)
                verticalLineToRelative(-27f)
                quadToRelative(0f, -6.5f, 1f, -13.5f)
                lineTo(78f, 375f)
                lineToRelative(110f, -190f)
                lineToRelative(119f, 50f)
                quadToRelative(11f, -8f, 23f, -15f)
                reflectiveQuadToRelative(24f, -12f)
                lineToRelative(16f, -128f)
                horizontalLineToRelative(220f)
                lineToRelative(16f, 128f)
                quadToRelative(13f, 5f, 24.5f, 12f)
                reflectiveQuadToRelative(22.5f, 15f)
                lineToRelative(119f, -50f)
                lineToRelative(110f, 190f)
                lineToRelative(-103f, 78f)
                quadToRelative(1f, 7f, 1f, 13.5f)
                verticalLineToRelative(27f)
                quadToRelative(0f, 6.5f, -2f, 13.5f)
                lineToRelative(103f, 78f)
                lineToRelative(-110f, 190f)
                lineToRelative(-118f, -50f)
                quadToRelative(-11f, 8f, -23f, 15f)
                reflectiveQuadToRelative(-24f, 12f)
                lineTo(590f, 880f)
                close()
                moveToRelative(70f, -80f)
                horizontalLineToRelative(79f)
                lineToRelative(14f, -106f)
                quadToRelative(31f, -8f, 57.5f, -23.5f)
                reflectiveQuadTo(639f, 633f)
                lineToRelative(99f, 41f)
                lineToRelative(39f, -68f)
                lineToRelative(-86f, -65f)
                quadToRelative(5f, -14f, 7f, -29.5f)
                reflectiveQuadToRelative(2f, -31.5f)
                reflectiveQuadToRelative(-2f, -31.5f)
                reflectiveQuadToRelative(-7f, -29.5f)
                lineToRelative(86f, -65f)
                lineToRelative(-39f, -68f)
                lineToRelative(-99f, 42f)
                quadToRelative(-22f, -23f, -48.5f, -38.5f)
                reflectiveQuadTo(533f, 266f)
                lineToRelative(-13f, -106f)
                horizontalLineToRelative(-79f)
                lineToRelative(-14f, 106f)
                quadToRelative(-31f, 8f, -57.5f, 23.5f)
                reflectiveQuadTo(321f, 327f)
                lineToRelative(-99f, -41f)
                lineToRelative(-39f, 68f)
                lineToRelative(86f, 64f)
                quadToRelative(-5f, 15f, -7f, 30f)
                reflectiveQuadToRelative(-2f, 32f)
                quadToRelative(0f, 16f, 2f, 31f)
                reflectiveQuadToRelative(7f, 30f)
                lineToRelative(-86f, 65f)
                lineToRelative(39f, 68f)
                lineToRelative(99f, -42f)
                quadToRelative(22f, 23f, 48.5f, 38.5f)
                reflectiveQuadTo(427f, 694f)
                close()
                moveToRelative(40f, -320f)
            }
        }.build()
        return settingsHeart!!
    }

private var settingsHeart: ImageVector? = null

val Query_stats: ImageVector
    get() {
        if (queryStats != null) {
            return queryStats!!
        }
        queryStats = ImageVector.Builder(
            name = "Query_stats",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(105f, 727f)
                lineToRelative(-65f, -47f)
                lineToRelative(200f, -320f)
                lineToRelative(120f, 140f)
                lineToRelative(160f, -260f)
                lineToRelative(109f, 163f)
                quadToRelative(-23f, 1f, -43.5f, 5.5f)
                reflectiveQuadTo(545f, 421f)
                lineToRelative(-22f, -33f)
                lineToRelative(-152f, 247f)
                lineToRelative(-121f, -141f)
                close()
                moveTo(863f, 920f)
                lineTo(738f, 795f)
                quadToRelative(-20f, 14f, -44.5f, 21f)
                reflectiveQuadToRelative(-50.5f, 7f)
                quadToRelative(-75f, 0f, -127.5f, -52.5f)
                reflectiveQuadTo(463f, 643f)
                reflectiveQuadToRelative(52.5f, -127.5f)
                reflectiveQuadTo(643f, 463f)
                reflectiveQuadToRelative(127.5f, 52.5f)
                reflectiveQuadTo(823f, 643f)
                quadToRelative(0f, 26f, -7f, 50.5f)
                reflectiveQuadTo(795f, 739f)
                lineTo(920f, 863f)
                close()
                moveTo(643f, 743f)
                quadToRelative(42f, 0f, 71f, -29f)
                reflectiveQuadToRelative(29f, -71f)
                reflectiveQuadToRelative(-29f, -71f)
                reflectiveQuadToRelative(-71f, -29f)
                reflectiveQuadToRelative(-71f, 29f)
                reflectiveQuadToRelative(-29f, 71f)
                reflectiveQuadToRelative(29f, 71f)
                reflectiveQuadToRelative(71f, 29f)
                moveToRelative(89f, -320f)
                quadToRelative(-19f, -8f, -39.5f, -13f)
                reflectiveQuadToRelative(-42.5f, -6f)
                lineToRelative(205f, -324f)
                lineToRelative(65f, 47f)
                close()
            }
        }.build()
        return queryStats!!
    }

private var queryStats: ImageVector? = null

val Family_home: ImageVector
    get() {
        if (familyHome != null) {
            return familyHome!!
        }
        familyHome = ImageVector.Builder(
            name = "Family_home",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 120f)
                lineToRelative(440f, 330f)
                lineToRelative(-48f, 64f)
                lineToRelative(-72f, -54f)
                verticalLineToRelative(380f)
                horizontalLineTo(160f)
                verticalLineToRelative(-380f)
                lineToRelative(-72f, 54f)
                lineToRelative(-48f, -64f)
                close()
                moveTo(294f, 482f)
                quadToRelative(0f, 53f, 57f, 113f)
                reflectiveQuadToRelative(129f, 125f)
                quadToRelative(72f, -65f, 129f, -125f)
                reflectiveQuadToRelative(57f, -113f)
                quadToRelative(0f, -44f, -30f, -73f)
                reflectiveQuadToRelative(-72f, -29f)
                quadToRelative(-26f, 0f, -47.5f, 10.5f)
                reflectiveQuadTo(480f, 418f)
                quadToRelative(-15f, -17f, -37.5f, -27.5f)
                reflectiveQuadTo(396f, 380f)
                quadToRelative(-42f, 0f, -72f, 29f)
                reflectiveQuadToRelative(-30f, 73f)
                moveToRelative(426f, 278f)
                verticalLineToRelative(-360f)
                lineTo(480f, 220f)
                lineTo(240f, 400f)
                verticalLineToRelative(360f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineTo(240f)
                close()
            }
        }.build()
        return familyHome!!
    }

private var familyHome: ImageVector? = null

val Edit_document: ImageVector
    get() {
        if (editDocument != null) {
            return editDocument!!
        }
        editDocument = ImageVector.Builder(
            name = "Edit_document",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(560f, 880f)
                verticalLineToRelative(-123f)
                lineToRelative(221f, -220f)
                quadToRelative(9f, -9f, 20f, -13f)
                reflectiveQuadToRelative(22f, -4f)
                quadToRelative(12f, 0f, 23f, 4.5f)
                reflectiveQuadToRelative(20f, 13.5f)
                lineToRelative(37f, 37f)
                quadToRelative(8f, 9f, 12.5f, 20f)
                reflectiveQuadToRelative(4.5f, 22f)
                reflectiveQuadToRelative(-4f, 22.5f)
                reflectiveQuadToRelative(-13f, 20.5f)
                lineTo(683f, 880f)
                close()
                moveToRelative(300f, -263f)
                lineToRelative(-37f, -37f)
                close()
                moveTo(620f, 820f)
                horizontalLineToRelative(38f)
                lineToRelative(121f, -122f)
                lineToRelative(-18f, -19f)
                lineToRelative(-19f, -18f)
                lineToRelative(-122f, 121f)
                close()
                moveTo(240f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(160f, 800f)
                verticalLineToRelative(-640f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(240f, 80f)
                horizontalLineToRelative(320f)
                lineToRelative(240f, 240f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(-80f)
                horizontalLineTo(520f)
                verticalLineToRelative(-200f)
                horizontalLineTo(240f)
                verticalLineToRelative(640f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(521f, -201f)
                lineToRelative(-19f, -18f)
                lineToRelative(37f, 37f)
                close()
            }
        }.build()
        return editDocument!!
    }

private var editDocument: ImageVector? = null

val Calendar_month: ImageVector
    get() {
        if (calendarMonth != null) {
            return calendarMonth!!
        }
        calendarMonth = ImageVector.Builder(
            name = "Calendar_month",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(200f, 880f)
                quadToRelative(-33f, 0f, -56.5f, -23.5f)
                reflectiveQuadTo(120f, 800f)
                verticalLineToRelative(-560f)
                quadToRelative(0f, -33f, 23.5f, -56.5f)
                reflectiveQuadTo(200f, 160f)
                horizontalLineToRelative(40f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(320f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(80f)
                horizontalLineToRelative(40f)
                quadToRelative(33f, 0f, 56.5f, 23.5f)
                reflectiveQuadTo(840f, 240f)
                verticalLineToRelative(560f)
                quadToRelative(0f, 33f, -23.5f, 56.5f)
                reflectiveQuadTo(760f, 880f)
                close()
                moveToRelative(0f, -80f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-400f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, -480f)
                horizontalLineToRelative(560f)
                verticalLineToRelative(-80f)
                horizontalLineTo(200f)
                close()
                moveToRelative(0f, 0f)
                verticalLineToRelative(-80f)
                close()
                moveToRelative(280f, 240f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(480f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(520f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(480f, 560f)
                moveToRelative(-160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(320f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(360f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(320f, 560f)
                moveToRelative(320f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 520f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(640f, 480f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(680f, 520f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(640f, 560f)
                moveTo(480f, 720f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(440f, 680f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(480f, 640f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(520f, 680f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(480f, 720f)
                moveToRelative(-160f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(280f, 680f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(320f, 640f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(360f, 680f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(320f, 720f)
                moveToRelative(320f, 0f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(600f, 680f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(640f, 640f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(680f, 680f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(640f, 720f)
            }
        }.build()
        return calendarMonth!!
    }

private var calendarMonth: ImageVector? = null

val Schedule: ImageVector
    get() {
        if (schedule != null) {
            return schedule!!
        }
        schedule = ImageVector.Builder(
            name = "Schedule",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(612f, 668f)
                lineToRelative(56f, -56f)
                lineToRelative(-148f, -148f)
                verticalLineToRelative(-184f)
                horizontalLineToRelative(-80f)
                verticalLineToRelative(216f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(133f, 0f, 226.5f, -93.5f)
                reflectiveQuadTo(800f, 480f)
                reflectiveQuadToRelative(-93.5f, -226.5f)
                reflectiveQuadTo(480f, 160f)
                reflectiveQuadToRelative(-226.5f, 93.5f)
                reflectiveQuadTo(160f, 480f)
                reflectiveQuadToRelative(93.5f, 226.5f)
                reflectiveQuadTo(480f, 800f)
            }
        }.build()
        return schedule!!
    }

private var schedule: ImageVector? = null

public val Arrow_forward: ImageVector
    get() {
        if (arrowForward != null) {
            return arrowForward!!
        }
        arrowForward = ImageVector.Builder(
            name = "Arrow_forward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(647f, 520f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(487f)
                lineTo(423f, 216f)
                lineToRelative(57f, -56f)
                lineToRelative(320f, 320f)
                lineToRelative(-320f, 320f)
                lineToRelative(-57f, -56f)
                close()
            }
        }.build()
        return arrowForward!!
    }

private var arrowForward: ImageVector? = null

public val Sentiment_dissatisfied: ImageVector
    get() {
        if (_Sentiment_dissatisfied != null) {
            return _Sentiment_dissatisfied!!
        }
        _Sentiment_dissatisfied = ImageVector.Builder(
            name = "Sentiment_dissatisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(620f, 440f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(620f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(560f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(620f, 440f)
                moveToRelative(-280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(340f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(280f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(340f, 440f)
                moveToRelative(140f, 100f)
                quadToRelative(-68f, 0f, -123.5f, 38.5f)
                reflectiveQuadTo(276f, 680f)
                horizontalLineToRelative(66f)
                quadToRelative(22f, -37f, 58.5f, -58.5f)
                reflectiveQuadTo(480f, 600f)
                reflectiveQuadToRelative(79.5f, 21.5f)
                reflectiveQuadTo(618f, 680f)
                horizontalLineToRelative(66f)
                quadToRelative(-25f, -63f, -80.5f, -101.5f)
                reflectiveQuadTo(480f, 540f)
                moveToRelative(0f, 340f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
            }
        }.build()
        return _Sentiment_dissatisfied!!
    }

private var _Sentiment_dissatisfied: ImageVector? = null

public val Sentiment_satisfied: ImageVector
    get() {
        if (_Sentiment_satisfied != null) {
            return _Sentiment_satisfied!!
        }
        _Sentiment_satisfied = ImageVector.Builder(
            name = "Sentiment_satisfied",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(620f, 440f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(620f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(560f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(620f, 440f)
                moveToRelative(-280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(340f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(280f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(340f, 440f)
                moveToRelative(140f, 260f)
                quadToRelative(68f, 0f, 123.5f, -38.5f)
                reflectiveQuadTo(684f, 560f)
                horizontalLineToRelative(-66f)
                quadToRelative(-22f, 37f, -58.5f, 58.5f)
                reflectiveQuadTo(480f, 640f)
                reflectiveQuadToRelative(-79.5f, -21.5f)
                reflectiveQuadTo(342f, 560f)
                horizontalLineToRelative(-66f)
                quadToRelative(25f, 63f, 80.5f, 101.5f)
                reflectiveQuadTo(480f, 700f)
                moveToRelative(0f, 180f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
            }
        }.build()
        return _Sentiment_satisfied!!
    }

private var _Sentiment_satisfied: ImageVector? = null

public val Sentiment_neutral: ImageVector
    get() {
        if (_Sentiment_neutral != null) {
            return _Sentiment_neutral!!
        }
        _Sentiment_neutral = ImageVector.Builder(
            name = "Sentiment_neutral",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(620f, 440f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(680f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(620f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(560f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(620f, 440f)
                moveToRelative(-280f, 0f)
                quadToRelative(25f, 0f, 42.5f, -17.5f)
                reflectiveQuadTo(400f, 380f)
                reflectiveQuadToRelative(-17.5f, -42.5f)
                reflectiveQuadTo(340f, 320f)
                reflectiveQuadToRelative(-42.5f, 17.5f)
                reflectiveQuadTo(280f, 380f)
                reflectiveQuadToRelative(17.5f, 42.5f)
                reflectiveQuadTo(340f, 440f)
                moveToRelative(20f, 180f)
                horizontalLineToRelative(240f)
                verticalLineToRelative(-60f)
                horizontalLineTo(360f)
                close()
                moveTo(480f, 880f)
                quadToRelative(-83f, 0f, -156f, -31.5f)
                reflectiveQuadTo(197f, 763f)
                reflectiveQuadToRelative(-85.5f, -127f)
                reflectiveQuadTo(80f, 480f)
                reflectiveQuadToRelative(31.5f, -156f)
                reflectiveQuadTo(197f, 197f)
                reflectiveQuadToRelative(127f, -85.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(156f, 31.5f)
                reflectiveQuadTo(763f, 197f)
                reflectiveQuadToRelative(85.5f, 127f)
                reflectiveQuadTo(880f, 480f)
                reflectiveQuadToRelative(-31.5f, 156f)
                reflectiveQuadTo(763f, 763f)
                reflectiveQuadToRelative(-127f, 85.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(134f, 0f, 227f, -93f)
                reflectiveQuadToRelative(93f, -227f)
                reflectiveQuadToRelative(-93f, -227f)
                reflectiveQuadToRelative(-227f, -93f)
                reflectiveQuadToRelative(-227f, 93f)
                reflectiveQuadToRelative(-93f, 227f)
                reflectiveQuadToRelative(93f, 227f)
                reflectiveQuadToRelative(227f, 93f)
            }
        }.build()
        return _Sentiment_neutral!!
    }

private var _Sentiment_neutral: ImageVector? = null

public val Pill: ImageVector
    get() {
        if (_Pill != null) {
            return _Pill!!
        }
        _Pill = ImageVector.Builder(
            name = "Pill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(345f, 840f)
                quadToRelative(-94f, 0f, -159.5f, -65.5f)
                reflectiveQuadTo(120f, 615f)
                quadToRelative(0f, -45f, 17f, -86f)
                reflectiveQuadToRelative(49f, -73f)
                lineToRelative(270f, -270f)
                quadToRelative(32f, -32f, 73f, -49f)
                reflectiveQuadToRelative(86f, -17f)
                quadToRelative(94f, 0f, 159.5f, 65.5f)
                reflectiveQuadTo(840f, 345f)
                quadToRelative(0f, 45f, -17f, 86f)
                reflectiveQuadToRelative(-49f, 73f)
                lineTo(504f, 774f)
                quadToRelative(-32f, 32f, -73f, 49f)
                reflectiveQuadToRelative(-86f, 17f)
                moveToRelative(266f, -286f)
                lineToRelative(107f, -106f)
                quadToRelative(20f, -20f, 31f, -47f)
                reflectiveQuadToRelative(11f, -56f)
                quadToRelative(0f, -60f, -42.5f, -102.5f)
                reflectiveQuadTo(615f, 200f)
                quadToRelative(-29f, 0f, -56f, 11f)
                reflectiveQuadToRelative(-47f, 31f)
                lineTo(406f, 349f)
                close()
                moveTo(345f, 760f)
                quadToRelative(29f, 0f, 56f, -11f)
                reflectiveQuadToRelative(47f, -31f)
                lineToRelative(106f, -107f)
                lineToRelative(-205f, -205f)
                lineToRelative(-107f, 106f)
                quadToRelative(-20f, 20f, -31f, 47f)
                reflectiveQuadToRelative(-11f, 56f)
                quadToRelative(0f, 60f, 42.5f, 102.5f)
                reflectiveQuadTo(345f, 760f)
            }
        }.build()
        return _Pill!!
    }

private var _Pill: ImageVector? = null

public val Pill_off: ImageVector
    get() {
        if (_Pill_off != null) {
            return _Pill_off!!
        }
        _Pill_off = ImageVector.Builder(
            name = "Pill_off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(694f, 584f)
                lineToRelative(-56f, -56f)
                lineToRelative(80f, -80f)
                quadToRelative(20f, -20f, 31f, -47f)
                reflectiveQuadToRelative(11f, -56f)
                quadToRelative(0f, -60f, -42.5f, -102.5f)
                reflectiveQuadTo(615f, 200f)
                quadToRelative(-29f, 0f, -56f, 11f)
                reflectiveQuadToRelative(-47f, 31f)
                lineToRelative(-80f, 80f)
                lineToRelative(-56f, -56f)
                lineToRelative(80f, -80f)
                quadToRelative(32f, -32f, 73f, -49f)
                reflectiveQuadToRelative(86f, -17f)
                quadToRelative(94f, 0f, 159.5f, 65.5f)
                reflectiveQuadTo(840f, 345f)
                quadToRelative(0f, 45f, -17f, 86f)
                reflectiveQuadToRelative(-49f, 73f)
                close()
                moveTo(345f, 760f)
                quadToRelative(29f, 0f, 56f, -11f)
                reflectiveQuadToRelative(47f, -31f)
                lineToRelative(77f, -77f)
                lineToRelative(-206f, -206f)
                lineToRelative(-77f, 77f)
                quadToRelative(-20f, 20f, -31f, 47f)
                reflectiveQuadToRelative(-11f, 56f)
                quadToRelative(0f, 60f, 42.5f, 102.5f)
                reflectiveQuadTo(345f, 760f)
                moveTo(792f, 908f)
                lineTo(581f, 697f)
                lineToRelative(-77f, 77f)
                quadToRelative(-32f, 32f, -73f, 49f)
                reflectiveQuadToRelative(-86f, 17f)
                quadToRelative(-94f, 0f, -159.5f, -65.5f)
                reflectiveQuadTo(120f, 615f)
                quadToRelative(0f, -45f, 17f, -86f)
                reflectiveQuadToRelative(49f, -73f)
                lineToRelative(77f, -77f)
                lineTo(56f, 172f)
                lineToRelative(56f, -56f)
                lineToRelative(736f, 736f)
                close()
                moveTo(535f, 425f)
            }
        }.build()
        return _Pill_off!!
    }

private var _Pill_off: ImageVector? = null

public val Routine: ImageVector
    get() {
        if (_Routine != null) {
            return _Routine!!
        }
        _Routine = ImageVector.Builder(
            name = "Routine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(396f, 564f)
                quadToRelative(-32f, -32f, -58.5f, -67f)
                reflectiveQuadTo(289f, 423f)
                quadToRelative(-5f, 14f, -6.5f, 28.5f)
                reflectiveQuadTo(281f, 480f)
                quadToRelative(0f, 83f, 58f, 141f)
                reflectiveQuadToRelative(141f, 58f)
                quadToRelative(14f, 0f, 28.5f, -2f)
                reflectiveQuadToRelative(28.5f, -6f)
                quadToRelative(-39f, -22f, -74f, -48.5f)
                reflectiveQuadTo(396f, 564f)
                moveToRelative(57f, -56f)
                quadToRelative(51f, 51f, 114f, 87.5f)
                reflectiveQuadTo(702f, 652f)
                quadToRelative(-40f, 51f, -98f, 79.5f)
                reflectiveQuadTo(481f, 760f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(201f, 480f)
                quadToRelative(0f, -65f, 28.5f, -123f)
                reflectiveQuadToRelative(79.5f, -98f)
                quadToRelative(20f, 72f, 56.5f, 135f)
                reflectiveQuadTo(453f, 508f)
                moveToRelative(290f, 72f)
                quadToRelative(-20f, -5f, -39.5f, -11f)
                reflectiveQuadTo(665f, 555f)
                quadToRelative(8f, -18f, 11.5f, -36.5f)
                reflectiveQuadTo(680f, 480f)
                quadToRelative(0f, -83f, -58.5f, -141.5f)
                reflectiveQuadTo(480f, 280f)
                quadToRelative(-20f, 0f, -38.5f, 3.5f)
                reflectiveQuadTo(405f, 295f)
                quadToRelative(-8f, -19f, -13.5f, -38f)
                reflectiveQuadTo(381f, 218f)
                quadToRelative(24f, -9f, 49f, -13.5f)
                reflectiveQuadToRelative(51f, -4.5f)
                quadToRelative(117f, 0f, 198.5f, 81.5f)
                reflectiveQuadTo(761f, 480f)
                quadToRelative(0f, 26f, -4.5f, 51f)
                reflectiveQuadTo(743f, 580f)
                moveTo(440f, 120f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(120f)
                close()
                moveToRelative(0f, 840f)
                verticalLineToRelative(-120f)
                horizontalLineToRelative(80f)
                verticalLineTo(960f)
                close()
                moveToRelative(323f, -706f)
                lineToRelative(-57f, -57f)
                lineToRelative(85f, -84f)
                lineToRelative(57f, 56f)
                close()
                moveTo(169f, 847f)
                lineToRelative(-57f, -56f)
                lineToRelative(85f, -85f)
                lineToRelative(57f, 57f)
                close()
                moveToRelative(671f, -327f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveTo(0f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(791f, 328f)
                lineToRelative(-85f, -85f)
                lineToRelative(57f, -57f)
                lineToRelative(84f, 85f)
                close()
                moveTo(197f, 254f)
                lineToRelative(-84f, -85f)
                lineToRelative(56f, -57f)
                lineToRelative(85f, 85f)
                close()
                moveToRelative(199f, 310f)
            }
        }.build()
        return _Routine!!
    }

private var _Routine: ImageVector? = null

public val Clear_night: ImageVector
    get() {
        if (_Clear_night != null) {
            return _Clear_night!!
        }
        _Clear_night = ImageVector.Builder(
            name = "Clear_night",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(524f, 920f)
                quadToRelative(-84f, 0f, -157.5f, -32f)
                reflectiveQuadToRelative(-128f, -86.5f)
                reflectiveQuadToRelative(-86.5f, -128f)
                reflectiveQuadTo(120f, 516f)
                quadToRelative(0f, -146f, 93f, -257.5f)
                reflectiveQuadTo(450f, 120f)
                quadToRelative(-18f, 99f, 11f, 193.5f)
                reflectiveQuadTo(561f, 479f)
                reflectiveQuadToRelative(165.5f, 100f)
                reflectiveQuadTo(920f, 590f)
                quadToRelative(-26f, 144f, -138f, 237f)
                reflectiveQuadTo(524f, 920f)
                moveToRelative(0f, -80f)
                quadToRelative(88f, 0f, 163f, -44f)
                reflectiveQuadToRelative(118f, -121f)
                quadToRelative(-86f, -8f, -163f, -43.5f)
                reflectiveQuadTo(504f, 535f)
                reflectiveQuadToRelative(-97f, -138f)
                reflectiveQuadToRelative(-43f, -163f)
                quadToRelative(-77f, 43f, -120.5f, 118.5f)
                reflectiveQuadTo(200f, 516f)
                quadToRelative(0f, 135f, 94.5f, 229.5f)
                reflectiveQuadTo(524f, 840f)
                moveToRelative(-20f, -305f)
            }
        }.build()
        return _Clear_night!!
    }

private var _Clear_night: ImageVector? = null


public val Clear_day: ImageVector
    get() {
        if (_Clear_day != null) {
            return _Clear_day!!
        }
        _Clear_day = ImageVector.Builder(
            name = "Clear_day",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(440f, 200f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
                moveToRelative(266f, 110f)
                lineToRelative(-55f, -55f)
                lineToRelative(112f, -115f)
                lineToRelative(56f, 57f)
                close()
                moveToRelative(54f, 210f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveTo(440f, 920f)
                verticalLineToRelative(-160f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(160f)
                close()
                moveTo(254f, 308f)
                lineTo(140f, 197f)
                lineToRelative(57f, -56f)
                lineToRelative(113f, 113f)
                close()
                moveToRelative(508f, 512f)
                lineTo(651f, 705f)
                lineToRelative(54f, -54f)
                lineToRelative(114f, 110f)
                close()
                moveTo(40f, 520f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(80f)
                close()
                moveToRelative(157f, 300f)
                lineToRelative(-56f, -57f)
                lineToRelative(112f, -112f)
                lineToRelative(29f, 27f)
                lineToRelative(29f, 28f)
                close()
                moveToRelative(283f, -100f)
                quadToRelative(-100f, 0f, -170f, -70f)
                reflectiveQuadToRelative(-70f, -170f)
                reflectiveQuadToRelative(70f, -170f)
                reflectiveQuadToRelative(170f, -70f)
                reflectiveQuadToRelative(170f, 70f)
                reflectiveQuadToRelative(70f, 170f)
                reflectiveQuadToRelative(-70f, 170f)
                reflectiveQuadToRelative(-170f, 70f)
                moveToRelative(0f, -80f)
                quadToRelative(66f, 0f, 113f, -47f)
                reflectiveQuadToRelative(47f, -113f)
                reflectiveQuadToRelative(-47f, -113f)
                reflectiveQuadToRelative(-113f, -47f)
                reflectiveQuadToRelative(-113f, 47f)
                reflectiveQuadToRelative(-47f, 113f)
                reflectiveQuadToRelative(47f, 113f)
                reflectiveQuadToRelative(113f, 47f)
                moveToRelative(0f, -160f)
            }
        }.build()
        return _Clear_day!!
    }

private var _Clear_day: ImageVector? = null

public val Egg_alt: ImageVector
    get() {
        if (_Egg_alt != null) {
            return _Egg_alt!!
        }
        _Egg_alt = ImageVector.Builder(
            name = "Egg_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(640f, 880f)
                quadToRelative(-67f, 0f, -101.5f, -22.5f)
                reflectiveQuadTo(480f, 810f)
                quadToRelative(-19f, -20f, -36.5f, -35f)
                reflectiveQuadTo(399f, 760f)
                quadToRelative(-45f, 0f, -100f, -15.5f)
                reflectiveQuadToRelative(-103.5f, -51f)
                reflectiveQuadTo(114f, 601f)
                reflectiveQuadTo(80f, 461f)
                quadToRelative(-2f, -167f, 82.5f, -274f)
                reflectiveQuadTo(399f, 80f)
                quadToRelative(71f, 0f, 120f, 20.5f)
                reflectiveQuadToRelative(84.5f, 51.5f)
                reflectiveQuadToRelative(60f, 68.5f)
                reflectiveQuadTo(710f, 293f)
                quadToRelative(12f, 20f, 24f, 36.5f)
                reflectiveQuadToRelative(26f, 30.5f)
                quadToRelative(60f, 60f, 90f, 105f)
                reflectiveQuadToRelative(30f, 136f)
                quadToRelative(0f, 120f, -74.5f, 199.5f)
                reflectiveQuadTo(640f, 880f)
                moveToRelative(0f, -80f)
                quadToRelative(57f, 0f, 108.5f, -56.5f)
                reflectiveQuadTo(800f, 601f)
                quadToRelative(0f, -66f, -19.5f, -97f)
                reflectiveQuadTo(704f, 416f)
                quadToRelative(-21f, -20f, -37.5f, -44.5f)
                reflectiveQuadTo(633f, 321f)
                quadToRelative(-41f, -65f, -87f, -113f)
                reflectiveQuadToRelative(-147f, -48f)
                quadToRelative(-129f, 0f, -185f, 92.5f)
                reflectiveQuadTo(160f, 460f)
                quadToRelative(1f, 67f, 29f, 110f)
                reflectiveQuadToRelative(66.5f, 67.5f)
                reflectiveQuadTo(334f, 671f)
                reflectiveQuadToRelative(65f, 9f)
                quadToRelative(51f, 0f, 82f, 24.5f)
                reflectiveQuadToRelative(51f, 45.5f)
                quadToRelative(22f, 23f, 42.5f, 36.5f)
                reflectiveQuadTo(640f, 800f)
                moveTo(480f, 620f)
                quadToRelative(58f, 0f, 99f, -41f)
                reflectiveQuadToRelative(41f, -99f)
                reflectiveQuadToRelative(-41f, -99f)
                reflectiveQuadToRelative(-99f, -41f)
                reflectiveQuadToRelative(-99f, 41f)
                reflectiveQuadToRelative(-41f, 99f)
                reflectiveQuadToRelative(41f, 99f)
                reflectiveQuadToRelative(99f, 41f)
                moveToRelative(-1f, -140f)
            }
        }.build()
        return _Egg_alt!!
    }

private var _Egg_alt: ImageVector? = null

public val Kid_star: ImageVector
    get() {
        if (_Kid_star != null) {
            return _Kid_star!!
        }
        _Kid_star = ImageVector.Builder(
            name = "Kid_star",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(305f, 256f)
                lineToRelative(112f, -145f)
                quadToRelative(12f, -16f, 28.5f, -23.5f)
                reflectiveQuadTo(480f, 80f)
                reflectiveQuadToRelative(34.5f, 7.5f)
                reflectiveQuadTo(543f, 111f)
                lineToRelative(112f, 145f)
                lineToRelative(170f, 57f)
                quadToRelative(26f, 8f, 41f, 29.5f)
                reflectiveQuadToRelative(15f, 47.5f)
                quadToRelative(0f, 12f, -3.5f, 24f)
                reflectiveQuadTo(866f, 437f)
                lineTo(756f, 593f)
                lineToRelative(4f, 164f)
                quadToRelative(1f, 35f, -23f, 59f)
                reflectiveQuadToRelative(-56f, 24f)
                quadToRelative(-2f, 0f, -22f, -3f)
                lineToRelative(-179f, -50f)
                lineToRelative(-179f, 50f)
                quadToRelative(-5f, 2f, -11f, 2.5f)
                reflectiveQuadToRelative(-11f, 0.5f)
                quadToRelative(-32f, 0f, -56f, -24f)
                reflectiveQuadToRelative(-23f, -59f)
                lineToRelative(4f, -165f)
                lineTo(95f, 437f)
                quadToRelative(-8f, -11f, -11.5f, -23f)
                reflectiveQuadTo(80f, 390f)
                quadToRelative(0f, -25f, 14.5f, -46.5f)
                reflectiveQuadTo(135f, 313f)
                close()
                moveToRelative(49f, 69f)
                lineToRelative(-194f, 64f)
                lineToRelative(124f, 179f)
                lineToRelative(-4f, 191f)
                lineToRelative(200f, -55f)
                lineToRelative(200f, 56f)
                lineToRelative(-4f, -192f)
                lineToRelative(124f, -177f)
                lineToRelative(-194f, -66f)
                lineToRelative(-126f, -165f)
                close()
                moveToRelative(126f, 135f)
            }
        }.build()
        return _Kid_star!!
    }

private var _Kid_star: ImageVector? = null

public val Pulse_alert: ImageVector
    get() {
        if (_Pulse_alert != null) {
            return _Pulse_alert!!
        }
        _Pulse_alert = ImageVector.Builder(
            name = "Pulse_alert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(87f, 400f)
                quadToRelative(-4f, -15f, -5.5f, -30f)
                reflectiveQuadTo(80f, 339f)
                quadToRelative(0f, -94f, 63f, -156.5f)
                reflectiveQuadTo(300f, 120f)
                quadToRelative(51f, 0f, 98.5f, 22f)
                reflectiveQuadToRelative(81.5f, 62f)
                quadToRelative(34f, -40f, 81f, -62f)
                reflectiveQuadToRelative(99f, -22f)
                quadToRelative(94f, 0f, 157f, 62.5f)
                reflectiveQuadTo(880f, 339f)
                verticalLineToRelative(2f)
                quadToRelative(-19f, -17f, -41f, -29.5f)
                reflectiveQuadTo(792f, 291f)
                quadToRelative(-14f, -41f, -50f, -66f)
                reflectiveQuadToRelative(-82f, -25f)
                quadToRelative(-43f, 0f, -83f, 25.5f)
                reflectiveQuadTo(503f, 300f)
                horizontalLineToRelative(-46f)
                quadToRelative(-33f, -48f, -74f, -74f)
                reflectiveQuadToRelative(-83f, -26f)
                quadToRelative(-59f, 0f, -99.5f, 40.5f)
                reflectiveQuadTo(160f, 339f)
                quadToRelative(0f, 16f, 3f, 30.5f)
                reflectiveQuadToRelative(9f, 30.5f)
                close()
                moveToRelative(393f, 440f)
                lineTo(353f, 726f)
                quadToRelative(-27f, -25f, -50f, -46f)
                reflectiveQuadToRelative(-43f, -40f)
                horizontalLineToRelative(117f)
                quadToRelative(23f, 20f, 48.5f, 43f)
                reflectiveQuadToRelative(54.5f, 49f)
                quadToRelative(17f, -14f, 31.5f, -27f)
                reflectiveQuadToRelative(28.5f, -26f)
                quadToRelative(14f, 15f, 29.5f, 27.5f)
                reflectiveQuadTo(603f, 729f)
                close()
                moveToRelative(240f, -160f)
                quadToRelative(-17f, 0f, -28.5f, -11.5f)
                reflectiveQuadTo(680f, 640f)
                reflectiveQuadToRelative(11.5f, -28.5f)
                reflectiveQuadTo(720f, 600f)
                reflectiveQuadToRelative(28.5f, 11.5f)
                reflectiveQuadTo(760f, 640f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(720f, 680f)
                moveToRelative(-40f, -120f)
                verticalLineToRelative(-200f)
                horizontalLineToRelative(80f)
                verticalLineToRelative(200f)
                close()
                moveToRelative(-640f, 0f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(178f)
                lineToRelative(70f, -103f)
                quadToRelative(6f, -9f, 14.5f, -13f)
                reflectiveQuadToRelative(18.5f, -4f)
                reflectiveQuadToRelative(18.5f, 4.5f)
                reflectiveQuadTo(354f, 378f)
                lineToRelative(68f, 102f)
                horizontalLineToRelative(62f)
                quadToRelative(-2f, 10f, -3f, 19.5f)
                reflectiveQuadToRelative(-1f, 20.5f)
                reflectiveQuadToRelative(1f, 20.5f)
                reflectiveQuadToRelative(3f, 19.5f)
                horizontalLineToRelative(-84f)
                quadToRelative(-10f, 0f, -19f, -5f)
                reflectiveQuadToRelative(-14f, -13f)
                lineToRelative(-47f, -70f)
                lineToRelative(-47f, 70f)
                quadToRelative(-5f, 8f, -14f, 13f)
                reflectiveQuadToRelative(-19f, 5f)
                close()
            }
        }.build()
        return _Pulse_alert!!
    }

private var _Pulse_alert: ImageVector? = null

public val Nutrition: ImageVector
    get() {
        if (_Nutrition != null) {
            return _Nutrition!!
        }
        _Nutrition = ImageVector.Builder(
            name = "Nutrition",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(480f, 840f)
                quadToRelative(-117f, 0f, -198.5f, -81.5f)
                reflectiveQuadTo(200f, 560f)
                quadToRelative(0f, -94f, 55.5f, -168.5f)
                reflectiveQuadTo(401f, 291f)
                quadToRelative(-20f, -5f, -39f, -14.5f)
                reflectiveQuadTo(328f, 252f)
                quadToRelative(-33f, -33f, -42.5f, -78.5f)
                reflectiveQuadTo(281f, 81f)
                quadToRelative(47f, -5f, 92.5f, 4.5f)
                reflectiveQuadTo(452f, 128f)
                quadToRelative(23f, 23f, 33.5f, 52f)
                reflectiveQuadToRelative(13.5f, 61f)
                quadToRelative(13f, -31f, 31.5f, -58.5f)
                reflectiveQuadTo(572f, 132f)
                quadToRelative(11f, -11f, 28f, -11f)
                reflectiveQuadToRelative(28f, 11f)
                reflectiveQuadToRelative(11f, 28f)
                reflectiveQuadToRelative(-11f, 28f)
                quadToRelative(-22f, 22f, -39f, 48.5f)
                reflectiveQuadTo(564f, 293f)
                quadToRelative(88f, 28f, 142f, 101.5f)
                reflectiveQuadTo(760f, 560f)
                quadToRelative(0f, 117f, -81.5f, 198.5f)
                reflectiveQuadTo(480f, 840f)
                moveToRelative(0f, -80f)
                quadToRelative(83f, 0f, 141.5f, -58.5f)
                reflectiveQuadTo(680f, 560f)
                reflectiveQuadToRelative(-58.5f, -141.5f)
                reflectiveQuadTo(480f, 360f)
                reflectiveQuadToRelative(-141.5f, 58.5f)
                reflectiveQuadTo(280f, 560f)
                reflectiveQuadToRelative(58.5f, 141.5f)
                reflectiveQuadTo(480f, 760f)
                moveToRelative(0f, -200f)
            }
        }.build()
        return _Nutrition!!
    }

private var _Nutrition: ImageVector? = null
