package com.example.block08_multipleactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final RatingBar ratingBar=(RatingBar) findViewById(R.id.ratingBar);
        Button btnView=(Button) findViewById(R.id.btnView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating=ratingBar.getRating();
                Intent gotosecond = new Intent();
                gotosecond.putExtra("star"
                         ,rating);
                gotosecond.setClass(getApplicationContext(), SecondActivity.class);
                startActivity(gotosecond);
                finish();
            }
        });
    }
}