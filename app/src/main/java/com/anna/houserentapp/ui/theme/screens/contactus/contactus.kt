package com.anna.houserentapp.ui.theme.screens.contactus

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.anna.houserentapp.MainActivity
import com.anna.houserentapp.R
import com.anna.houserentapp.Splashscreen
import com.google.android.play.integrity.internal.m


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ContactUs(navController: NavHostController) {

    val mContext = LocalContext.current

    Column(modifier = Modifier.fillMaxSize()) {

        //TopAppBar
        TopAppBar(title = {
            Text(
                text = "You can reach us through:",
                color = Color.Black,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        },
            colors = TopAppBarDefaults.largeTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(
                        Intent(
                            mContext,
                            Splashscreen::class.java
                        )
                    )
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "arrowback")
                }

            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Share, contentDescription = "share")
                }
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Settings, contentDescription = "settings")
                }
            }
        )
        OutlinedButton(onClick = {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("annnmwangi02@gmail.com"))
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email")
            mContext.startActivity(shareIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "EMAIL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))
        //CALL
        OutlinedButton(onClick = {
            val callIntent=Intent(Intent.ACTION_DIAL)
            callIntent.data="tel:0727452002".toUri()
            mContext.startActivity(callIntent)
        },
            modifier = Modifier
                .size(width = 380.dp, height = 70.dp)
                .padding(start = 20.dp, end = 20.dp, top = 20.dp),
            shape = CutCornerShape(5.dp), border = BorderStroke(3.dp, Color.Black)
        ) {
            Text(text = "CALL",
                color = Color.Black,
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp)
        }



    }

}





@Preview
@Composable
fun contactus(){
   ContactUs(rememberNavController())
}