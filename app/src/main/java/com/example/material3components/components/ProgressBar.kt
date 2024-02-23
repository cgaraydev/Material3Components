package com.example.material3components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyProgressBar1() {
    var showLoading by remember { mutableStateOf(false) }
    var progressStatus by remember { mutableStateOf(0f) }
    if (showLoading) {
        CircularProgressIndicator(
            color = MaterialTheme.colorScheme.primary,
            strokeWidth = 3.dp
        )
        Spacer(modifier = Modifier.size(20.dp))
        LinearProgressIndicator(
            color = MaterialTheme.colorScheme.secondary,
            progress = progressStatus,
            trackColor = Color.Red
        )
    }
    Button(onClick = { showLoading = !showLoading }) {
        if (showLoading) {
            Text("Hide")
        } else {
            Text("Show")
        }
    }
    Row {
        Button(onClick = { progressStatus += .1f }) {
            Text(text = "Up")
        }
        Spacer(modifier = Modifier.size(20.dp))
        Button(onClick = { progressStatus -= .1f }) {
            Text(text = "Down")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyProgressBarPreview() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyProgressBar1()
    }
}
