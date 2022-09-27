package com.lihan.componentsproject.component.tablayout

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun TabLayout(
    tabItems : List<String>,
    modifier: Modifier = Modifier,
    onTabClick: (String) -> Unit
) {
    val tabIndex by remember{
        mutableStateOf(0)
    }
    ScrollableTabRow(
        modifier = modifier.fillMaxWidth(),
        selectedTabIndex = tabIndex
    ) {
        tabItems.forEachIndexed { index, string ->
            Tab(
                selected = tabIndex == index,
                onClick = {
                    onTabClick(string)
                })
            {
                Text(text = string)
            }
        }

    }

}