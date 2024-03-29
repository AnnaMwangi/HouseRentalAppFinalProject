package com.anna.houserentapp.ui.theme.screens.home

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.anna.houserentapp.R
import com.anna.houserentapp.navigation.ROUTE_ADD_PROFILE
import com.anna.houserentapp.navigation.ROUTE_BOOKING
import com.anna.houserentapp.navigation.ROUTE_LOGIN
import com.anna.houserentapp.navigation.ROUTE_REGISTER

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        Text(
            text = "Rentishwa",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black,
            fontFamily = FontFamily.Monospace,

            )
        Button(
            onClick = {
                navController.navigate(ROUTE_BOOKING)
            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "Book with us a beautiful home from any high-end estates ")

        }
        Button(
            onClick = {
                navController.navigate(ROUTE_LOGIN)
            },
            colors = ButtonDefaults.buttonColors(Color.Black),
            modifier = Modifier.fillMaxWidth()
        )
        {
            Text(text = "Landlords Login Page")

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "Want to rent your dream home?Rentishwa has got you covered",
            modifier = Modifier.padding(20.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold, color = Color.Black,
            fontFamily = FontFamily.Monospace,

            )

        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            Row(modifier = Modifier.padding(start = 5.dp)) {
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalten),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Lower Kabete Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }


                }
                Spacer(modifier = Modifier.width(10.dp))
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalfour),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Kileleshwa Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }


                }

            }
            Spacer(modifier = Modifier.height(15.dp))
            Row(modifier = Modifier.padding(start = 5.dp)) {
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalone),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Ruiru Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }


                Spacer(modifier = Modifier.width(10.dp))
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentaltwo),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Westlands Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Row(modifier = Modifier.padding(start = 5.dp)) {
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalthree),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Karen Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }


                Spacer(modifier = Modifier.width(10.dp))
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalfour),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Lower Kabete Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Row(modifier = Modifier.padding(start = 5.dp)) {
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalfive),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Starehe Rentals",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }


                Spacer(modifier = Modifier.width(10.dp))
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalsix),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Fully furnished",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }

            }
            Spacer(modifier = Modifier.width(10.dp))
            Row(modifier = Modifier.padding(start = 5.dp)) {
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentalseven),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Great Interior Design",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }


                Spacer(modifier = Modifier.width(10.dp))
                Card() {
                    Column {
                        Box(
                            modifier = Modifier
                                .height(150.dp)
                                .width(180.dp),

                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.rentaleight),
                                contentDescription = "",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .size(400.dp)
                            )
                        }
                        Text(
                            text = "Efficient Lighting",
                            textAlign = TextAlign.Center,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = Color.Black
                        )
                    }

                }

            }
        }
    }
}

//
//
//
//
//                Spacer(modifier = Modifier.width(10.dp))
////                Row(modifier = Modifier.padding(start = 5.dp)) {
//                Card() {
//                    Column {
//                        Box(
//                            modifier = Modifier
//                                .height(150.dp)
//                                .width(180.dp),
//
//                            ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.rentalfive),
//                                contentDescription = "",
//                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .fillMaxHeight()
//                                    .size(400.dp)
//                            )
//                        }
//                        Text(
//                            text = "Starehe Rentals",
//                            textAlign = TextAlign.Center,
//                            fontSize = 20.sp,
//                            fontWeight = FontWeight.SemiBold,
//                            color = Color.Black
//                        )
//                    }
//
//                }
//
//
//                Spacer(modifier = Modifier.width(10.dp))
////                Row(modifier = Modifier.padding(start = 5.dp)) {
//                Card() {
//                    Column {
//                        Box(
//                            modifier = Modifier
//                                .height(150.dp)
//                                .width(180.dp),
//
//                            ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.rentalsix),
//                                contentDescription = "",
//                                contentScale = ContentScale.Crop,
//                                modifier = Modifier
//                                    .fillMaxWidth()
//                                    .fillMaxHeight()
//                                    .size(400.dp)
//                            )
//                        }
//                        Text(
//                            text = "Fully Furnished",
//                            textAlign = TextAlign.Center,
//                            fontSize = 20.sp,
//                            fontWeight = FontWeight.SemiBold,
//                            color = Color.Black
//                        )
//                    }
//
//                }
//            }
//
//
//            Spacer(modifier = Modifier.width(10.dp))
//            Card() {
//                Column {
//                    Box(
//                        modifier = Modifier
//                            .height(150.dp)
//                            .width(180.dp),
//
//                        ) {
//                        Image(
//                            painter = painterResource(id = R.drawable.rentalseven),
//                            contentDescription = "",
//                            contentScale = ContentScale.Crop,
//                            modifier = Modifier
//                                .fillMaxWidth()
//                                .fillMaxHeight()
//                                .size(400.dp)
//                        )
//                    }
//                    Text(
//                        text = "Great Interior Design",
//                        textAlign = TextAlign.Center,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.SemiBold,
//                        color = Color.Black
//                    )
//                }
//
//            }
//
//        }
//    }
//    Spacer(modifier = Modifier.width(10.dp))
//
////    Card() {
////        Column {
////            Box(
////                modifier = Modifier
////                    .height(150.dp)
////                    .width(180.dp),
////
////                ) {
////                Image(
////                    painter = painterResource(id = R.drawable.rentaleight),
////                    contentDescription = "",
////                    contentScale = ContentScale.Crop,
////                    modifier = Modifier
////                        .fillMaxWidth()
////                        .fillMaxHeight()
////                        .size(400.dp)
////                )
////            }
////            Text(
////                text = "Efficient Lighting",
////                textAlign = TextAlign.Center,
////                fontSize = 20.sp,
////                fontWeight = FontWeight.SemiBold,
////                color = Color.Black
////            )
////        }
////
//
//
//    Spacer(modifier = Modifier.width(10.dp))
//
//    Button(
//        onClick = {
//            navController.navigate(ROUTE_LOGIN)
//        },
//
//        colors = ButtonDefaults.buttonColors(Color.Black),
//        modifier = Modifier.fillMaxWidth()
//    )
//    {
//        Text(text = "Already a member?Click to Login")
//
//    }


//        Button(
//            onClick = {
//                navController.navigate(ROUTE_BOOKING)
//            },
//            colors = ButtonDefaults.buttonColors(Color.Black),
//            modifier = Modifier.fillMaxWidth()
//        )
//        {
//            Text(text = "Book with us a beautiful home from any high-end estates ")
//
//        }











@Preview
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())

//    CustomAppBar()
}


