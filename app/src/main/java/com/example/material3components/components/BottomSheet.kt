package com.example.material3components.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.material3components.R
import kotlinx.coroutines.launch

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomSheet1() {
    val sheetState = rememberModalBottomSheetState()
    var isSheetOpen by remember { mutableStateOf(false) }
    Box(modifier = Modifier.fillMaxSize()) {
        Button(onClick = { isSheetOpen = true }) {
            Text(text = "Open Bottom Sheet")
        }
        if (isSheetOpen) {
            ModalBottomSheet(onDismissRequest = { isSheetOpen = false }, sheetState = sheetState) {
                Text(text = "Hello World")
                Button(onClick = { isSheetOpen = false }) {
                    Text(text = "Close Bottom Sheet")
                }
                Spacer(modifier = Modifier.size(50.dp))
            }
        }
    }
}

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBottomSheet2() {
    val scaffoldState = rememberBottomSheetScaffoldState()
    val scope = rememberCoroutineScope()
    BottomSheetScaffold(
        scaffoldState = scaffoldState,
        sheetContent = {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = ""
            )
        },
        sheetPeekHeight = 0.dp
    ) {
        Box(Modifier.fillMaxSize()) {
            Button(onClick = { scope.launch { scaffoldState.bottomSheetState.expand() } }) {
                Text(text = "Open Bottom Sheet")
            }
        }
    }
}