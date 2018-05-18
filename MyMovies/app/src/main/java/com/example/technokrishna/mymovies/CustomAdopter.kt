package com.example.technokrishna.mymovies

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdopter(var list:ArrayList<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

//    private val header = 1
//    private val footer = 2

    companion object {
        var header = 0
        var footer = 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            header ->{
                val header = LayoutInflater.from(parent.context).inflate(R.layout.header_layout,parent,false)
                return HeaderView(header)
            }
            footer ->{
                val header = LayoutInflater.from(parent.context).inflate(R.layout.header_layout,parent,false)
                return HeaderView(header)
            }
            else ->{
                val header = LayoutInflater.from(parent.context).inflate(R.layout.video_row,parent,false)
                return HeaderView(header)
            }


        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        var user = list[position]
       when(holder){
           is NormalView ->{
                val view = holder as NormalView
                view.name.text = user.name
       }

       }
    }

    override fun getItemViewType(position: Int): Int {
        when(position){
            0 -> header
            list.size-1 -> footer=list.size-1
        }
        return position

    }

    inner class HeaderView(v: View) : RecyclerView.ViewHolder(v) {

    }

    inner class FooterView(v: View) : RecyclerView.ViewHolder(v) {

    }

    inner class NormalView(v: View) : RecyclerView.ViewHolder(v) {

        val name = v.findViewById(R.id.tvName) as TextView
    }
}
