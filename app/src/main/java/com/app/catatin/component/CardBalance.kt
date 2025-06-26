package com.app.catatin.component

import android.R.style
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush.Companion.horizontalGradient
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus

@Composable
fun CardBalance(
    amount: Long,
) {
    val gradientColors = listOf(
        colorResource(id = R.color.blue),
        colorResource(id = R.color.blue_water)
    )
    Card (
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp),
        shape = RoundedCornerShape(10.dp),

    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .background(
                    brush = horizontalGradient(
                        colors = gradientColors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .size(125.dp)
                    .padding(top = 7.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .size(125.dp)
                    .padding(bottom = 5.dp)

            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,


            ) {
                Text(
                    text = "Total Balance",
                    style = TextStyle(
                        fontFamily = JakartaPlus,
                        fontWeight = FontWeight.Normal,
                        fontSize = 15.sp,
                        letterSpacing = 3.sp
                    ),
                    color = Color.White
                )
                Text(
                    text = "Rp${amount.toString().replace(Regex("(\\d)(?=(\\d{3})+(?!\\d))"), "$1.")}",
                    style = TextStyle(
                        fontFamily = JakartaPlus,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 35.sp,
                    ),
                    color = Color.White
                )
            }

        }


    }

}
@Composable
@Preview
fun CardBalancePreview() {
    CardBalance(amount = 3000000)
}