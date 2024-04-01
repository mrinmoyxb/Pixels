package com.example.pixels.View.PrescriptionsScreen

import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pixels.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PrescriptionsScreen() {
    var heading by remember { mutableStateOf("") }
    var doctorName by remember { mutableStateOf("") }
    var clinicalFindings by remember { mutableStateOf("") }
    var medicine by remember { mutableStateOf("") }
    var advice by remember{ mutableStateOf("")}

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(10.dp)
    )
    {
        item {
            // Heading
            TextField(
                value = heading, onValueChange = { heading = it },
                placeholder = { Text("Diagnosis", fontSize = 20.sp, color = Color.Black) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                ),
                maxLines = 1
            )
            Spacer(modifier = Modifier.height(5.dp))

            // Doctor's Name
            TextField(
                value = doctorName, onValueChange = { doctorName = it },
                placeholder = { Text("Prescribed by", fontSize = 20.sp, color = Color.Black) },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(15.dp))

            // Clinical Findings
            Card(
                modifier = Modifier
                    .height(400.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(colorResource(id = R.color.blue))
            ) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    TextField(
                        value = clinicalFindings, onValueChange = { clinicalFindings = it },
                        placeholder = {
                            Text(
                                "Clinical Findings",
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))

            // Medicine
            Card(
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(colorResource(id = R.color.green))
            ) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    TextField(
                        value = medicine, onValueChange = { medicine = it },
                        placeholder = {
                            Text(
                                "Medicine Names",
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent
                        )
                    )
                }
            }
            Spacer(modifier = Modifier.height(15.dp))

            // Special Concerns
            Card(
                modifier = Modifier
                    .height(100.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(20.dp),
                colors = CardDefaults.cardColors(colorResource(id = R.color.pink))
            ) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .padding(10.dp)) {
                    TextField(
                        value = advice, onValueChange = { advice = it },
                        placeholder = {
                            Text(
                                "Advice",
                                fontSize = 20.sp,
                                color = Color.Black
                            )
                        },
                        modifier = Modifier.fillMaxWidth(),
                        shape = RoundedCornerShape(20.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent
                        )
                    )
                }
            }

            // Save Button
            Spacer(modifier = Modifier.height(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp), colors = CardDefaults.cardColors(Color.Black))
            {
                Box(modifier= Modifier.fillMaxSize().padding(10.dp), contentAlignment = Alignment.Center)
                {
                    Text("Save Prescription", color = Color.White, fontWeight = FontWeight.SemiBold, fontSize = 20.sp)
                }
            }
        }
    }
}