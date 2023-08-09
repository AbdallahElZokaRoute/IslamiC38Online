package com.route.isalmic38online.islamiProject.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.route.isalmic38online.R
import com.route.isalmic38online.islamiProject.data.HadethData

class HadethAdapter(var hadethDataList: List<HadethData>? = null) :
    Adapter<HadethAdapter.HadethViewHolder>() {
    var onHadethClickListener: OnHadethClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HadethViewHolder {
        val inflater = LayoutInflater.from(parent.context)              // Add to Layout Right Now
        val view = inflater.inflate(R.layout.item_hadeth, parent, false)
        return HadethViewHolder(view)
    }

    override fun getItemCount(): Int {
        return hadethDataList?.size ?: 0
    }

    override fun onBindViewHolder(holder: HadethViewHolder, position: Int) {
        val item = hadethDataList?.get(position)
        holder.hadethTitleText.text = item?.title
        holder.view.setOnClickListener {
            onHadethClickListener?.onHadethOnClick(item ?: return@setOnClickListener, position)
        }
    }

    fun updateData(ahadethObjectsList: List<HadethData>) {
        this.hadethDataList = ahadethObjectsList
        notifyDataSetChanged() // Reload
    }

    class HadethViewHolder(val view: View) : ViewHolder(view) {
        val hadethTitleText: TextView = view.findViewById(R.id.hadeth_title)
    }

}