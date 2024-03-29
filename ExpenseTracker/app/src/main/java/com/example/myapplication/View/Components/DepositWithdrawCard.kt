package com.example.myapplication.View.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.myapplication.R

@Composable
fun DepositWithdrawCard(text: String, icon: Painter, height: Int, width: Int, boxColor: Color,
                        fontSize: Int, navHostController: NavHostController, route: String){
    val context = LocalContext.current
    Card(modifier = Modifier
        .height(height.dp)
        .width(width.dp)
        .clickable {
            navHostController.navigate(route)
        },
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(boxColor)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)) {
            Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text,
                        fontSize = fontSize.sp,
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Box(modifier = Modifier.clip(CircleShape).size(20.dp).background(Color.Black).padding(2.dp), contentAlignment = Alignment.Center) {
                        Icon(painter = icon, contentDescription = "", tint = Color.White)
                    }
                }
            }
        }
    }
}
