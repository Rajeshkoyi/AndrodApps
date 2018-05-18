package com.example.technokrishna.showtimes

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.squareup.picasso.Picasso

class TopAdopter(val moviesList: ArrayList<Movie>):RecyclerView.Adapter<TopAdopter.ItemView>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemView {
        val movieItem = LayoutInflater.from(parent.context).inflate(R.layout.top_item_layout, parent, false)
        return ItemView(view = movieItem)
    }

    override fun getItemCount(): Int {
       return moviesList.size
    }

    override fun onBindViewHolder(holder: ItemView, position: Int) {
        Picasso.with(holder.imageView.context).load(moviesList.get(position).image).resize(800, 700).centerInside().onlyScaleDown().into(holder.imageView)
    }

    inner class ItemView(view:View):RecyclerView.ViewHolder(view){
        var imageView = view.findViewById<ImageView>(R.id.imageView_id)
    }

}