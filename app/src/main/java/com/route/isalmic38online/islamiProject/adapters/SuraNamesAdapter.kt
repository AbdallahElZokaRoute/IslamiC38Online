package com.route.isalmic38online.islamiProject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.data.SuraNameData

class SuraNamesAdapter(
    val suraNamesList: List<SuraNameData>
) : Adapter<SuraNamesAdapter.SuraNameViewHolder>() {
    var onSuraClickListener: OnSuraClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuraNameViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_sura_name, parent, false)
        return SuraNameViewHolder(view)
    }

    override fun getItemCount(): Int {
        return suraNamesList.size
    }

    override fun onBindViewHolder(holder: SuraNameViewHolder, position: Int) {
        val item = suraNamesList.get(position)
        holder.suraNameText.text = item.name
        holder.suraPositionText.text = "${item.position}"
        holder.view.setOnClickListener {
            onSuraClickListener?.onSuraClick(item)
        }
    }

    class SuraNameViewHolder(val view: View) : ViewHolder(view) {
        val suraNameText: TextView = view.findViewById(R.id.sura_name)
        val suraPositionText: TextView = view.findViewById(R.id.sura_position)

    }


}