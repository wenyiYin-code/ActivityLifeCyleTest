package com.example.activitylifecyletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class NormalActivity extends AppCompatActivity {

    private static final String TAG = "NormalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",0);
        Log.d(TAG, "name:"+ name + " age:" + age);
    }
}