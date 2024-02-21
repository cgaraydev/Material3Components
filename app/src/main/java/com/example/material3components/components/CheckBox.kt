package com.example.material3components.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyCheckBox1() {
    var state by remember { mutableStateOf(false) }
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxWidth()
    ) {
        Checkbox(
            checked = state,
            onCheckedChange = { state = it },
            enabled = true,
            modifier = Modifier
        )
        Spacer(modifier = Modifier.size(40.dp))
        Text(text = "OPTION 1", fontSize = 24.sp)
    }
}

@Composable
fun MyCheckBox2() {
    var status by remember { mutableStateOf(ToggleableState.On) }
    TriStateCheckbox(
        state = status,
        onClick = {
            status = when (status) {
                ToggleableState.On -> ToggleableState.Off
                ToggleableState.Off -> ToggleableState.Indeterminate
                ToggleableState.Indeterminate -> ToggleableState.On
            }
        },
        colors = CheckboxDefaults.colors(
            checkedColor = MaterialTheme.colorScheme.primary,
            uncheckedColor = MaterialTheme.colorScheme.secondary,
            checkmarkColor = MaterialTheme.colorScheme.onPrimary,
            disabledCheckedColor = MaterialTheme.colorScheme.error,
            disabledUncheckedColor = MaterialTheme.colorScheme.error
        ),
    )
}


@Preview(showBackground = true)
@Composable
fun MyCheckBoxPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyCheckBox1()
        Spacer(modifier = Modifier.size(20.dp))
        MyCheckBox2()
    }
}