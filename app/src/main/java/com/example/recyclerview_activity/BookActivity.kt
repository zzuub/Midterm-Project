package com.example.recyclerview_activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_activity.Adapter.BookAdapter
import com.example.recyclerview_activity.Data.BookData

class BookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

        val recyclerViewBook: RecyclerView = findViewById(R.id.recyclerViewBook)

        val bookList = generateBookList()
        val bookAdapter = BookAdapter(bookList)

        recyclerViewBook.layoutManager = GridLayoutManager(this, 2)
        recyclerViewBook.adapter = bookAdapter
    }

    private fun generateBookList(): List<BookData> {
        val books = mutableListOf<BookData>()
        books.add(BookData("공정하다는 착각", R.drawable.you_book_cover))
        books.add(BookData("총, 균, 쇠", R.drawable.youu_book_cover))
        books.add(BookData("돈의 속성", R.drawable.youuu_book_cover))
        books.add(BookData("수축사회", R.drawable.youuuu_book_cover))
        books.add(BookData("시선으로부터", R.drawable.youuuuu_book_cover))
        books.add(BookData("트렌드코리아 2024", R.drawable.youuuuuu_book_cover))

        return books
    }
}