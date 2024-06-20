package com.example.PR8OlifirenkoSuhacheva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class product extends AppCompatActivity implements View.OnClickListener{
    ImageView imageView15;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
         imageView15 = findViewById(R.id.imageView15);
        imageView15.setOnClickListener(this);
         button3 = findViewById(R.id.button3);
        button3.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(this, basket.class);
        startActivity(intent);
        Intent intent2 = new Intent(this, map.class);
        startActivity(intent2);
    }
}