package com.example.technokrishna.showtimes

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.StaggeredGridLayoutManager
import android.view.Menu
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var moviesList  = ArrayList<Movie>()

    override fun onContextMenuClosed(menu: Menu?) {
        super.onContextMenuClosed(menu)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        moviesList = MoviesData.moviesList()
//        recyclerView_top.layoutManager = LinearLayoutManager(this,0,false)
//        recyclerView_top.adapter = MovieAdopter(moviesList)

        recyclerView_menu.layoutManager = LinearLayoutManager(this,1,false)
         recyclerView_menu.adapter = MovieAdopter(moviesList)
    }
}
