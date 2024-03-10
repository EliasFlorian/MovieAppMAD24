package com.example.movieappmad24.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun BottomBar() {
    NavigationBar {
        val items = listOf("Home", "Watchlist")
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    when (item) {
                        "Home" -> Icon(Icons.Filled.Home, contentDescription = "Home")
                        "Watchlist" -> Icon(Icons.Filled.Star, contentDescription = "Watchlist")
                    }
                },
                label = { Text(item) },
                selected = item == "Home",
                onClick = { /*TODO*/ }
            )
        }
    }
}