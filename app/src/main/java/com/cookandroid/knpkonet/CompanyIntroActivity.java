package com.cookandroid.knpkonet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CompanyIntroActivity extends AppCompatActivity {
    private Button home1;
    private TextView coinfo, ceoinfo1, ceoinfo2, ceoinfo3, ci1, ci2, ci3, ci4;
    private ImageView ciimage1, ciimage2, ciimage3, ciimage4;
    private ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.company_intro);

        initializeViews();
        setupListeners();
        setImages();
    }
    private void initializeViews() {
        home1 = findViewById(R.id.home1);
        coinfo = findViewById(R.id.coinfo);
        ceoinfo1 = findViewById(R.id.ceoinfo1);
        ceoinfo2 = findViewById(R.id.ceoinfo2);
        ceoinfo3 = findViewById(R.id.ceoinfo3);
        ci1 = findViewById(R.id.ci1);
        ci2 = findViewById(R.id.ci2);
        ci3 = findViewById(R.id.ci3);
        ci4 = findViewById(R.id.ci4);
        ciimage1 = findViewById(R.id.ciimage1);
        ciimage2 = findViewById(R.id.ciimage2);
        ciimage3 = findViewById(R.id.ciimage3);
        ciimage4 = findViewById(R.id.ciimage4);
        imgbtn = findViewById(R.id.imgbtn3);
    }

    private void setupListeners() {
        View.OnClickListener goToMainListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CompanyIntroActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };
        home1.setOnClickListener(goToMainListener);
        imgbtn.setOnClickListener(goToMainListener);


    }
    private void setImages() {
        ciimage1.setImageResource(R.drawable.ciimage1);
        ciimage2.setImageResource(R.drawable.ciimage2);
        ciimage3.setImageResource(R.drawable.ciimage3);
        ciimage4.setImageResource(R.drawable.ciimage4);
    }
}
