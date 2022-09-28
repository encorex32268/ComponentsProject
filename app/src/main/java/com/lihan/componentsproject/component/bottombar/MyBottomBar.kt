package com.lihan.componentsproject.component.bottombar

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun MyBottomBar(
    modifier: Modifier = Modifier,
    bottomItems : List<BottomItem> ,
    navController: NavController,
    itemTextSize : TextUnit = 12.sp

) {
    val backStackEntry = navController.currentBackStackEntryAsState()

    BottomNavigation {
        bottomItems.forEach {
            val selected = it.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
                modifier = modifier.background(Color.White),
                selected = selected,
                onClick = { navController.navigate(it.route) },
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(
                            imageVector = it.image,
                            contentDescription = "${it.route}",
                            tint = Color.Black
                        )
                        Spacer(modifier = modifier.height(2.dp))
                        Text(
                            text = it.name,
                            fontSize = itemTextSize,
                            color = Color.Black
                        )
                    }
                }
            )
        }

    }


}