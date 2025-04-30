package com.example.loginreg.ui.theme.screens


import android.R.attr.fontWeight
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import com.example.loginreg.R
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Box

import androidx.compose.material3.Text




@Composable
fun splashscreen(navController: NavController){
    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate("login"){
            popUpTo("splash"){inclusive=true}
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color=Color.White),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(id=R.drawable.trump ),
            contentDescription = "splashlogo",
            modifier = Modifier.size(200.dp)
                .clip(CircleShape),
        )
        Text(
            text="",
            fontSize=28.sp,
            color=Color.Blue,
            fontWeight= FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
        )
    }

}
@Preview(showBackground = true)
@Composable
fun preview(){
    val mocknavController = rememberNavController()
    splashscreen(navController = mocknavController)
}
