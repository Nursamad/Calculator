package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    private TextView secondText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String text = getIntent().getStringExtra("text_key");
        secondText.setText(text);
        secondText = findViewById(R.id.tv_2activity); 
        Log.d("nur", "OnCreate SecondActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("nur", "OnStart SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("nur", "OnResume SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("nur", "OnRestart SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("nur", "OnPause SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("nur", "OnStop SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("nur", "OnDestroy SecondActivity");
    }
}