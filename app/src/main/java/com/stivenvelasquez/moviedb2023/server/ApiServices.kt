package com.stivenvelasquez.moviedb2023.server

import com.stivenvelasquez.moviedb2023.server.model.MoviesList
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiServices {

    @GET("movie/popular")
    suspend fun  loadMovies(@Query("api_key") apiKey: String): MoviesList
}