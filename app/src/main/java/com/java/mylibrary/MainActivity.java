package com.java.mylibrary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeAllBooks, btnCurrentlyReading, btnAlreadyRead, btnWishList, btnFavorite, btnAbout;
    private TextView tvDeveloped;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Method for initializing all buttons
         */
        initButton();

        /**
         * On Click Listener for See All Books Button
         */
        btnSeeAllBooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllBooksActivity.class);
                startActivity(intent);
            }
        });

        /**
         * Method for Long Click on Message of Developed by Footer for my Bds
         */
        lclickDev();
    }


    //Method of initializing Buttons
    private void initButton() {
        btnSeeAllBooks = findViewById(R.id.btnSeeAllBooks);
        btnCurrentlyReading = findViewById(R.id.btnCurrentlyReading);
        btnAlreadyRead = findViewById(R.id.btnAlreadyRead);
        btnWishList = findViewById(R.id.btnWishList);
        btnFavorite = findViewById(R.id.btnFavorite);
        btnAbout = findViewById(R.id.btnAbout);

        tvDeveloped = findViewById(R.id.tvDeveloped);
    }

    //Method of on Long Click Text View
    private void lclickDev() {
        tvDeveloped.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "\"I LOVE YOU VERY MUCH BDS\"", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}