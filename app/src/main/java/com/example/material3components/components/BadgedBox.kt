package com.example.material3components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBadgedBox1() {
    BadgedBox(
        badge = {
            Badge {
                Text(text = "2")
            }
        },
        modifier = Modifier.size(30.dp)
    ) {
        Icon(
            imageVector = Icons.Default.MailOutline,
            contentDescription = "",
            modifier = Modifier.size(30.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyBadgedBoxPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyBadgedBox1()
        Spacer(modifier = Modifier.size(20.dp))
    }
}