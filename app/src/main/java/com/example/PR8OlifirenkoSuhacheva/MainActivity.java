package com.example.PR8OlifirenkoSuhacheva;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
   ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);
        setContentView(R.layout.second_layout);

        // получаемэлемент textView
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView textView = findViewById(R.id.header);
        // переустанавливаемунеготекст
        textView.setText("Hello from Java!");
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, Catalog.class);
        startActivity(intent);
    }
}

