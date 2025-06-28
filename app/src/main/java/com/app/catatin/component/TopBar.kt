package com.app.catatin.component

import android.R.attr.elevation
import android.R.attr.onClick
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
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
fun TopBar (
    modifier: Modifier,
    name: String,
    image: Painter,
    onClick: () -> Unit = { /* No-op by default */ }
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Card(
                    shape = CircleShape,
                    modifier = modifier.size(60.dp),
                    colors = androidx.compose.material3.CardDefaults.cardColors(
                        containerColor = colorResource(id = R.color.white)
                    ),


                ) {
                    Image(
                        painter = image,
                        contentDescription = null,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .shadow(elevation = 4.dp, shape = CircleShape),
                    )
                }
                Column {
                    Text(
                        text = "Hi, $name!",
                        modifier = Modifier.padding(start = 8.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 21.sp,
                            color = Color.Black,
                            fontFamily = JakartaPlus,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.SemiBold,

                            )
                    )
                    Text(
                        text = "Welcome back!",
                        modifier = Modifier.padding(start = 8.dp),
                        style = androidx.compose.ui.text.TextStyle(
                            fontSize = 12.sp,
                            color = Color.Black,
                            fontFamily = JakartaPlus,
                            fontWeight = androidx.compose.ui.text.font.FontWeight.Normal
                        )
                    )
                }
            }

            Icon(
                painter = painterResource(R.drawable.ic_notification),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .padding(end = 8.dp),
                tint = colorResource(R.color.blue)

            )

        }

    }

@Composable
@Preview(showBackground = true)
fun TopBarPreview() {
    TopBar(
        modifier = Modifier,
        name = "John Doe",
        image = painterResource(id = R.drawable.ic_person),
        onClick = {}
    )
}