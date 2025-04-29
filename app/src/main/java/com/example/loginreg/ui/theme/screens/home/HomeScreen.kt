package com.example.loginreg.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Text
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.loginreg.navigation.ROUTE_HOME
import com.example.loginreg.navigation.ROUTE_LOGIN
import com.example.loginreg.navigation.ROUTE_REGISTER


@Composable
fun Home_Screen(navController:NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()

            .background(Color.LightGray)
    ){
     Text(
         text="welcome",
         fontSize= 30.sp,
         fontFamily = FontFamily.Monospace,

     )
        Spacer(modifier= Modifier.height(30.dp))
        Text(
            "welcome to my domain",
            fontSize= 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta,

            )


        Button(onClick = {navController.navigate(ROUTE_HOME)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Black))

        {Text("home",
            color = Color.LightGray,
            fontSize = 30.sp) }


        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Black))

        {Text("login",
            color = Color.LightGray,
            fontSize = 30.sp) }


        Button(onClick = {navController.navigate(ROUTE_REGISTER)},
            modifier = Modifier.width(300.dp),
            colors = ButtonDefaults.buttonColors(Color.Black))

        {Text("register",
            color = Color.LightGray,
            fontSize = 30.sp) }


    }
}
@Preview
@Composable
fun loginprev(){
    Home_Screen(rememberNavController())
}


