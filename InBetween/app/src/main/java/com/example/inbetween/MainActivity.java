package com.example.inbetween;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void master(int a, int b){
        int c = a + b;
    }
    public void master1(int a, int b){
        int c = a + b;
    }

}