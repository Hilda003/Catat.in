package com.app.catatin.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.catatin.R
import com.app.catatin.utils.JakartaPlus


@Composable
fun SubmitButton(
    onClick: () -> Unit,
    text: String = "Submit",

    )
{
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = colorResource(id = R.color.yellow)),
        shape = RoundedCornerShape(10.dp),

    ) {
        Text(
            text = text,
            fontFamily = JakartaPlus, fontWeight = FontWeight.SemiBold, fontSize = 17.sp,
            color = colorResource(id = R.color.black)
        )

    }
}

@Composable
@Preview
fun SubmitButtonPreview() {
    SubmitButton(onClick = { /* Do something */ }, text = "Login")
}