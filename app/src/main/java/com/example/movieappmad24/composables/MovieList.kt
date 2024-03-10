package com.example.movieappmad24.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.movieappmad24.models.Movie

@Composable
fun MovieList(movies: List<Movie>, innerPadding: PaddingValues) {
    LazyColumn(
        modifier = Modifier.consumeWindowInsets(innerPadding),
        contentPadding = innerPadding
    ) {
        items(movies) { movie ->
            MovieRow(movie)
        }
    }
}