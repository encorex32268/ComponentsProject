package com.lihan.componentsproject

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Send
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.lihan.componentsproject.component.appbar.AppBar
import com.lihan.componentsproject.component.appbar.MenuID
import com.lihan.componentsproject.component.appbar.MenuItem
import com.lihan.componentsproject.component.tablayout.TabLayout
import com.lihan.componentsproject.ui.theme.ComponentsProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsProjectTheme {
                val context = LocalContext.current
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        AppBar(
                            title = "Hello",
                            menuItems = arrayListOf(
                                MenuItem(
                                    menuID = MenuID.MAIL,
                                    icon = Icons.Default.Mail
                                ),
                                MenuItem(
                                    menuID = MenuID.SEND,
                                    icon = Icons.Default.Send
                                ),
                                MenuItem(
                                    menuID = MenuID.CLOSE,
                                    icon = Icons.Default.Close
                                ),
                                MenuItem(
                                    menuID = MenuID.REFRESH,
                                    icon = Icons.Default.Refresh
                                ),

                            ),
                            onMenuItemClick = {
                                when(it){
                                    is MenuID.MAIL->{
                                        // do mail
                                    }
                                    is MenuID.CLOSE->{
                                        // close ...
                                    }
                                    is MenuID.REFRESH->{
                                        // refresh
                                    }
                                    is MenuID.SEND->{
                                        //send mail ...
                                    }
                                }
                            }
                        ) {

                        }
                    }
                ) {

                    Column(
                        modifier = Modifier.fillMaxSize())
                    {
                        TabLayout(
                            tabItems = arrayListOf(
                                "Tab1","Tab2","Tab3","Tab4","Tab5",
                                "Tab6","Tab7","Tab8","Tab9","Tab10",
                                "Tab11","Tab12","Tab13","Tab14","Tab15",
                            ),
                            onTabClick ={
                                Toast.makeText(context,"${it}",Toast.LENGTH_SHORT).show()
                            })


                    }


                }
            }
        }
    }
}

