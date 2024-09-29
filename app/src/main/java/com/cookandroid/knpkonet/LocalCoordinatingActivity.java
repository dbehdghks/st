package com.cookandroid.knpkonet;

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

public class LocalCoordinatingActivity extends AppCompatActivity {
    private Button btnlocal;
    private TextView coordi, coordi1, coordi2, coordi3;
    private ImageButton imgbtn;
    private ImageView imglocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local_coordinating);

        initializeViews();
        setupListeners();
        setImages();
    }
    private void initializeViews() {
        btnlocal = findViewById(R.id.btnlocal);
        coordi = findViewById(R.id.coordi);
        coordi1 = findViewById(R.id.coordi1);
        coordi2 = findViewById(R.id.coordi2);
        coordi3 = findViewById(R.id.coordi3);

        imgbtn = findViewById(R.id.imgbtn);
        imglocal = findViewById(R.id.imglocal);
    }
    private void setupListeners() {
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalCoordinatingActivity.this, MenuButtonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        btnlocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LocalCoordinatingActivity.this, InquireActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
    private void setImages() {
        imglocal.setImageResource(R.drawable.localcoordi);
    }
}
