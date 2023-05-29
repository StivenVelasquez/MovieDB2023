package com.stivenvelasquez.moviedb2023.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import com.stivenvelasquez.moviedb2023.local.model.LocalMovie

@Dao
interface MovieDao {

    @Insert
    suspend fun SaveMovie(move: LocalMovie)

    @Delete
    suspend fun deleteMovie(movie: LocalMovie)

}