package com.example.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun FirstScreen(navigateToSecondScreen: () -> Unit) {
    OuterComposable {
//        var count by rememberSaveable {
//            mutableIntStateOf(0)
//        }
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "First Screen", fontSize = 48.sp)
//            Button(onClick = { count++ }) {
//                Text(text = "Count: $count")
//            }
            Button(onClick = {
                navigateToSecondScreen()
            }) {
                Text(text = "Navigate to 2nd Screen")
            }
        }
    }
}
