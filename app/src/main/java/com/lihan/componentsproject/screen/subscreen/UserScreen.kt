package com.lihan.componentsproject.screen.subscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    name : String ,
    nameTextSize : TextUnit = 18.sp,
    mail : String,
    mailTextSize : TextUnit = 12.sp
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.LightGray)
        ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = name,
            fontWeight = FontWeight.Bold,
            fontSize = nameTextSize
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = mail,
            fontWeight = FontWeight.Bold,
            fontSize = mailTextSize
        )




    }

}