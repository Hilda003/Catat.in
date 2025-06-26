package com.app.catatin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus

@Composable
fun  ItemTransaction(
    modifier: Modifier,
    title: String,
    icon: Painter,
    amount: Long,
    date: String,
    isIncome: Boolean = true,
    iconBackground: Color,
    onClick: () -> Unit = { /* No-op by default */ }
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Box(
                modifier = modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .background(iconBackground),
                contentAlignment = Alignment.Center

                ) {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                        .size(30.dp),
                    tint = colorResource(R.color.blue)
                )
            }
            Column {
                Text(
                    text = title,
                    modifier = Modifier.padding(start = 8.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontFamily = JakartaPlus,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,

                    )
                )
                Text(
                    text = date,
                    modifier = Modifier.padding(start = 8.dp),
                    style = androidx.compose.ui.text.TextStyle(
                        fontSize = 10.sp,
                        color = Color.Gray.copy(0.45f),
                        fontFamily = JakartaPlus,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
                    )
                )
            }
        }

        Text(
            text = if (isIncome) "+${amount}" else "-${amount}",
            style = androidx.compose.ui.text.TextStyle(
                fontSize = 16.sp,
                color = if (isIncome) Color.Black else Color.Red,
                fontFamily = JakartaPlus,
                fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,

                )
        )

    }

}

@Composable
@Preview(showBackground = true)
fun ItemTransactionPreview() {
    ItemTransaction(
        modifier = Modifier.padding(8.dp),
        title = "Salary",
        icon = painterResource(id = com.app.catatin.R.drawable.ic_plane),
        amount = 5000,
        date = "2023-10-01",
        isIncome = true,
        iconBackground = colorResource(R.color.blue_water).copy(0.48f),
    )
}