package com.example.utspraktik_if10k_10119176_muhammadfauzanfadhlulbarr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 6 Juni 2022
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }


    public void next (View view){
        Intent intent = new Intent(this, DataActivity.class);
        startActivity(intent);
    }
}