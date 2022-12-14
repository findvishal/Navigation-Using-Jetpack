package com.example.navigation

sealed class NavigationItem(val route:String){

    object Home:NavigationItem("home")
    object Details: NavigationItem("details/{name}")

}