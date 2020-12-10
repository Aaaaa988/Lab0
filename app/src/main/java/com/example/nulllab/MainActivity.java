package com.example.nulllab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int min(int a, int b){
        return Math.min(a, b);
    }

    public int max(int a, int b){
        return Math.max(a, b);
    }

}