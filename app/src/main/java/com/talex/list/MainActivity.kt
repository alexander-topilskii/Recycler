package com.talex.list

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    val viewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter = MyAdapter()
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)

    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onResume() {
        super.onResume()
        viewModel.items.observe(this, {
            findViewById<RecyclerView>(R.id.recyclerView).apply {
                (adapter as MyAdapter).items = it
                (adapter as MyAdapter).notifyDataSetChanged()
            }
        })
    }

}


