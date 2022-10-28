package com.lihan.componentsproject.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawStyle
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MailScreen(
    modifier: Modifier = Modifier,
    title : String = "Mail Screen",
    titleSize : TextUnit = 24.sp
) {
//    Column(
//        modifier = modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Text(
//            text = title,
//            fontWeight = FontWeight.Bold,
//            fontSize = titleSize,
//            color = Color.Black
//        )
//    }
//

    Box(modifier = Modifier
        .fillMaxSize()
        .drawBehind {
            drawCircle(
                color = Color.Green,
                style = Stroke(
                    width = 5f
                ),
                center = Offset(
                    x = 100f,
                    y = 200f
                )
            )
        }

    )


}