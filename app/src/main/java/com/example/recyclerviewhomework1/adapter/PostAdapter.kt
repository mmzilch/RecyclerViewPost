package com.example.recyclerviewhomework1.adapter

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewhomework1.R
import com.example.recyclerviewhomework1.model.Post
import kotlinx.android.synthetic.main.item_post.view.*

class PostAdapter(var postList: ArrayList<Post>) :
    RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    inner class PostViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindPost(post: Post) {
            itemView.tvName.text = post.name
            itemView.profileImage.setImageResource(post.profileImage)
            itemView.tvLike.text = post.like
            itemView.tvComment.text = post.comment
            itemView.tvShare.text = post.share
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_post, parent, false)
        return PostViewHolder(view)
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        holder.bindPost(postList[position])
    }
}