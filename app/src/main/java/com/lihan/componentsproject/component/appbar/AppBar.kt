package com.lihan.componentsproject.component.appbar

import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppBar(
    title : String ,
    menuItems: List<MenuItem>,
    onMenuItemClick : (MenuID) -> Unit,
    navigationIcon : @Composable () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = title)
        },
        actions = {
            Row {
                menuItems.forEach {
                    IconButton(onClick = {
                        onMenuItemClick(it.menuID)
                    }) {
                        Icon(
                            imageVector = it.icon,
                            contentDescription = "${it.menuID}"
                        )
                    }
                }
            }
        },
        navigationIcon = {
            navigationIcon
        }
    )
}