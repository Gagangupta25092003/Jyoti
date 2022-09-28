package guptagagan2509.com.jyoti

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import guptagagan2509.com.jyoti.ui.theme.LightThemeColor


@Composable
fun SetupNavGraph(navController : NavHostController){
    NavHost(
        navController =navController,
        startDestination = Screen.Intro.route){
        composable(
            route = Screen.Intro.route,
        ){
            letsShop(mod = Modifier.fillMaxSize(),navController = navController)
        }

        composable(
            route = Screen.Login.route,
        ){
            LoginActivityMain(modifier = Modifier.fillMaxSize(), navController = navController)
        }
        composable(
            route = Screen.Main.route,
        ){
            MainJyotiPage(modifier = Modifier.fillMaxSize())
        }
    }
}