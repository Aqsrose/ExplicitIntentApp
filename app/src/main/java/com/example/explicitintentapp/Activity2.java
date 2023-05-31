package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnBack=findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                btnBack.setOnClickListener((view)->{
                    //if cancel is pressed, simply set activity result to RESULT_CANCELED

                    Activity2.this.finish(); //and then exit the activity
                });

            }
        });
    }
}