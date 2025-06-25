package com.app.catatin.component

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.app.catatin.R


@Composable
@Preview(showBackground = true)
fun CardBackground() {
    Card(
        colors = CardDefaults.cardColors(colorResource(id = R.color.white)),
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {

    }


}

