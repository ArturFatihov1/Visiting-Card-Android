package com.example.android_test_4

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_test_4.ui.theme.Android_Test_4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitingCard()
        }
    }
}

@Composable
fun VisitingCard() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFD2E8D4))
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color(0xFF073042))
                    .width(100.dp)
                    .height(100.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android_logo),
                    contentDescription = "image"
                )
            }
            Text(
                text = "Artur Fatihov",
                fontSize = 35.sp,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(
                text = "Android Developer Extraordinaire", color = Color(0xFF2E8458),
                fontWeight = FontWeight.Bold
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize().padding(top = 500.dp),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier.fillMaxSize(0.5f),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.Start
            ){
                Row(modifier = Modifier.padding(bottom = 10.dp)){
                    Icon(imageVector = Icons.Default.Phone, contentDescription = null,
                        modifier = Modifier.padding(end = 15.dp))
                    Text(text = "+7 987 587 0426")
                }
                Row(modifier = Modifier.padding(bottom = 10.dp)){
                    Icon(imageVector = Icons.Default.Share, contentDescription = null,
                        modifier = Modifier.padding(end = 15.dp))
                    Text(text = "@AndroidDev")
                }
                Row(modifier = Modifier.padding(bottom = 10.dp)) {
                    Icon(imageVector = Icons.Default.Email, contentDescription = null,
                        modifier = Modifier.padding(end = 15.dp))
                    Text(text = "artur.fatihov23@mail.ru")
                }
            }
        }
    }
}







