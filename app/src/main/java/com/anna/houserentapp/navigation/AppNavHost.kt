package com.anna.houserentapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.anna.houserentapp.ui.theme.screens.Register.RegisterScreen
import com.anna.houserentapp.ui.theme.screens.booking.BookingScreen
import com.anna.houserentapp.ui.theme.screens.contactus.ContactUs
//import com.anna.houserentapp.ui.theme.screens.contactus.Contactus
import com.anna.houserentapp.ui.theme.screens.home.HomeScreen
//import com.anna.houserentapp.ui.theme.screens.home.Homescreen
import com.anna.houserentapp.ui.theme.screens.login.Loginscreen


import com.anna.houserentapp.ui.theme.screens.profiless.AddProfile
import com.anna.houserentapp.ui.theme.screens.profiless.Updateprofile

import com.anna.houserentapp.ui.theme.screens.profiless.Viewprofile

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination:String= ROUTE_HOME) {

    NavHost(
        navController = navController,
        modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            Loginscreen(navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController)

        }

        composable(ROUTE_HOME) {
            HomeScreen(navController)

        }
        composable(ROUTE_ADD_PROFILE) {
            AddProfile(navController)
        }


        composable(ROUTE_VIEW_PROFILE) {
            Viewprofile(navController)

        }
        composable(ROUTE_UPDATE_PROFILE + "/{id}") { passedData ->
            Updateprofile(navController, passedData.arguments?.getString("id")!!)
        }
        composable(ROUTE_CONTACTUS){
            ContactUs(navController)
        }
        composable(ROUTE_BOOKING){
            BookingScreen(navController)
        }




    }
}
