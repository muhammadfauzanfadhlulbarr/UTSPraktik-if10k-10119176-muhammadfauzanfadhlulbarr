package com.example.utspraktik_if10k_10119176_muhammadfauzanfadhlulbarr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//Muhammad Fauzan Fadhlulbarr | IF10K | 10119176 | 6 Juni 2022
public class CustomDialog extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        getSupportActionBar().hide();


    }
    public void ok (View view){
        moveTaskToBack(true);
        finish();
        System.exit(0);
    }


}