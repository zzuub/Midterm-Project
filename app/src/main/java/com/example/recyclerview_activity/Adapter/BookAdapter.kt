package com.example.recyclerview_activity.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclerview_activity.Data.BookData
import com.example.recyclerview_activity.R

class BookAdapter(private val bookList: List<BookData>) :
    RecyclerView.Adapter<BookAdapter.BookViewHolder>() {

    class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val bookImage: ImageView = itemView.findViewById(R.id.bookImage)
        val bookTitle: TextView = itemView.findViewById(R.id.bookTitle)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val bookData = bookList[position]
        holder.bookTitle.text = bookData.title

        Glide.with(holder.itemView.context)
            .load(bookData.imageUrl)
            .placeholder(R.drawable.you_book_cover)
            .error(R.drawable.you_book_cover)
            .into(holder.bookImage)
    }

    override fun getItemCount(): Int {
        return bookList.size
    }
}