package com.lihan.componentsproject.component.appbar

sealed class MenuID {
    object SEND : MenuID()
    object CLOSE : MenuID()
    object REFRESH : MenuID()
    object MAIL : MenuID()
}