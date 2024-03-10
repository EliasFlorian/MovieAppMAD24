package com.example.movieappmad24.composables

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.movieappmad24.models.getMovies

@Composable
fun MovieApp() {
    Scaffold(
        topBar = {
            TopBar()
        },
        bottomBar = {
            BottomBar()
        },
        content = { innerPadding ->
            MovieList(movies = getMovies(), innerPadding = innerPadding)
        }
    )
}