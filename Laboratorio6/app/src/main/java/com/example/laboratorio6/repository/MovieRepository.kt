package com.example.laboratorio6.repository

import com.example.laboratorio6.data.model.MovieModel

class MovieRepository (private val movies: MutableList<MovieModel>){
    fun getMovies() = movies
    fun addMovies(movie: MovieModel) = movies.add(movie)
}