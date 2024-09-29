package com.cookandroid.knpkonet;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MuseumTourActivity extends AppCompatActivity {
    private ImageButton imgbtn3;
    private TextView mu1, mu2, mu3, mu4, mu5, mu6, mu7, mu8, mu9, mu10, mu11;
    private ImageView imgmu1, imgmu2, imgmu3, imgmu4, imgmu5, imgmu6;
    private Button mubtn, home3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.museum_tour);

        initializeViews();
        setupListeners();
        setImages();
    }

    private void initializeViews() {
        mubtn = findViewById(R.id.mubtn);
        home3 = findViewById(R.id.home3);

        imgmu1 = findViewById(R.id.imgmu1);
        imgmu2 = findViewById(R.id.imgmu2);
        imgmu3 = findViewById(R.id.imgmu3);
        imgmu4 = findViewById(R.id.imgmu4);
        imgmu5 = findViewById(R.id.imgmu5);
        imgmu6 = findViewById(R.id.imgmu6);

        mu1 = findViewById(R.id.mu1);
        mu2 = findViewById(R.id.mu2);
        mu3 = findViewById(R.id.mu3);
        mu4 = findViewById(R.id.mu4);
        mu5 = findViewById(R.id.mu5);
        mu6 = findViewById(R.id.mu6);
        mu7 = findViewById(R.id.mu7);
        mu8 = findViewById(R.id.mu8);
        mu9 = findViewById(R.id.mu9);
        mu10 = findViewById(R.id.mu10);
        mu11 = findViewById(R.id.mu11);

        imgbtn3 = findViewById(R.id.imgbtn3);
    }
    private void setupListeners() {
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTourActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
        imgbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTourActivity.this, MenuButtonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        mubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MuseumTourActivity.this, InquireActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
    private void setImages() {
        imgmu1.setImageResource(R.drawable.rijksmuseum);
        imgmu2.setImageResource(R.drawable.gogh);
        imgmu3.setImageResource(R.drawable.mauritshuis);
        imgmu4.setImageResource(R.drawable.park);
        imgmu5.setImageResource(R.drawable.ocean);
        imgmu6.setImageResource(R.drawable.lammuseum);
    }
}
