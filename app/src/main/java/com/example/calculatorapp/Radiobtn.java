package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Radiobtn extends AppCompatActivity implements View.OnClickListener {


    RadioButton radioButton1,radioButton2,radioButton3;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiobtn);


        radioButton1 = findViewById(R.id.imgBird);
        radioButton2 = findViewById(R.id.imgTiger);
        radioButton3 = findViewById(R.id.imgSnake);
        imageView = findViewById(R.id.imageView);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.imgBird :
                imageView.setImageResource(R.drawable.bird);
                break;

            case R.id.imgTiger :
                imageView.setImageResource(R.drawable.tiger);
                break;

            case R.id.imgSnake :
                imageView.setImageResource(R.drawable.snake);
                break;
        }
    }
}
