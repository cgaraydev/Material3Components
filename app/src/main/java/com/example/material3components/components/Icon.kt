package com.example.material3components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.material3components.R


@Composable
fun MyIcon1() {
    Icon(
        imageVector = Icons.Rounded.Add,
        contentDescription = "",
        tint = MaterialTheme.colorScheme.primary,
        modifier = Modifier.size(100.dp)
    )
}

@Composable
fun MyIcon2() {
    Icon(
        painter = painterResource(id = R.drawable.ic_home),
        contentDescription = "",
        tint = Color.Red,
        modifier = Modifier.size(150.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun MyIconPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyIcon1()
        Spacer(modifier = Modifier.size(20.dp))
        MyIcon2()
    }
}