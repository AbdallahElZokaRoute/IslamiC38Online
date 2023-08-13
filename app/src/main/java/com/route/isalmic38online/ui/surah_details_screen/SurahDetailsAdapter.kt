package com.route.isalmic38online.ui.surah_details_screen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.route.isalmic38online.databinding.ItemVerseBinding

class SurahDetailsAdapter(var versesList : List<String>?) : Adapter<SurahDetailsAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : ItemVerseBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val   binding = ItemVerseBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return  ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.verseTv.text = versesList?.get(position) ?: ""

    }

    fun onUpdateData(versesList : List<String>){
        this.versesList = versesList
    }

    override fun getItemCount(): Int = versesList?.size ?: 0

}