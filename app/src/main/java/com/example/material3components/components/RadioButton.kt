package com.example.material3components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyRadioButton1() {
    var state by remember { mutableStateOf(false) }
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = state,
            enabled = true,
            onClick = { state = !state },
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colorScheme.primary,
                unselectedColor = MaterialTheme.colorScheme.secondary
            )
        )
        Text(text = "Example 1", modifier = Modifier.padding(start = 8.dp))
    }
}

@Composable
fun MyRadioButton2() {
    val numbers = listOf(
        "One",
        "Two",
        "Three",
        "Four"
    )
    var state by remember { mutableStateOf(numbers[0]) }

    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ) {
        numbers.forEach {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .selectable(selected = state == it, onClick = { state = it }),
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(selected = state == it, onClick = { state = it })
                Spacer(modifier = Modifier.size(20.dp))
                Text(text = it, modifier = Modifier.padding(start = 8.dp))
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MyRadioButtonPreview() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyRadioButton1()
        Spacer(modifier = Modifier.size(20.dp))
        MyRadioButton2()

    }
}