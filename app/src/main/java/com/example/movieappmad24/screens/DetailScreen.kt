package com.example.movieappmad24.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import com.example.movieappmad24.models.getMovies
import com.example.movieappmad24.viewmodels.MoviesViewModel
import com.example.movieappmad24.widgets.HorizontalScrollableImageView
import com.example.movieappmad24.widgets.MovieRow
import com.example.movieappmad24.widgets.SimpleTopAppBar
import com.example.movieappmad24.widgets.Player

@Composable
fun DetailScreen(
    movieId: String?,
    navController: NavController,
    //onFavoriteClick: (String) -> Unit,
    moviesViewModel: MoviesViewModel
) {

    movieId?.let {
        val movie = moviesViewModel.movies.filter { movie -> movie.id == movieId }[0]

        Scaffold (
            topBar = {
                SimpleTopAppBar(title = movie.title) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(
                            imageVector = Icons.Filled.ArrowBack,
                            contentDescription = "Go back"
                        )
                    }
                }
            }
        ){ innerPadding ->
            Column(modifier = Modifier.padding(innerPadding)) {
                MovieRow(movie = movie)
                Player(movie)
                HorizontalScrollableImageView(movie = movie)


            }
        }
    }
}