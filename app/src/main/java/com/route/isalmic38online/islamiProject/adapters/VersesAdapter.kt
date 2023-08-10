package com.route.isalmic38online.islamiProject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.isalmic38online.R

class VersesAdapter(var versesList: List<String>? = null) :
    Adapter<VersesAdapter.VersesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VersesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_verse, parent, false)
        return VersesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return versesList?.size ?: 0
    }


    override fun onBindViewHolder(holder: VersesViewHolder, position: Int) {
        holder.verseTextView.text = versesList?.get(position)
    }

    fun updateData(versesList: List<String>?) {
        this.versesList = versesList
        notifyDataSetChanged()
        // Adapter -> Reload
    }

    class VersesViewHolder(val view: View) : ViewHolder(view) {
        val verseTextView: TextView = view.findViewById(R.id.verse_text)
    }


}
