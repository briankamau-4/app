package com.example.loginreg.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginreg.ui.theme.screens.home.Home_Screen
import com.example.loginreg.ui.theme.screens.login.Login
import com.example.loginreg.ui.theme.screens.register.register

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController= rememberNavController(),
    startDestination: String= ROUTE_HOME
) {
NavHost(modifier = modifier, startDestination = startDestination, navController = navController){
    composable(ROUTE_HOME){ Home_Screen(navController)}
    composable(ROUTE_LOGIN){ Login(navController) }
    composable(ROUTE_REGISTER){ register(navController) }



}
}
