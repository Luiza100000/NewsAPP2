package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.newsapp.Models.NewsHeadLines;
import com.squareup.picasso.Picasso;

public class DetailsActivity extends AppCompatActivity {

    NewsHeadLines headLines;
    TextView txt_title, txt_time, txt_detail, txt_content;
    ImageView img_news;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        txt_title = findViewById(R.id.text_detail_title);
        txt_detail = findViewById(R.id.text_detail_detail);
        txt_detail = findViewById(R.id.text_detail_detail);
        img_news = findViewById(R.id.img_detail_news);

        headLines = (NewsHeadLines) getIntent().getSerializableExtra("data");

        txt_title.setText(headLines.getTitle());
        txt_detail.setText(headLines.getDescription());
        Picasso.get().load(headLines.getFirst_image().getImage()).into(img_news);
    }
}