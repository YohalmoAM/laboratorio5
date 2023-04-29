package com.example.laboratorio6.ui

import android.app.Application
import com.example.laboratorio6.data.model.movies
import com.example.laboratorio6.repository.MovieRepository

class MovieReviewerApplication : Application(){
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies) }
}