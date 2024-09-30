package com.le2310al.adhdtracker.ui.theme

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


