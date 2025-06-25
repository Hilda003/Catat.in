package com.app.catatin.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus


@Composable
@Preview
fun GradientLogo () {
    val gradientColors = listOf(
        colorResource(id = R.color.white),
        colorResource(id = R.color.yellow)
    )
    Text(

        text = "Catat.in",
        fontFamily = JakartaPlus, fontWeight = FontWeight.ExtraBold,
        fontSize = 40.sp,
        style = TextStyle(
            brush = Brush.horizontalGradient(
                colors = gradientColors,
                startX = 0f,
                endX = 500f
            )
        )

    )
}