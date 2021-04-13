package com.example.senpai

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.graphics.drawable.toDrawable
import androidx.core.view.LayoutInflaterCompat
import androidx.recyclerview.widget.RecyclerView

class SenpaiViewHolder(item:View):RecyclerView.ViewHolder(item){
   val textView=item.findViewById<TextView>(R.id.word)
   val genreView=item.findViewById<TextView>(R.id.anime)
   val imageView=item.findViewById<ImageView>(R.id.image)
    fun bind(item:DataSenpai){
        textView.setText(item.name)
        genreView.setText(item.anime)
        imageView.setImageResource(item.photo)
    }
}

class SenpaiAdapter(private val data: List<DataSenpai>):RecyclerView.Adapter<SenpaiViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):SenpaiViewHolder {
      val layoutInflator=LayoutInflater.from(parent.context)
        val view=layoutInflator.inflate(R.layout.itemlayout,parent,false)
        return SenpaiViewHolder(view)
    }

    override fun onBindViewHolder(holder: SenpaiViewHolder, position: Int) {
                var item=data[position]
                holder.bind(item)
            }

    override fun getItemCount()=data.size
}