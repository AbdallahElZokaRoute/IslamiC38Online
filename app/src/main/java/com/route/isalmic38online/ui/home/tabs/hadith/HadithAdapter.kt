package com.route.isalmic38online.ui.home.tabs.hadith

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.isalmic38online.databinding.ItemHadithBinding

class HadithAdapter(private var hadithList : List<Hadith>?, val listener: OnHadithClickListener) : Adapter<HadithAdapter.HadithViewHolder>(){

    inner  class  HadithViewHolder(val binding : ItemHadithBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadithViewHolder {
        val binding = ItemHadithBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return HadithViewHolder(binding)
    }

     fun bindItems(newHadithList : List<Hadith>) {
        hadithList = newHadithList
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int = hadithList?.size ?: 0

    override fun onBindViewHolder(holder: HadithViewHolder, position: Int) {
       holder.binding.hadethTitle.text = hadithList?.get(position)!!.title
        holder.binding.root.setOnClickListener { listener.onHadithClick((hadithList?.get(position)),position )}

    }


}