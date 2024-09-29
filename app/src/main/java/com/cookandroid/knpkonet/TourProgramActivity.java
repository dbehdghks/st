package com.cookandroid.knpkonet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class TourProgramActivity extends AppCompatActivity {
    private Button tourbtn;
    private TextView tourpro, tourpro1, tourpro2, tourpro3, tourpro4, tourpro5;
    private ImageButton imgbtn1;
    private ImageView imgtour1, imgtour2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tour_program);

        initializeView();
        setupListeners();
        setImages();
    }

    private void initializeView() {
        tourbtn = findViewById(R.id.tourbtn);
        tourpro = findViewById(R.id.coordi);
        tourpro1 = findViewById(R.id.tourpro1);
        tourpro2 = findViewById(R.id.tourpro2);
        tourpro3 = findViewById(R.id.tourpro3);
        tourpro4 = findViewById(R.id.tourpro4);
        tourpro5 = findViewById(R.id.tourpro5);
        imgbtn1 = findViewById(R.id.imgbtn);
        imgtour1 = findViewById(R.id.imgtour1);
        imgtour2 = findViewById(R.id.imgtour2);
    }
    private void setupListeners() {
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TourProgramActivity.this, MenuButtonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        tourbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TourProgramActivity.this, InquireActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
    private void setImages() {
        imgtour1.setImageResource(R.drawable.touratt);
        imgtour2.setImageResource(R.drawable.fair);

    }
}
