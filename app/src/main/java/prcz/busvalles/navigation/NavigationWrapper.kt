package prcz.busvalles.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import prcz.busvalles.login.LoginFormScreen
import prcz.busvalles.login.LoginScreen
import prcz.busvalles.map.MapScreen
import prcz.busvalles.singup.SingupScreen

@Composable
fun NavigationWrapper () {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Login){
        composable<Login> {
            LoginScreen( navigateToHome = { navController.navigate(LoginForm)  }, navigateToRegister = { navController.navigate(Signup) } )
        }

        composable<LoginForm> {
            LoginFormScreen( navigateToMap =  { navController.navigate(MainMap) }, goBack = { navController.popBackStack() } )
        }

        composable<Signup> {
            SingupScreen( navigateToMap = { navController.navigate(MainMap) }, goBack = { navController.popBackStack() })
        }

        composable<MainMap> {
            MapScreen()
        }
    }
}