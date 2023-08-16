package com.route.isalmic38online.ui.home.tabs.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.route.isalmic38online.data.quran.SurahNameData
import com.route.isalmic38online.databinding.ItemChapterBinding

class ChapterNamesAdapter(val surahs : List<SurahNameData>) : Adapter<ChapterNamesAdapter.ViewHolder>() {

    inner class  ViewHolder( val binding : ItemChapterBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemChapterBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }
     var onSurahClickListener : OnSurahClickListener? = null
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.binding.surahName.text = surahs[position].name
        holder.binding.surahNumber.text = surahs[position].position.toString()

        if(onSurahClickListener != null){
            holder.binding.root.setOnClickListener { onSurahClickListener?.onClick(surahs[position]) }
        }
    }

    override fun getItemCount(): Int = surahs.size


}