package com.example.technokrishna.mymovies

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gridLayout = GridLayoutManager(this,1,GridLayout.HORIZONTAL,false)

        recyclerView_top.layoutManager = gridLayout
        recyclerView_top.adapter = MyAdaptor()
        header_footer()
       }

    fun header_footer(){
        var list = ArrayList<User>()
        list.add(User("Rajesh",1))
        list.add(User("venky",2))
        list.add(User("naveed",3))
        list.add(User("vinod",4))
        list.add(User("nivas",5))
        list.add(User("bharath",6))
        list.add(User("siva",7))
        list.add(User("satya",8))

        recyclerView_menu.layoutManager  = LinearLayoutManager(this)
        recyclerView_menu.adapter = CustomAdopter(list)
    }

}
