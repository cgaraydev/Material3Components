package com.example.material3components.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
@Composable
@ComposableInferredTarget
public fun Button(
    onClick: () -> Unit,
    modifier: Modifier,
    enabled: Boolean,
    shape: Shape,
    colors: ButtonColors,
    elevation: ButtonElevation?,
    border: BorderStroke?,
    contentPadding: PaddingValues,
    interactionSource: MutableInteractionSource,
    content: @Composable() (RowScope.() -> Unit)
): Unit
 */

@Composable
fun MyButton1() {
    var enabled by remember { mutableStateOf(true) }
    Button(
        enabled = enabled,
        modifier = Modifier.fillMaxWidth(0.6f),
        onClick = { enabled = false },
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,
            contentColor = MaterialTheme.colorScheme.onPrimary,
            disabledContainerColor = MaterialTheme.colorScheme.secondary,
            disabledContentColor = MaterialTheme.colorScheme.error
        ),
        border = BorderStroke(3.dp, Color.Black),
        shape = RectangleShape,
        elevation = ButtonDefaults.buttonElevation(10.dp),
    ) {
        Text(text = "PRESS ME!")
    }
}

@Composable
fun MyButton2() {
    val context = LocalContext.current
    OutlinedButton(
        onClick = { Toast.makeText(context, "Calling..", Toast.LENGTH_SHORT).show() },
        modifier = Modifier.size(200.dp, 50.dp),
        border = BorderStroke(2.dp, Color.Black),
        contentPadding = PaddingValues(10.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Call, contentDescription = "")
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = "CALL MOM")
        }
    }
}

@Composable
fun MyButton3() {
    val small = 150.dp
    val medium = 200.dp
    val large = 300.dp

    var width by remember { mutableStateOf(small) }

    ElevatedButton(onClick = {
        width = when (width) {
            small -> medium
            medium -> large
            else -> small
        }
    }, modifier = Modifier.width(width)) {
        Text(text = "Change size")
    }
}


@Preview(showBackground = true)
@Composable
fun MyButtonPreview() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MyButton1()
        Spacer(modifier = Modifier.size(20.dp))
        MyButton2()
        Spacer(modifier = Modifier.size(20.dp))
        MyButton3()
    }
}