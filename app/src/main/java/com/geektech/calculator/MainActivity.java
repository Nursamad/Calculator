package com.geektech.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnOpen;
    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResult = findViewById(R.id.tv_result); //0

        btnOpen.findViewById(R.id.btn_open);   //BOTTON

        btnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                String text = btnOpen.getText().toString();
                intent.putExtra("text_key" , text);
                startActivity(intent);
            }
        });
        Log.d("nur", "OnCreate MainActivity");
    }






    @Override
    protected void onStart() {
        super.onStart();
        Log.d("nur", "OnStart MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("nur", "OnResume MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("nur", "OnRestart MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("nur", "OnPause MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("nur", "OnStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("nur", "OnDestroy MainActivity");
    }

    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_zero:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                break;
            case R.id.btn_one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                break;
            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                break;
            case R.id.btn_three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                break;
            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                break;
            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                break;
            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                break;
            case R.id.btn_seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                break;
            case R.id.btn_eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                break;
            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                break;
            case R.id.btn_clear:
                tvResult.setText("0");
                break;

        }
    }

    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_division:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "/");
                operation = "/";
                break;
            case R.id.btn_multiplication:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "*");
                operation = "*";
                break;
            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "-");
                operation = "-";
                break;
            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                tvResult.setText(firstValue + "+");
                operation = "+";
                break;
            case R.id.btn_equals:
                String second = tvResult.getText().toString().replace(firstValue + operation, "");
                secondValue = Integer.parseInt(second);
                switch (operation) {
                    case "+":
                        tvResult.setText(firstValue + operation + secondValue + "=" + (firstValue + secondValue));
                        break;
                    case "-":
                        tvResult.setText(firstValue + operation + secondValue + "=" + (firstValue - secondValue));
                        break;
                    case "*":
                        tvResult.setText(firstValue + operation + secondValue + "=" + (firstValue * secondValue));
                        break;
                    case "/":
                        tvResult.setText(firstValue + operation + secondValue + "=" + (firstValue / secondValue));
                        break;
                }
        }
    }
}