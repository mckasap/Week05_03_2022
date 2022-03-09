package com.example.week05_03_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CountDownTimer cdt= new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                Toast.makeText(MainActivity.this,"Kalan Süre: "+(l)/1000,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFinish() {
                Toast.makeText(MainActivity.this,"Finitto",Toast.LENGTH_SHORT).show();

            }
        };
    cdt.start();
    }
}