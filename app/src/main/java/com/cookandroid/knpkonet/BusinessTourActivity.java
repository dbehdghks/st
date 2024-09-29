package com.cookandroid.knpkonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class BusinessTourActivity extends AppCompatActivity {
    private Button bizbtn, home2;
    private ImageButton imgbtn1;
    private ImageView imageview1;
    private TextView biztour, biztour1, biztour2, biztour3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.business_tour);

        initializeViews();
        setupListeners();
        setImages();
    }

    private void initializeViews() {
        bizbtn = findViewById(R.id.bizbtn);
        home2 = findViewById(R.id.home2);
        imgbtn1 = findViewById(R.id.imgbtn);
        imageview1 = findViewById(R.id.imageView1);
        biztour = findViewById(R.id.coordi);
        biztour1 = findViewById(R.id.biztour1);
        biztour2 = findViewById(R.id.biztour2);
        biztour3 = findViewById(R.id.biztour3);
    }

    private void setupListeners() {
        bizbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusinessTourActivity.this, InquireActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        home2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusinessTourActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
        imgbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BusinessTourActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
    private void setImages() {

        imageview1.setImageResource(R.drawable.businesstour);
    }

}
