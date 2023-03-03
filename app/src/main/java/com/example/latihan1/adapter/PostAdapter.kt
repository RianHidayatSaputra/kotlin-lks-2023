package com.example.latihan1.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan1.R
import com.example.latihan1.databinding.ActivityItemsBinding
import com.example.latihan1.responses.PostResponse

class PostAdapter(private val list: ArrayList<PostResponse>):RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    private lateinit var binding: ActivityItemsBinding
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bind(PostResponse: PostResponse) {
            with(itemView) {
                val text = "id: ${PostResponse.id}\n" +
                        "title: ${PostResponse.title}\n" +
                        "body: ${PostResponse.body}"
                binding.tvText.text = text
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_posts, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bind(list[position])
    }
}