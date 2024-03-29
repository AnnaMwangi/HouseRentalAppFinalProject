package com.anna.houserentapp.ui.theme.screens.Register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.anna.houserentapp.R
import com.anna.houserentapp.data.AuthViewModel
import com.anna.houserentapp.navigation.ROUTE_LOGIN
import com.anna.houserentapp.navigation.ROUTE_REGISTER

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController){
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var pass by remember { mutableStateOf(TextFieldValue("")) }
    var confirmpass by remember { mutableStateOf(TextFieldValue("")) }
    var context= LocalContext.current

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top=20.dp)
    ){
        Spacer(modifier = Modifier.height(50.dp))
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.animation_lmrmwnsa))
        val progress by animateLottieCompositionAsState(composition )

        LottieAnimation(composition , progress,
            modifier =Modifier.size(50.dp))
    }





    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text="Register here",
            color = Color.Black,
            fontFamily = FontFamily.Default,
            fontSize=30.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = email, onValueChange = {email=it},
            label={ Text(text="Enter Email") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction= ImeAction.Next),
            modifier= Modifier
                .fillMaxWidth()
                .padding(8.dp),
            colors = TextFieldDefaults.run {
                textFieldColors(
                    textColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            },
            singleLine = true,
            leadingIcon = { Icon(imageVector= Icons.Default.Email,contentDescription="") }

            )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = pass, onValueChange ={pass=it} ,
            label={ Text(text = "Enter password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(),
            colors = TextFieldDefaults.run {
                textFieldColors(
                    textColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            },
            singleLine = true,

            leadingIcon = { Icon(imageVector= Icons.Default.Lock,contentDescription="") }
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = confirmpass, onValueChange ={confirmpass=it} ,
            label={ Text(text = "Confirm password") },
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(),
            colors = TextFieldDefaults.run {
                textFieldColors(
                    textColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                )
            },
            singleLine = true,
            leadingIcon = { Icon(imageVector= Icons.Default.Lock,contentDescription="") }
        )

        Button(onClick = {
            val myregister= AuthViewModel(navController, context)
            myregister.signup(email.text.trim(),pass.text.trim(),confirmpass.text.trim())

        },
            colors=ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")

        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            navController.navigate(ROUTE_LOGIN)
        },
        colors = ButtonDefaults.buttonColors(Color.Black)
        ) {
            Text(text = "Already have a landlord account?Click to Login")

        }
    }

}
@Preview
@Composable
fun Registerpage(){
    RegisterScreen(rememberNavController())
}

