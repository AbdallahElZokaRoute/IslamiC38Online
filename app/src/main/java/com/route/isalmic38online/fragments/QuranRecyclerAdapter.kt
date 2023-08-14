package com.route.isalmic38online.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.route.isalmic38online.databinding.ItemSurahBinding

class QuranRecyclerAdapter(val items: Array<Array<String>>) : RecyclerView.Adapter<QuranRecyclerAdapter.ViewHolder>() {

    class ViewHolder(var viewBinding: ItemSurahBinding) : RecyclerView.ViewHolder(viewBinding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding  = ItemSurahBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(viewBinding)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.viewBinding.surahTitle.text = items[position][0]
        holder.viewBinding.surahCount.text = items[position][1]
    }
    override fun getItemCount(): Int = items.size
}