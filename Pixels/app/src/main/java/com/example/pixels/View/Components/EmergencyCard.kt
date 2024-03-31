package com.example.pixels.View.Components

import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.pixels.Model.EmergencyContact.EmergencyContact
import com.example.pixels.R
import com.example.pixels.ViewModel.EmergencyContactViewModel
@Composable
fun EmergencyCard(@DrawableRes icon: Int, viewModel: EmergencyContactViewModel){
    val context = LocalContext.current
    Card(modifier = Modifier
        .height(100.dp)
        .width(100.dp)
        .clickable{viewModel.openDialPad(context, "111111")
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        }){
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp), contentAlignment = Alignment.Center){
            Icon(painter = painterResource(id = icon), contentDescription = "click here")
        }
    }
}

