package com.example.loginreg.ui.theme.screens.login
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import androidx.navigation.NavHostController


@Composable
fun Login(navController: NavHostController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
            .padding(16.dp)
    ){

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text="Welcome back",
            fontSize=40.sp,
            fontFamily = FontFamily.Monospace,
            color=Color.Blue)

        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text="Already have an account?please enter:",

            fontSize=40.sp,
            fontFamily = FontFamily.Monospace,
            color=Color.Blue

        )
        Spacer(modifier = Modifier.height(16.dp))
        var email by remember{ mutableStateOf("") }
        var password by remember{ mutableStateOf("") }
        OutlinedTextField(
            value = email,
            onValueChange = {email=it},
            label = { Text(  "Email addr") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = password ,
            onValueChange = {password=it},
            label = { Text(  "Password") },
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {}) {
            Text(text="login")
        }
        Spacer(modifier = Modifier.height(25.dp))
        TextButton(onClick = {}) {
            Text("Don't have an account?Register here")
        }
    }
}
