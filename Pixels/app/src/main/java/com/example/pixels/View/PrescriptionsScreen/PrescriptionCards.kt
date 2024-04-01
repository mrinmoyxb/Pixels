package com.example.pixels.View.PrescriptionsScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pixels.R

@Preview(showBackground = true)
@Composable
fun PrescriptionCards(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .height(310.dp),
        shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(colorResource(id = R.color.blue))) {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)) {
            Column(modifier = Modifier.fillMaxSize()) {
                // Heading
                Row(modifier = Modifier.fillMaxWidth()) {
                    LazyRow(modifier = Modifier
                        .width(200.dp)
                        .height(70.dp), verticalAlignment = Alignment.Bottom) {
                            item {
                                Column() {
                                    Text(
                                        "Heading",
                                        fontSize = 35.sp,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.offset(y = 5.dp)
                                    )
                                    Text(
                                        "01/04/2024",
                                        fontSize = 15.sp,
                                        color = Color.Black,
                                        fontWeight = FontWeight.Medium
                                    )
                                }
                            }
                    }
                    Spacer(modifier = Modifier.width(2.dp))

                    // Doctor's Name
                    LazyRow(modifier = Modifier
                        .width(200.dp)
                        .height(70.dp), verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.End) {
                        item {
                            Column() {
                                Text(
                                    "Doctor's Name",
                                    fontSize = 20.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                        }
                    }
                }
                Divider(modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.Black)
                Spacer(modifier = Modifier.height(8.dp))

                // Clinical Findings
                Text(
                    "Clinical Findings",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
                LazyColumn(modifier = Modifier.fillMaxWidth().height(50.dp)) {
                    item{
                        Text(
                            "***",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Divider(modifier = Modifier.fillMaxWidth(), thickness = 0.5.dp, color = Color.Black)

                // Medicine
                Text(
                    "Medicine",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
                LazyColumn(modifier = Modifier.fillMaxWidth().height(50.dp)) {
                    item{
                        Text(
                            "***",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
                Divider(modifier = Modifier.fillMaxWidth(), thickness = 0.5.dp, color = Color.Black)

                // Advice
                Text(
                    "Advice",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium
                )
                LazyColumn(modifier = Modifier.fillMaxWidth().height(50.dp)) {
                    item{
                        Text(
                            "***",
                            fontSize = 18.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
}