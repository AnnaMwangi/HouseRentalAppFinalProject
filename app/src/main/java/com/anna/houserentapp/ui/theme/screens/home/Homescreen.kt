package com.anna.houserentapp.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.anna.houserentapp.data.profileviewmodel
import com.anna.houserentapp.navigation.ROUTE_ADD_PROFILE


@Composable
fun Homescreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue),
        horizontalAlignment = Alignment.CenterHorizontally) {
        var context = LocalContext.current
        var profiledata= profileviewmodel(navController,context)

        Text(text = "Welcome to Homepage",
            color=Color.Cyan,
            fontFamily = FontFamily.Cursive,
            fontSize = 30.sp)
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_ADD_PROFILE)}) {
            Text(text = "Add Product")
        }
        Button(onClick = { navController.navigate(ROUTE_ADD_PROFILE)}) {
            Text(text = "View Product")
        }


    }

}
@Preview
@Composable
fun Homepreview(){
    Homescreen(rememberNavController())


}