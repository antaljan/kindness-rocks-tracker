package com.antaljan.kindnessrockstracker.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(onNavigateToMap: () -> Unit, onNavigateToCamera: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Kindness Rocks Tracker", fontSize = 24.sp, modifier = Modifier.padding(16.dp))

        Button(onClick = onNavigateToMap, modifier = Modifier.padding(8.dp)) {
            Text("Térkép megtekintése")
        }

        Button(onClick = onNavigateToCamera, modifier = Modifier.padding(8.dp)) {
            Text("Kavics fotózása")
        }
    }
}

