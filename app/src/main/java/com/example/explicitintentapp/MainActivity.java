package com.example.explicitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnAct, btnWeb;
    EditText btnurl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAct=findViewById(R.id.btnAct);
        btnWeb = findViewById(R.id.btnWeb);
        btnurl=findViewById(R.id.url);
        btnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity.this, com.example.explicitintentapp.Activity2.class);
                startActivity(intent);
            }
        });
        btnWeb.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = btnurl.getText() + "";
                //also, passing a url, so it must be some kind of browser that can open it
                // "http://www.google.com"
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}