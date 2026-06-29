package com.example.email

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class WebAdapter(private val websiteList: List<Website>) :
    RecyclerView.Adapter<WebAdapter.WebViewHolder>() {

    class WebViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgLogo: ImageView = view.findViewById(R.id.imgLogo)
        val txtName: TextView = view.findViewById(R.id.txtWebsiteName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WebViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_website, parent, false)
        return WebViewHolder(view)
    }

    override fun onBindViewHolder(holder: WebViewHolder, position: Int) {
        val website = websiteList[position]
        holder.txtName.text = website.name


        Glide.with(holder.itemView.context)
            .load(website.logoUrl)
            .placeholder(R.mipmap.ic_launcher)
            .into(holder.imgLogo)


        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, WebViewActivity::class.java)
            intent.putExtra("URL_KEY", website.url)
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = websiteList.size
}