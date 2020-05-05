package com.example.android_semina2_practice

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class InstaAdapter(private val context : Context) : RecyclerView.Adapter<InstaViewHolder>() {
    var datas = mutableListOf<instaData>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InstaViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_insta,parent, false)
        return InstaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: InstaViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}