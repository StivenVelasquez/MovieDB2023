package com.stivenvelasquez.moviedb2023.server.repository

import com.stivenvelasquez.moviedb2023.server.MovieDB
import com.stivenvelasquez.moviedb2023.server.model.MoviesList

class MoviesRepository {

    private val apiKey = "7d46f37a75cbcbded6b691c710255ca7"

    suspend fun loadMovies()=MovieDB.retrofit.loadMovies(apiKey)

}