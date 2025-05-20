package com.example.profileactivity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen() {
    Scaffold(
        Modifier.background(Color.Black.copy(0.9f))
    ){ innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.Black.copy(0.9f))

        ) {
            Column(modifier = Modifier.padding(16.dp)) {


                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back",
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        "Profile",
                        color = Color.White,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        "support", color = Color.Gray, modifier = Modifier
                            .border(1.dp, Color.Gray, RoundedCornerShape(16.dp))
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(id = R.drawable.ic_launcher_foreground), // Replace with your image
                        contentDescription = "Profile Pic",
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text("andaz Kumar", color = Color.White, fontWeight = FontWeight.Bold)
                        Text("member since Dec, 2020", color = Color.Gray)
                    }

                    Spacer(modifier = Modifier.padding(horizontal = 28.dp))

                    Icon(
                        imageVector = Icons.Default.Create,
                        contentDescription = "Create",
                        tint = Color.White,
                        modifier = Modifier.size(32.dp)
                    )
                }

                Spacer(modifier = Modifier.height(24.dp))

                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardColors(
                        containerColor = Color.Black,
                        contentColor = Color.Black,
                        disabledContainerColor = Color.Black,
                        disabledContentColor = Color.Black
                    )
                ) {
                    Row(modifier = Modifier.padding(16.dp)) {
                        Icon(
                            Icons.Default.AccountCircle,
                            contentDescription = null,
                            tint = Color.White
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        Column {
                            Text("get to know your vehicles, inside out", color = Color.White)
                            Text("CRED garage", color = Color.White, fontWeight = FontWeight.Bold)
                        }
                    }
                }

                Spacer(modifier = Modifier.height(24.dp))

                ProfileItem(
                    "credit score",
                    "757",
                    trailingText = "REFRESH AVAILABLE",
                    trailingColor = Color.Green
                )
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp
                )
                ProfileItem("lifetime cashback", "₹3")

                Divider(
                    color = Color.Gray,
                    thickness = 1.dp
                )
                ProfileItem("bank balance", "check")

            }

            Spacer(modifier = Modifier.height(24.dp))

            Column(modifier = Modifier.background(color = Color.Black)) {

                Spacer(modifier = Modifier.padding(vertical = 8.dp))

                Text("YOUR REWARDS & BENEFITS", color = Color.Gray, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 16.dp))



                ProfileItem2("cashback balance", "₹0")

                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(start = 12.dp, end = 12.dp)
                )


                ProfileItem2("coins", "26,46,583")
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(start = 12.dp, end = 12.dp)
                )

                ProfileItem2("win upto Rs 1000", "refer and earn")

                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.padding(start = 12.dp, end = 12.dp)
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text("TRANSACTIONS & SUPPORT", color = Color.Gray, fontWeight = FontWeight.Bold, modifier = Modifier.padding(16.dp))
                ProfileItem2("all transactions", "")
            }
        }
    }
}
@Composable
fun ProfileItem(title: String, value: String, trailingText: String? = null, trailingColor: Color = Color.Gray) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(title, color = Color.Gray, modifier = Modifier.padding( start = 16.dp, end = 16.dp))
        }
        if (trailingText != null) {
            Text(trailingText, color = trailingColor, fontSize = 12.sp, modifier = Modifier.padding(end = 8.dp))
        }
        Text(value, color = Color.White, fontWeight = FontWeight.SemiBold,modifier = Modifier.padding(start = 16.dp, end = 16.dp))
    }
}

@Composable
fun ProfileItem2(title: String,value: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(title, color = Color.Gray, modifier = Modifier.padding( start = 16.dp))

            Text(value, color = Color.Gray, modifier = Modifier.padding( start = 16.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        Icon(
            imageVector = Icons.Default.KeyboardArrowRight,
            contentDescription = "arrow",
            tint = Color.Gray,
            modifier = Modifier.padding(end = 12.dp)
        )
    }
}
