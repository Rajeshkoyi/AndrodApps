package com.example.technokrishna.showtimes

import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import com.squareup.picasso.Picasso


class MovieAdopter(private val moviesList: ArrayList<Movie>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    companion object {
        val header = 0
        var footer = -1
    }
    var recyclerView:RecyclerView? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
         when(viewType){
            header -> {
                val header = LayoutInflater.from(parent.context).inflate(R.layout.top_layout, parent, false)
                recyclerView = header.findViewById(R.id.top_recyclerView) as RecyclerView
                recyclerView?.layoutManager = LinearLayoutManager(header.context,0,false)
                return HeaderView(header)
            }
             footer -> {
                 val header = LayoutInflater.from(parent.context).inflate(R.layout.top_layout, parent, false)
                 recyclerView = header.findViewById(R.id.top_recyclerView) as RecyclerView
                 recyclerView?.layoutManager = LinearLayoutManager(header.context,0,false)
                 return HeaderView(header)
             }
            else -> {
                val movieItem = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
                return ItemView(view = movieItem)
            }
         }

    }

    override fun getItemCount(): Int {
        return moviesList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is HeaderView -> {
                recyclerView?.adapter = TopAdopter(MoviesData.moviesList())
            }
            else -> {
                val movie = moviesList[position]
                var itemView = holder as ItemView
                Picasso.with(itemView.itemPic.context).load(movie.image).resize(800, 700).centerInside().onlyScaleDown().into(holder.itemPic)
            }

        }

    }


    inner class ItemView(view: View) : RecyclerView.ViewHolder(view) {
        var itemPic = view.findViewById(R.id.ivImage) as ImageView
    }

    inner class HeaderView(view: View) : RecyclerView.ViewHolder(view) {
        var itemPic = view.findViewById(R.id.top_layout_id) as LinearLayout

    }

    override fun getItemViewType(position: Int): Int {
        when(position){
            0 -> header
            moviesList.size-1 -> footer = moviesList.size-1
        }
        return position
    }

    fun show(msg:String){
        Log.v("msg",msg )
    }

}
