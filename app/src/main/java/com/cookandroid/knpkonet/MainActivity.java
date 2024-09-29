package com.cookandroid.knpkonet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private ImageButton menuButton, prevButton, nextButton;
    private TextView logoText;
    private Button CompanyIntro, businessTour, museumTour, tourProgram, coordinator;
    private ViewPager2 imageSlider;
    private ImageView[] paginationDots;
    private TextView contactInfo;
    private List<Integer> imageList;
    private int currentPage = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeViews();
        setupListeners();
        setupImageSlider();
    }

    private void initializeViews() {
        menuButton = findViewById(R.id.menuButton);
        logoText = findViewById(R.id.logoText);
        CompanyIntro = findViewById(R.id.CompanyIntro);
        businessTour = findViewById(R.id.businessTour);
        museumTour = findViewById(R.id.museumTour);
        tourProgram = findViewById(R.id.tourProgram);
        coordinator = findViewById(R.id.coordinator);

        imageSlider = findViewById(R.id.imageSlider);
        prevButton = findViewById(R.id.prevButton);
        nextButton = findViewById(R.id.nextButton);

        //imageSlider = new ImageView[3];
        //imageSlider[0] = findViewById(R.id.imageView4);
        //imageSlider[1] = findViewById(R.id.imageView5);

        paginationDots = new ImageView[4];
        paginationDots[0] = findViewById(R.id.dot1);
        paginationDots[1] = findViewById(R.id.dot2);
        paginationDots[2] = findViewById(R.id.dot3);
        paginationDots[3] = findViewById(R.id.dot4);

        contactInfo = findViewById(R.id.contactInfo);
    }
    private void setupImageSlider() {
        imageList = new ArrayList<>();
        imageList.add(R.drawable.ciimage1);
        imageList.add(R.drawable.ciimage2);
        imageList.add(R.drawable.ciimage3);
        imageList.add(R.drawable.ciimage4);

        ImageSliderAdapter adapter = new ImageSliderAdapter(this, imageList);
        imageSlider.setAdapter(adapter);

        imageSlider.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                currentPage = position;
                updatePaginationDots();
            }
        });
    }

    private void setupListeners() {
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //메뉴 버튼 클릭 시 MenuActivity로 전환
                Intent intent = new Intent(MainActivity.this, MenuButtonActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        CompanyIntro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CompanyIntroActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        businessTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BusinessTourActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        museumTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MuseumTourActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        tourProgram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TourProgramActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        coordinator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LocalCoordinatingActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPage > 0) {
                    imageSlider.setCurrentItem(currentPage - 1);
                }
            }
        });
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (currentPage < imageList.size() - 1) {
                    imageSlider.setCurrentItem(currentPage + 1);
                }
            }
        });
    }
    private void updatePaginationDots() {
        for (int i=0; i < paginationDots.length; i++) {
            if (i == currentPage) {
                paginationDots[i].setImageResource(R.drawable.dot_active);
            } else {
                paginationDots[i].setImageResource(R.drawable.dot_inactive);
            }
        }
    }
}

