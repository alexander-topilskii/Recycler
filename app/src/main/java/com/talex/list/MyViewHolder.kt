package com.talex.list

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(item: Item) {
        view.findViewById<TextView>(R.id.itemText).text = item.id.toString()
    }

}