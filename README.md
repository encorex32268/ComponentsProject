# ComponentsProject


### AppBar

<img src="https://github.com/encorex32268/ComponentsProject/blob/master/image_appbar.png" width="300">

  https://github.com/encorex32268/ComponentsProject/tree/master/app/src/main/java/com/lihan/componentsproject/component/appbar

##

### TabLayout

<img src="https://github.com/encorex32268/ComponentsProject/blob/master/image_tablayout.PNG" width="300">


https://github.com/encorex32268/ComponentsProject/tree/master/app/src/main/java/com/lihan/componentsproject/component/tablayout

##

### BottomNavigation Bar (Navigation)

BottomBar

<img src="https://github.com/encorex32268/ComponentsProject/blob/master/image_bottombar.png" width="300">

https://github.com/encorex32268/ComponentsProject/tree/master/app/src/main/java/com/lihan/componentsproject/component/bottombar

Navigation Parameter 

<img src="https://github.com/encorex32268/ComponentsProject/blob/master/image_navigation.png" width="300">


https://github.com/encorex32268/ComponentsProject/tree/master/app/src/main/java/com/lihan/componentsproject/MainActivity.kt

Put Parameter :

ProfileScreen to UserScreen
```
MainActivity.kt
            composable(
                ProfileScreen(
                                toCheckUserInfo = { name , mail ->
                                    navController.navigate(
                                        Route.USER + "/$name/$mail"
                                    )
                                }
                            )
                )            
```

Get Parameter :

UserScreen
```
MainActivity.kt

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

```



Install Navigation 
```
build.gralde (Project)
    
    buildscript {
        ext {
        compose_version = '1.1.0-beta01'
        nav_version = "2.5.2"
    }

build.gralde (APP)
    
    dependencies{
        // Kotlin
        implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
        implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
        // Feature module Support
        implementation("androidx.navigation:navigation-dynamic-features-fragment:$nav_version")
        // Testing Navigation
        androidTestImplementation("androidx.navigation:navigation-testing:$nav_version")
        // Jetpack Compose Integration
        implementation("androidx.navigation:navigation-compose:$nav_version")
    }
    
```

##

### Circle Image



##

### DrawerView


##

### BottomSheet


##
