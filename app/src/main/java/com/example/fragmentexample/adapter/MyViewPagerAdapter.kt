package com.example.fragmentexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.fragmentexample.R

class MyViewPagerAdapter (public val context: Context) : RecyclerView.Adapter<MyViewPagerAdapter.MyViewHolder>() {


    val color_icon_matrix = arrayOf(

        intArrayOf(android.R.color.holo_red_dark, R.drawable.ic_baseline_account_box_24),
        intArrayOf(android.R.color.holo_blue_dark, R.drawable.ic_baseline_attach_money_24),
        intArrayOf(android.R.color.holo_green_dark, R.drawable.ic_baseline_directions_car_24),
        intArrayOf(android.R.color.holo_orange_dark,R.drawable.ic_baseline_location_on_24)

    )

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var img_View: ImageView
        lateinit var container : ConstraintLayout

        init {
            img_View = itemView.findViewById(R.id.imgImage) as ImageView
            container = itemView.findViewById(R.id.ctlMain) as ConstraintLayout
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_page,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.img_View.setImageResource(color_icon_matrix[position][1])
        holder.container.setBackgroundResource(color_icon_matrix[position][0])
    }

    override fun getItemCount(): Int {
        return color_icon_matrix.size
    }

}