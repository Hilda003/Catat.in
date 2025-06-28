package com.app.catatin.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.component.CardBalance
import com.app.catatin.component.FinanceCard
import com.app.catatin.component.TopBar
import com.app.catatin.utils.JakartaPlus


@Composable
fun HomeScreen (
    modifier: Modifier = Modifier,
    onClick: () -> Unit = { /* No-op by default */ }
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        TopBar(
            modifier = Modifier,
            name = "John",
            image = painterResource(id = R.drawable.ic_person),
            onClick = { /* No-op by default */ }
        )

        CardBalance(
            amount = 3000000,
        )
        Row(
            modifier = Modifier.padding(top = 16.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            FinanceCard(
                modifier = Modifier,
                title = "Income",
                amount = 5000000,
                icon = painterResource(id = R.drawable.ic_income),
                backgroundColor = colorResource(R.color.yellow)
            )
            FinanceCard(
                modifier = Modifier,
                title = "Expense",
                amount = 2000000,
                icon = painterResource(id = R.drawable.ic_expense),
                backgroundColor = colorResource(R.color.yellow_200)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Recent Transaction",
                style = TextStyle(
                    fontFamily = JakartaPlus,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            )

            Spacer(modifier = Modifier.weight(1f))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.clickable {  }
            ) {
                Text(
                    text = "See all",
                    style = TextStyle (
                        fontFamily = JakartaPlus,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 13.sp,
                        color = Color.Black
                    )
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier.size(16.dp)
                )
            }
        }


        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {  }


    }
}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview() {
    HomeScreen()
}