package com.example.myapplication.View.Components

import android.content.ClipData
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R


data class Item(val name: String, @DrawableRes val icon: Int)

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun CustomDropDownMenu(/*options: List<Item>*/){
    var isExpanded by remember{mutableStateOf(false)}
    var deposit by remember{mutableStateOf("Select an expense type")}
    var iconToDisplay by remember { mutableStateOf(R.drawable.bills)}

    val options = listOf(
        Item("Bills", R.drawable.bills),
        Item("Debt", R.drawable.debt),
        Item("Entertainment", R.drawable.entertainment),
        Item("Food", R.drawable.soup),
        Item("Health Insurance", R.drawable.health),
        Item("Housing", R.drawable.home),
        Item("Personal Care", R.drawable.personal),
        Item("Shopping", R.drawable.shopping),
        Item("Transportation", R.drawable.plane),
        Item("Utilities", R.drawable.utilities),

        )

    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .fillMaxWidth()
            .height(70.dp)
            .background(
                color = colorResource(id = R.color.tertiary),
                shape = RoundedCornerShape(20.dp)
            )
    ) {
        ExposedDropdownMenuBox(expanded = isExpanded, onExpandedChange = { isExpanded = !isExpanded }) {

            Row(modifier = Modifier.fillMaxWidth()) {
                Icon(painter = painterResource(id = iconToDisplay), contentDescription = "", modifier = Modifier.size(40.dp))
                TextField(
                    value = deposit,
                    onValueChange = {},
                    modifier = Modifier
                        .menuAnchor()
                        .fillMaxSize(),
                    readOnly = true,
                    textStyle = TextStyle(fontSize = 23.sp, fontWeight = FontWeight.Light),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.Transparent,
                        cursorColor = Color.Black,
                        focusedIndicatorColor = Color.White,
                        unfocusedIndicatorColor = Color.White
                    )
                )
            }

            ExposedDropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                options.forEach { item ->
                    DropdownMenuItem(text = {
                        Row(modifier = Modifier.fillMaxWidth()){
                            Icon(painter = painterResource(id = item.icon), contentDescription = "", modifier = Modifier.size(8.dp))
                            Spacer(modifier = Modifier.width(8.dp))
                            Text(item.name, fontWeight = FontWeight.Bold)
                        }
                                            },
                        onClick = {
                            deposit = item.name
                            iconToDisplay = item.icon
                            isExpanded = false
                    }
                    )
                }
            }

        }
    }
}



