package com.talex.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {
    var items: List<Any> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_my_item, parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bind(items[position] as Item)

    }

    override fun getItemCount() = items.size

}