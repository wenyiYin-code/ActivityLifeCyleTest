package com.example.activitylifecyletest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");

        setContentView(R.layout.activity_main);

        /*add for get data*/
        if(savedInstanceState != null){
            String tempData = savedInstanceState.getString("data_key");
            Log.d(TAG, "get data:" + tempData);
        }

        Button startNormalActivity = (Button) findViewById(R.id.start_normal_activity);
        Button startDialogActivity = (Button) findViewById(R.id.start_dialog_activity);

        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,NormalActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("name","wenyiYin");
                bundle.putInt("age",16);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        startDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DialogActivity.class);
                startActivity(intent);
            }
        });
    }

    /*add for save data*/
    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key",tempData);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    

}