package com.example.pixels.View.Components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.pixels.R
import com.example.pixels.ViewModel.EmergencyContactViewModel
@Composable
fun EmergencyCard(icon: Painter, viewModel: EmergencyContactViewModel, number: String, contactName: String){
    val context = LocalContext.current
    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Card(modifier = Modifier
            .height(100.dp)
            .width(100.dp)
            .background(Color.Transparent)
            .clickable {
                viewModel.openDialPad(context, number)
                Toast
                    .makeText(context, "Dialing $contactName", Toast.LENGTH_SHORT)
                    .show()
            },
            shape = RoundedCornerShape(10.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.blue)),
            elevation = CardDefaults.cardElevation(10.dp)
        )
        {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp), contentAlignment = Alignment.Center
            ) {
                Icon(painter = icon, contentDescription = "click here")
            }
        }
        Spacer(modifier = Modifier.height(3.dp))
        Text(contactName, fontWeight = FontWeight.Medium, textAlign =  TextAlign.Center)
    }
}

