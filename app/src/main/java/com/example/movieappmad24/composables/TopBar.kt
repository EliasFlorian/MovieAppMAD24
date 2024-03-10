package com.example.movieappmad24.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {

        CenterAlignedTopAppBar(
            title = { Text("Movie App") }
        )


}