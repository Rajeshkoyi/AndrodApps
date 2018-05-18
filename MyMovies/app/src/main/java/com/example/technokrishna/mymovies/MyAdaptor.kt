package com.example.technokrishna.mymovies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup


class MyAdaptor : RecyclerView.Adapter<CustomView>() {

    private val header: Int = 1
    private val footer: Int = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomView {
        if(viewType==header) {

        } else if(viewType == footer) {

        }
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.top_layout, parent, false)

        return CustomView(cellForRow)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: CustomView, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        if (position == 0) {
            return header
        } else if (position == 10) {
            return footer
        }
        return 0
    }

}