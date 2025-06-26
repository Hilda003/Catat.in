package com.app.catatin.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.max
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus

@Composable
fun FinanceCard(
    modifier: Modifier = Modifier,
    title: String,
    amount: Long,
    icon: Painter ,
    backgroundColor: Color
) {
    Card(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight()
            .widthIn(max = 170.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = backgroundColor),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Column(
            modifier = modifier
                .padding(8.dp)
        ) {
            Row {
                Icon(
                    painter = icon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp),
                )
                Text(
                    text = title,
                    modifier = Modifier.weight(1f),
                    style = TextStyle(
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontFamily = JakartaPlus,
                        fontWeight = androidx.compose.ui.text.font.FontWeight.Medium,
                    )
                )
            }
            Text(
                text = "Rp${amount.toString().replace(Regex("(\\d)(?=(\\d{3})+(?!\\d))"), "$1.")}",
                style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.Black,
                    fontFamily = JakartaPlus,
                    fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,
                )
            )
        }
    }
}

@Composable
@Preview
fun FinanceCardPreview() {
    FinanceCard(
        title = "Income",
        amount = 1000000,
        icon = painterResource(id = R.drawable.ic_income),
        backgroundColor = colorResource(R.color.yellow),
        modifier = Modifier.padding(8.dp)
    )
}
