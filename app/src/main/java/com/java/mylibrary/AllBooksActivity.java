package com.java.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class AllBooksActivity extends AppCompatActivity {

    private RecyclerView booksRecView;
    private BookRecViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);

        adapter = new BookRecViewAdapter(this);
        booksRecView = findViewById(R.id.booksRecView);

        booksRecView.setAdapter(adapter);
        booksRecView.setLayoutManager(new GridLayoutManager(this, 2));

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "Two States", "Mr. Mahesh", 150, "https://www.google.com/image.jpg",
                "Short Description will be added later", "Long Description will be added later"));
        books.add(new Book(2, "Two States", "Mr. Mahesh", 150, "https://www.google.com/image.jpg",
                "Short Description will be added later", "Long Description will be added later"));
        books.add(new Book(3, "Two States", "Mr. Mahesh", 150, "https://www.google.com/image.jpg",
                "Short Description will be added later", "Long Description will be added later"));

        adapter.setBooks(books);
    }
}