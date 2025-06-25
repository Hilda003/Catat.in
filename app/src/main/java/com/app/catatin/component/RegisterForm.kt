package com.app.catatin.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus

@Composable
@Preview(showBackground = true)
fun RegisterForm() {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordConfirm by remember { mutableStateOf("") }

    Column {
        FieldText(
            value = username,
            onValueChange = { username = it },
            placeholder = "Username"
        )
        Spacer(modifier = Modifier.height(16.dp))
        FieldText(
            value = email,
            onValueChange = { email = it },
            placeholder = "Email",
        )
        Spacer(modifier = Modifier.height(16.dp))
        FieldText(
            value = password,
            onValueChange = { password = it },
            placeholder = "Password",
            isPassword = true
        )
        Spacer(modifier = Modifier.height(16.dp))
        FieldText(
            value = passwordConfirm,
            onValueChange = { passwordConfirm = it },
            placeholder = "Confirm Password",
            isPassword = true
        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFEDA75)),
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(16.dp)
        ) {
            Text("Login",
                fontFamily = JakartaPlus,
                fontWeight = FontWeight.SemiBold,
                fontSize = 17.sp,
                color = Color.Black)

        }
        Spacer(modifier = Modifier.height(16.dp))
        DividerWithText("Or")
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(
                onClick = { /*TODO*/ },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = "Google Icon",
                    modifier = Modifier.size(32.dp),
                    tint = Color.Unspecified
                )
            }
            IconButton(
                onClick = { /*TODO*/ },
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_facebook),
                    contentDescription = "Facebook Icon",
                    modifier = Modifier.size(32.dp),
                    tint = Color.Unspecified
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text("You don’t have an account? ",
                fontFamily = JakartaPlus,
                fontWeight = FontWeight.Normal,
                fontSize = 13.sp,
                color = Color.Gray)
            Text(
                text = "Login",
                color = colorResource(id = R.color.yellow),
                fontFamily = JakartaPlus,
                fontWeight = FontWeight.Normal,
                textDecoration = TextDecoration.Underline,
                fontSize = 13.sp,
            )
        }
    }
}
