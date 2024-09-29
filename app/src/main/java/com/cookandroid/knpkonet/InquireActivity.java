package com.cookandroid.knpkonet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.net.Uri;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class InquireActivity extends AppCompatActivity {
    private Button inqubtn;
    private ImageButton imgbtn8;
    private TextView inqu1, inqu2, inqu3, inqu4, inqu5, inqu6, inqu7, inqu8, inqu9;
    private EditText editTextText, editTextTextEmailAddress2, editTextText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inquire);

        inqu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = "https://www.knpkonet.com";
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailto:" + email));

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

        initializeView();
        setupListeners();
    }
    private void initializeView() {
        imgbtn8 = findViewById(R.id.imgbtn8);
        inqu1 = findViewById(R.id.inqu1);
        inqu2 = findViewById(R.id.inqu2);
        inqu3 = findViewById(R.id.inqu3);
        inqu4 = findViewById(R.id.inqu4);
        inqu5 = findViewById(R.id.inqu5);
        inqu7 = findViewById(R.id.inqu7);
        inqu8 = findViewById(R.id.inqu8);
        inqu9 = findViewById(R.id.inqu9);
        inqubtn = findViewById(R.id.inqubtn);
    }

    private void setupListeners() {
        imgbtn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(InquireActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

    }
}
