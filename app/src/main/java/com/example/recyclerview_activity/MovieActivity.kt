package com.example.recyclerview_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_activity.Adapter.MovieAdapter
import com.example.recyclerview_activity.Data.MovieData

class MovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val recyclerView = findViewById<RecyclerView>(R.id.movieRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        val movieDataList: List<MovieData> = getMovieData()
        recyclerView.adapter = MovieAdapter(movieDataList)
    }

    private fun getMovieData(): List<MovieData> {
        return listOf(
            MovieData("30일", "2023.10.03", R.drawable.my_movie_poster),
            MovieData("극한직업", "2019.01.23", R.drawable.myy_movie_poster),
            MovieData("헌트", "2022.08.10", R.drawable.myyy_movie_poster)
        )
    }
}