package com.cookandroid.knpkonet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MenuButtonActivity extends AppCompatActivity {
    private TextView companyIntro, businessTour, museumTour, tourProgram, usefulPlaces, localCoordinating, inquiry;
    private Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_button);

        initializeViews();
        setupListeners();
    }

    private void initializeViews() {
        companyIntro = findViewById(R.id.textView3);
        businessTour = findViewById(R.id.textView4);
        museumTour = findViewById(R.id.textView5);
        tourProgram = findViewById(R.id.textView6);
        usefulPlaces = findViewById(R.id.textView);
        localCoordinating = findViewById(R.id.textView7);
        inquiry = findViewById(R.id.textView8);
        btnHome = findViewById(R.id.btnHome);
    }

    private void setupListeners() {
        View.OnClickListener menuItemClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "";
                if (v.getId() == R.id.textView3) {
                    message = "회사소개 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView4) {
                    message = "비즈니스 투어 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView5) {
                    message = "미술, 박물관 투어 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView6) {
                    message = "투어 프로그램 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView) {
                    message = "한국과 관련된 유용한 장소들 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView7) {
                    message = "현지 코디네이팅 페이지로 이동합니다.";
                } else if (v.getId() == R.id.textView8) {
                    message = "문의하기 페이지로 이동합니다.";
                }
                Toast.makeText(MenuButtonActivity.this, "메뉴", Toast.LENGTH_SHORT).show();
            }
        };

        companyIntro.setOnClickListener(menuItemClickListener);
        businessTour.setOnClickListener(menuItemClickListener);
        museumTour.setOnClickListener(menuItemClickListener);
        tourProgram.setOnClickListener(menuItemClickListener);
        usefulPlaces.setOnClickListener(menuItemClickListener);
        localCoordinating.setOnClickListener(menuItemClickListener);
        inquiry.setOnClickListener(menuItemClickListener);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //MainActivity로 돌아가기
                Intent intent = new Intent(MenuButtonActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }
        });
    }
}
