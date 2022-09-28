package com.lihan.componentsproject.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random

@Composable
fun ProfileScreen(
    modifier: Modifier = Modifier,
    title : String = "Profile Screen",
    titleSize : TextUnit = 24.sp,
    toCheckUserInfo : (String,String) -> Unit
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            fontSize = titleSize,
            color = Color.Black
        )
        Spacer(modifier = Modifier.height(5.dp))
        Button(
            onClick = {
                val name = "user ${Random.nextInt(100)}"
                val mail = "email@${Random.nextInt(33)}"
                toCheckUserInfo(
                    name,mail
                )
            }
        ) {
            Text(text = "Check User")
        }

    }

}