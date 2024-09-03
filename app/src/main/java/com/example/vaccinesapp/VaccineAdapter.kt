package com.example.vaccinesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VaccineAdapter(val itemList: ArrayList<VaccineModel>) : RecyclerView.Adapter<VaccineAdapter.VaccineViewHolder>() {

    inner class VaccineViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var imageView: ImageView
        lateinit var title: TextView

        init{
            imageView = itemView.findViewById(R.id.image)
            title = itemView.findViewById(R.id.title)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VaccineViewHolder {
        val viewHolder = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item, parent, false)

        return VaccineViewHolder(viewHolder)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: VaccineViewHolder, position: Int) {
        holder.title.setText(itemList[position].name)
        holder.imageView.setImageResource(itemList[position].img)
    }

}