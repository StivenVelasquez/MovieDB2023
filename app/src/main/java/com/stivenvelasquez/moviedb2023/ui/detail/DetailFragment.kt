package com.stivenvelasquez.moviedb2023.ui.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.squareup.picasso.Picasso
import com.stivenvelasquez.moviedb2023.R
import com.stivenvelasquez.moviedb2023.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {


    private lateinit var detailviewModel: DetailViewModel
    private lateinit var detailBinding: FragmentDetailBinding
    private val arg: DetailFragmentArgs by navArgs()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        detailviewModel = ViewModelProvider(this)[DetailViewModel::class.java]
        detailBinding= FragmentDetailBinding.inflate(inflater, container, false)
        val view= detailBinding.root

        val movie = arg.movie

        with(detailBinding){
            titleTextView.text=movie.title
            releaseDateTextView.text= "Release date:" + movie.releaseDate
            voteAverageTextView.text="Vote average: "+ movie.voteAverage.toString()
            summaryTextView.text= movie.overview
            Picasso.get().load("https://image.tmdb.org/t/p/w500/" + movie.posterPath).into(posterImageView)
        }
        return view
    }

}