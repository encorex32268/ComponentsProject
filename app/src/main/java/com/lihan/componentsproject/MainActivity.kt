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
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.lihan.componentsproject.component.appbar.AppBar
import com.lihan.componentsproject.component.appbar.MenuID
import com.lihan.componentsproject.component.appbar.MenuItem
import com.lihan.componentsproject.component.bottombar.BottomItem
import com.lihan.componentsproject.component.bottombar.MyBottomBar
import com.lihan.componentsproject.component.navigation.Route
import com.lihan.componentsproject.component.tablayout.TabLayout
import com.lihan.componentsproject.screen.HomeScreen
import com.lihan.componentsproject.screen.MailScreen
import com.lihan.componentsproject.screen.ProfileScreen
import com.lihan.componentsproject.screen.subscreen.UserScreen
import com.lihan.componentsproject.ui.theme.ComponentsProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentsProjectTheme {
                val context = LocalContext.current
                val navController = rememberNavController()
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
                    },
                    bottomBar = {
                        MyBottomBar(
                            bottomItems = arrayListOf(
                                BottomItem(
                                    name = "Home",
                                    image = Icons.Default.Home,
                                    route = Route.HOME
                                ),
                                BottomItem(
                                    name = "Mail",
                                    image = Icons.Default.Mail,
                                    route = Route.MAIL
                                ),
                                BottomItem(
                                    name = "Profile",
                                    image = Icons.Default.Person,
                                    route = Route.PROFILE
                                )
                            ),
                            navController = navController)
                    }
                ) {
                    NavHost(navController = navController, startDestination = Route.HOME){

                        composable(Route.HOME){
                            HomeScreen()
                        }
                        composable(Route.MAIL){
                            MailScreen()
                        }
                        composable(Route.PROFILE){
                            ProfileScreen(
                                toCheckUserInfo = { name , mail ->
                                    navController.navigate(
                                        Route.USER + "/$name/$mail"
                                    )
                                }
                            )
                        }
                        composable(
                            route = Route.USER + "/{name}/{mail}" ,
                            arguments = listOf(
                                navArgument("name"){
                                    type = NavType.StringType
                                },
                                navArgument("mail"){
                                    type = NavType.StringType
                                }
                            )
                        ){
                            val name = it.arguments?.getString("name")!!
                            val mail = it.arguments?.getString("mail")!!

                            UserScreen(
                                name = name,
                                mail = mail
                            )

                        }


                    }

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

