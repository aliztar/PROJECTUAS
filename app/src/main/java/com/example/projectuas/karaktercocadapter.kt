package com.example.projectuas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class karaktercocadapter (private val context: Context, private val namakota: List<karaktercoc>, val listener: (karaktercoc)-> Unit)
    : RecyclerView.Adapter<karaktercocadapter.namakotaViewHolder>(){
    class namakotaViewHolder (view: View): RecyclerView.ViewHolder(view) {

        val imgkaraktercoc = view.findViewById<ImageView>(R.id.img_item_photo)
        val namekaraktercoc = view.findViewById<TextView>(R.id.tv_item_name)
        val desckaraktercoc = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(namakota: karaktercoc, listener: (karaktercoc) ->Unit) {
            imgkaraktercoc.setImageResource(namakota.imgkaraktercoc)
            namekaraktercoc.text = namakota.namekaraktercoc
            desckaraktercoc.text = namakota.desckaraktercoc
            itemView.setOnClickListener {
                listener(namakota)}
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): namakotaViewHolder {
        return namakotaViewHolder(
            LayoutInflater.from(context).inflate(R.layout.list_karaktercoc, parent, false)
        )
    }

    override fun onBindViewHolder(holder: namakotaViewHolder, position: Int) {
        holder.bindView(namakota[position], listener)
    }

    override fun getItemCount(): Int = namakota.size
    }
