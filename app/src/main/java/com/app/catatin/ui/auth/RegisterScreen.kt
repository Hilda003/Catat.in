package com.app.catatin.ui.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.SemiBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.component.GradientLogo
import com.app.catatin.component.RegisterForm
import com.app.catatin.utils.JakartaPlus

@Composable
@Preview
fun RegisterScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.TopCenter)
                .background(color = Color.White)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.55f)
                    .clip(RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp))
                    .background(color = colorResource(id = R.color.blue))
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))
            GradientLogo()
        }
        Spacer(modifier = Modifier.height(30.dp))

        Card(
            modifier = Modifier.padding(24.dp)
                .align(Alignment.Center)
                .fillMaxHeight(0.75f),
            shape = RoundedCornerShape(26.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)

        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "Register",
                    style = TextStyle(
                        fontFamily = JakartaPlus,
                        fontWeight = SemiBold,
                        fontSize = 32.sp
                    ),
                    color = Color.Black,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Fill your information below",
                    style = TextStyle(
                        fontFamily = JakartaPlus,
                        fontWeight = FontWeight.Normal,
                        fontSize = 13.sp
                    ),
                    color = Color.Black,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                )
                Spacer(modifier = Modifier.height(35.dp))
                RegisterForm()
            }

        }
    }
}
